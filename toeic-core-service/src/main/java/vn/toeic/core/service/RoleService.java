package vn.toeic.core.service;

import vn.toeic.core.datatranferobject.RoleDTO;

import java.util.List;

public interface RoleService {
    List<RoleDTO> findAll();
}
