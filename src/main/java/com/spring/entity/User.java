package com.spring.entity;

/**
 * @Author :xiaozou
 * @Date : 2022/3/11- 10:53
 **/
public class User {
    private Integer id;
    private String username;
    private Integer age;
    private String email;

    public User() {
    }

    public User(Integer id, String username, Integer age, String email) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
