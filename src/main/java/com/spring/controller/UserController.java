package com.spring.controller;
import com.alibaba.fastjson.JSONObject;
import com.spring.entity.User;
import com.spring.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author :xiaozou
 * @Date : 2022/3/11- 10:44
 **/
@Controller
public class UserController {

    @Resource
    private UserService userService;


    @GetMapping("/")
    public String indexPage(){

        return "../index";
    }

    @GetMapping("/h3")
    public String indexPage3(){

        return "user";
    }

    @PostMapping("/getUser")
    @ResponseBody
    public String getUser(){
        List<User> user = userService.findAllUser();
        return user.toString();
    }
}
