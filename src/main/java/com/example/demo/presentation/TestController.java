package com.example.demo.presentation;

import com.example.demo.presentation.model.UserRequest;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public String test(
            @PathVariable Long id
    ) {
        return "Your id is " + id.toString();
    }
    @PostMapping
    public String post(
            @RequestBody UserRequest userRequest
            ) {
        userService.save(userRequest);
        return "Your age is " + userRequest.age;
    }
}