package com.example.demo.service;

import com.example.demo.infrastructure.repository.UserRepository;
import com.example.demo.presentation.model.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void save(UserRequest user) {
        userRepository.save(user.toEntity());
    }
}
