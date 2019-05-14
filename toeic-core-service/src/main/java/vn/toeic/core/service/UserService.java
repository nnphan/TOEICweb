package vn.toeic.core.service;

import vn.toeic.core.datatranferobject.CheckLogin;
import vn.toeic.core.datatranferobject.UserDTO;
import vn.toeic.core.datatranferobject.UserImportDTO;
import vn.toeic.core.persistence.entity.UserEntity;

import java.util.List;
import java.util.Map;

public interface UserService {
    Object[] findByProperty(Map<String, Object> property, String sortExpression, String sortDirection, Integer offset, Integer limit);
    UserDTO findById(Integer userId);
    void saveUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO);
    CheckLogin checkLogin(String name, String password);
    void validateImportUser(List<UserImportDTO> userImportDTOS);
    void saveUserImport(List<UserImportDTO> userImportDTOS);

}
