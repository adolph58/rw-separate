package com.arte.rws.service.impl;

import com.arte.rws.service.IUserService;
import com.arte.rws.entity.User;
import com.arte.rws.dao.UserDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lele
 * @since 2019-06-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

    @Override
    public void addUser(User u) {

    }
}
