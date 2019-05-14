package vn.toeic.controller.admin;

import org.apache.log4j.Logger;
import vn.toeic.command.UserCommand;
import vn.toeic.core.common.utils.SessionUtil;
import vn.toeic.core.datatranferobject.UserDTO;
import vn.toeic.core.datatranferobject.UserImportDTO;
import vn.toeic.core.web.common.WebConstant;
import vn.toeic.core.web.utils.FormUtil;
import vn.toeic.core.web.utils.RequestUtil;
import vn.toeic.core.web.utils.SingletonServiceUtil;
import vn.toeic.core.web.utils.WebCommonUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

@WebServlet(urlPatterns = {"/admin-user-list.html", "/ajax-admin-user-edit.html", "/admin-user-import.html",
        "/admin-user-import-validate.html"})
public class UserController extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());
    private final String SHOW_IMPORT_USER = "show_import_user";
    private final String READ_EXCEL = "read_excel";
    private final String VALIDATE_IMPORT = "validate_import";
    private final String LIST_USER_IMPORT = "list_user_import";
    private final String IMPORT_DATA = "import_data";
    ResourceBundle bundle = ResourceBundle.getBundle("ResourcesBundle");

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserCommand command = FormUtil.populate(UserCommand.class, request);
        UserDTO pojo = command.getPojo();
        if (command.getUrlType() != null && command.getUrlType().equals(WebConstant.URL_LIST)) {
            Map<String, Object> mapProperty = new HashMap<String, Object>();
            RequestUtil.initSearchBean(request, command);
            Object[] objects = SingletonServiceUtil.getUserServiceInstance().findByProperty(mapProperty, command.getSortExpression(), command.getSortDirection(), command.getFirstItem(), command.getMaxPageItems());
            command.setListResult((List<UserDTO>) objects[1]);
            command.setTotalItems(Integer.parseInt(objects[0].toString()));
            request.setAttribute(WebConstant.LIST_ITEMS, command);
            if (command.getCrudaction() != null) {
                Map<String, String> mapMessage = buidMapRedirectMessage(bundle);
                WebCommonUtil.addRedirectMessage(request, command.getCrudaction(), mapMessage);
            }
            RequestDispatcher rd = request.getRequestDispatcher("/views/admin/user/list.jsp");
            rd.forward(request, response);
        } else if (command.getUrlType() != null && command.getUrlType().equals(WebConstant.URL_EDIT)) {
            if (pojo != null && pojo.getUserId() != null) {
                command.setPojo(SingletonServiceUtil.getUserServiceInstance().findById(pojo.getUserId()));
            }
            command.setRoles(SingletonServiceUtil.getRoleServiceInstance().findAll());
            request.setAttribute(WebConstant.FORM_ITEM, command);
            RequestDispatcher rd = request.getRequestDispatcher("/views/admin/user/edit.jsp");
            rd.forward(request, response);
        } else if (command.getUrlType()!= null && command.getUrlType().equals(SHOW_IMPORT_USER)){
            RequestDispatcher rd = request.getRequestDispatcher("/views/admin/user/importuser.jsp");
            rd.forward(request, response);

        } else if(command.getUrlType() != null && command.getUrlType().equals(VALIDATE_IMPORT)){
            List<UserImportDTO> userImportDTOS = (List<UserImportDTO>) SessionUtil.getInstance().getValue(request, LIST_USER_IMPORT);
            command.setUserImportDTOS(returnListUserImport(command, userImportDTOS, request));
            request.setAttribute(WebConstant.LIST_ITEMS, command);
            RequestDispatcher rd = request.getRequestDispatcher("/views/admin/user/importuser.jsp");
            rd.forward(request, response);
        }
    }

    private List<UserImportDTO> returnListUserImport(UserCommand command, List<UserImportDTO> userImportDTOS, HttpServletRequest request) {
        command.setMaxPageItems(3);
        RequestUtil.initSearchBean(request, command);
        command.setTotalItems(userImportDTOS.size());
        int fromIndex = command.getFirstItem();
        if (fromIndex > command.getTotalItems()) {
            fromIndex = 0;
            command.setFirstItem(0);
        }
        int toIndex = command.getFirstItem() + command.getMaxPageItems();
        if (userImportDTOS.size() > 0) {
            if (toIndex > userImportDTOS.size()) {
                toIndex = userImportDTOS.size();
            }
        }
        return userImportDTOS.subList(fromIndex, toIndex);
    }

    private Map<String,String> buidMapRedirectMessage(ResourceBundle bundle) {
        Map<String, String> mapMessage = new HashMap<String, String>();
        mapMessage.put(WebConstant.REDIRECT_INSERT, bundle.getString("label.user.message.add.success"));
        mapMessage.put(WebConstant.REDIRECT_UPDATE, bundle.getString("label.user.message.update.success"));
        mapMessage.put(WebConstant.REDIRECT_DELETE, bundle.getString("label.user.message.delete.success"));
        mapMessage.put(WebConstant.REDIRECT_ERROR, bundle.getString("label.message.error"));
        return mapMessage;
    }
}
