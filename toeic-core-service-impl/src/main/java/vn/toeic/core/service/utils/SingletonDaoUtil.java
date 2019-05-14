package vn.toeic.core.service.utils;
import vn.toeic.core.daoimpl.*;

public class SingletonDaoUtil {
    private static UserDaoImpl userDaoImpl = null;
    private static RoleDaoImpl roleDaoImpl = null;
    private static ListenGuidelineDaoImpl listenGuidelineDaoImpl = null;
    private static CommentDaoImpl commentDaoImpl = null;


    public static UserDaoImpl getUserDaoInstance() {
        if (userDaoImpl == null) {
            userDaoImpl = new UserDaoImpl();
        }
        return userDaoImpl;
    }

    public static RoleDaoImpl getRoleDaoInstance() {
        if (roleDaoImpl == null) {
            roleDaoImpl = new RoleDaoImpl();
        }
        return roleDaoImpl;
    }

    public static ListenGuidelineDaoImpl getListenGuidelineDaoInstance() {
        if (listenGuidelineDaoImpl == null) {
            listenGuidelineDaoImpl = new ListenGuidelineDaoImpl();
        }
        return listenGuidelineDaoImpl;
    }

    public static CommentDaoImpl getCommentDaoInstance() {
        if (commentDaoImpl == null) {
            commentDaoImpl = new CommentDaoImpl();
        }
        return commentDaoImpl;
    }


}
