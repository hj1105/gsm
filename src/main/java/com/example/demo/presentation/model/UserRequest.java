package com.example.demo.presentation.model;

import com.example.demo.infrastructure.entity.User;

public class UserRequest {
    public String username;
    public String password;
    public Long age;

    public User toEntity() {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);

        return user;
    }
}
