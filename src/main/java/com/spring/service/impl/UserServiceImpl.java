package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.entity.User;
import com.spring.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author :xiaozou
 * @Date : 2022/3/11- 11:00
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
