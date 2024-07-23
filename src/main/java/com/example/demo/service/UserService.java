package com.example.demo.service;

import com.example.demo.infrastructure.repository.UserRepository;
import com.example.demo.presentation.model.UserRequest;
import com.example.demo.presentation.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void save(UserRequest user) {
        userRepository.save(user.toEntity());
    }

    public UserResponse findById(Long id) {
        return new UserResponse(userRepository.findById(id).get());
    }

    public ArrayList<UserResponse> findAll() {
        ArrayList<UserResponse> userList = new ArrayList<UserResponse>();

        userRepository.findAll().forEach(
            user -> {
                userList.add(new UserResponse(user));
            }
        );

        return userList;
    }
}
