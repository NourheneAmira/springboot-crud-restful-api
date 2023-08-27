package com.example.simplecrudrest.service;

import com.example.simplecrudrest.entity.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    List<User> getAllUser();
    User getUserById(long id);
}
