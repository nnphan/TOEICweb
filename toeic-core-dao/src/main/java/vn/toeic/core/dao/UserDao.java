package vn.toeic.core.dao;

import vn.toeic.core.data.dao.GenericDao;
import vn.toeic.core.persistence.entity.RoleEntity;
import vn.toeic.core.persistence.entity.UserEntity;

import java.util.List;

public interface UserDao extends GenericDao<Integer, UserEntity> {

    UserEntity findUserByUsernameAndPassword(String name, String password);
    Object[] checkLogin(String name, String password);
    List<UserEntity> findByUsers(List<String> names);

}
