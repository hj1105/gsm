package com.example.demo.presentation;

import com.example.demo.presentation.model.UserRequest;
import com.example.demo.presentation.model.UserResponse;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TestController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public UserResponse test(
            @PathVariable Long id
    ) {
        return userService.findById(id);
    }

    @GetMapping("/list")
    public ArrayList<UserResponse> getAll() {
        return userService.findAll();
    }

    @PostMapping
    public String post(
            @RequestBody UserRequest userRequest
            ) {
        userService.save(userRequest);
        return "Your age is " + userRequest.age;
    }
}