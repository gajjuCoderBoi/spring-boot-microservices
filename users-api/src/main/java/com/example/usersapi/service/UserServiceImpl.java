package com.example.usersapi.service;

import com.example.usersapi.model.User;
import com.example.usersapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        User savedUser = userRepository.findById(user.getUserId()).orElse(null);
        savedUser.setFirstname(user.getFirstname());
        savedUser.setLastname(user.getLastname());
        return userRepository.save(savedUser);
    }

    @Override
    public Long deleteUser(Long user_id) {
        User savedUser = userRepository.findById(user_id).orElse(null);
        userRepository.delete(savedUser);
        return savedUser.getUserId();
    }
}
