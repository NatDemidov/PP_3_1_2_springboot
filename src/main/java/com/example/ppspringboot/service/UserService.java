package com.example.ppspringboot.service;

import java.util.List;
import com.example.ppspringboot.model.User;

public interface UserService {

    List<User> listUsers();

    void add(User user);

    void update(User user);

    void delete(Long id);

    User getById(Long id);
}
