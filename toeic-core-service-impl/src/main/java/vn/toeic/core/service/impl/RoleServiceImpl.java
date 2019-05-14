package vn.toeic.core.service.impl;

import vn.toeic.core.datatranferobject.RoleDTO;
import vn.toeic.core.persistence.entity.RoleEntity;
import vn.toeic.core.service.RoleService;
import vn.toeic.core.service.utils.SingletonDaoUtil;
import vn.toeic.core.utils.RoleBeanUtil;

import java.util.ArrayList;
import java.util.List;

public class RoleServiceImpl implements RoleService {
    public List<RoleDTO> findAll() {
        List<RoleEntity> entities = SingletonDaoUtil.getRoleDaoInstance().findAll();
        List<RoleDTO> dtos = new ArrayList<RoleDTO>();
        for (RoleEntity item: entities) {
            RoleDTO dto = RoleBeanUtil.entity2Dto(item);
            dtos.add(dto);
        }
        return dtos;
    }
}
