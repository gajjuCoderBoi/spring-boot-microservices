package com.example.usersapi.service;

import com.example.usersapi.model.User;

import java.util.List;

public interface UserService {

    public List<User> getUsers();
    public User createUser(User user);
    public User updateUser(User user);
    public Long deleteUser(Long user_id);

}
