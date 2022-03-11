package com.spring.service;

import com.spring.entity.User;

import java.util.List;

/**
 * @Author :xiaozou
 * @Date : 2022/3/11- 11:00
 **/
public interface UserService {

    /**
     * 查询所有的用户
     * @return
     */
    List<User> findAllUser();
}
