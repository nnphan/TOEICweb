package vn.toeic.core.common.utils;

import org.apache.log4j.Logger;
import vn.toeic.core.common.constant.CoreConstant;



import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UploadUtil {
    private final Logger log = Logger.getLogger(this.getClass());
    private final int maxMemorySize = 1024 * 1024 * 3; //3MB
    private final int maxRequestSize = 1024 * 1024 * 50; //50 MB

    public  Object[] writeOrUpdateFile(HttpServletRequest request, Set<String> titleValue, String path){
        String address = "/"+ CoreConstant.FOLDER_UPLOAD;
        checkAndCreateFolder(address,path);

        boolean check = true;
        String fileLocation = null;
        String name = null;
        Map<String, String> mapReturnValue = new HashMap<String, String>();
        // Check that we have a file upload request
        return new Object[1];
    }

    private void checkAndCreateFolder(String address, String path) {
        File folderRoot = new File(address);
        if (!folderRoot.exists()) {
            folderRoot.mkdirs();
        }
        File folderChild = new File(address + File.separator + path);
        if (!folderChild.exists()) {
            folderChild.mkdirs();
        }
    }
}
