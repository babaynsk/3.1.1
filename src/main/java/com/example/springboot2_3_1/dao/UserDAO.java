package com.example.springboot2_3_1.dao;

import com.example.springboot2_3_1.model.User;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public interface UserDAO {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUserById(int id);
    public void updateUser(User user);
    public void delete(int id);
}
