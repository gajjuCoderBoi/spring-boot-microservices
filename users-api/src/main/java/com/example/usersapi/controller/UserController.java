package com.example.usersapi.controller;

import com.example.usersapi.model.User;
import com.example.usersapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/list")
    public List<User> getList(){
        return userService.getUsers();
    }

    @PostMapping("/create")
    public User createUser(User user) {
        return userService.createUser(user);
    }

    @PutMapping("/update")
    public User updateUser(User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/delete")
    public Long deleteUser(Long user_id) {
        return userService.deleteUser(user_id);
    }

}
