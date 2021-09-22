package com.wy.demo.service;

import com.wy.demo.domain.User;

import java.util.List;

public interface UserService {

    Boolean add(User user);

    List<User> list();

    User get(String flowId);
}
