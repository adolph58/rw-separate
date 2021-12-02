package com.arte.rws.web;

import com.arte.rws.entity.Role;
import com.arte.rws.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lele
 * @since 2019-06-10
 */
@RestController
@RequestMapping("/role")
public class RoleController {
@Autowired
private RoleDao roleDao;
    @GetMapping("/get")
  public Role get(){
      return  roleDao.getRoleById(1L);
    }
    @GetMapping("/put")
    public void put(){
        roleDao.insertRole(new Role().setId(5L).setRoleName("test").setRoleJob("test"));
    }
}

