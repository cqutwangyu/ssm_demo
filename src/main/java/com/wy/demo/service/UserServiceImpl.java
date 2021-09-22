package com.wy.demo.service;

import com.wy.demo.domain.User;
import com.wy.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean add(User user) {
        user.setFlowId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setVersionNumber(1);
        userMapper.insert(user);
        return true;
    }

    @Override
    public List<User> list() {
        List<User> users = userMapper.selectAll();
        return users;
    }

    @Override
    public User get(String flowId) {
        return userMapper.selectById(flowId);
    }
}
