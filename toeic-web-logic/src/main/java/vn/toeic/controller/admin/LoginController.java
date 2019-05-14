package vn.toeic.controller.admin;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.log4j.Logger;
import vn.toeic.command.UserCommand;
import vn.toeic.core.common.constant.CoreConstant;
import vn.toeic.core.datatranferobject.UserDTO;
import vn.toeic.core.service.UserService;
import vn.toeic.core.service.impl.UserServiceImpl;
import vn.toeic.core.web.common.WebConstant;
import vn.toeic.core.web.utils.FormUtil;



@WebServlet(urlPatterns = {"/login.html","/logout.html"})
public class LoginController extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/views/web/login.jsp");
        rd.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UserCommand command = FormUtil.populate(UserCommand.class, request);
        UserDTO pojo = command.getPojo();

        UserService userService = new UserServiceImpl();
        try {
            if(userService.isUserExist(pojo) != null){
                if(userService.findRoleByUser(pojo)!= null && userService.findRoleByUser(pojo).getRoleDTO() != null){
                    if(userService.findRoleByUser(pojo).getRoleDTO().getName().equals(CoreConstant.ROLE_ADMIN)){
                        response.sendRedirect("/toeic_web_war_exploded/admin-home.html");

                    } else if (userService.findRoleByUser(pojo).getRoleDTO().getName().equals(CoreConstant.ROLE_USER)) {
                        response.sendRedirect("/toeic_web_war_exploded/home.html");

                    }

                }

            }
        } catch (NullPointerException e) {
            log.error(e.getMessage(),e);
            request.setAttribute(CoreConstant.ALERT,CoreConstant.TYPE_ERROR);
            request.setAttribute(CoreConstant.MESSAGE_RESPONE, "Tên đăng nhập hoặc mật khẩu sai");
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/login.jsp");
            rd.forward(request, response);
        }


    }
}
