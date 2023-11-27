package com.example.springboot2_3_1.service;



import com.example.springboot2_3_1.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);
    public User getUserById(int id);
    public void updateUser(User user,int id);

    public void delete(int id);
}
