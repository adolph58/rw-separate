package com.arte.rws.dao;

import com.arte.rws.entity.Role;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lele
 * @since 2019-06-10
 */
public interface RoleDao  {

     void insertRole(Role role);

    Role getRoleById(Long id);

}
