package vn.toeic.testng;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import vn.toeic.core.dao.UserDao;
import vn.toeic.core.daoimpl.UserDaoImpl;
import vn.toeic.core.persistence.entity.UserEntity;


public class LoginTest {
    private final  Logger log = Logger.getLogger(this.getClass());


//    public void checkUserExist(){
//        UserDao userDao = new UserDaoImpl();
//        String name = "phannguyen";
//        String password = "123";
//
//        UserEntity entity = userDao.isUserExist(name,password);
//        if(entity !=null){
//            log.error("login success");
//        }else {
//            log.error("loggin fail");
//        }
//    }


}
