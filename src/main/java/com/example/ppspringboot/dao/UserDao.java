package com.example.ppspringboot.dao;

import com.example.ppspringboot.model.User;
import java.util.List;

public interface UserDao {

    List<User> listUsers();

    void add(User user);

    void update(User user);

    void delete(Long id);

    User getById(Long id);
}
