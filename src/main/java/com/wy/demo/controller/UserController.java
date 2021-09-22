package com.wy.demo.controller;

import com.wy.demo.domain.User;
import com.wy.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Resource
    private UserService userService;

    @RequestMapping("/add")
    @ResponseBody
    public Boolean add(@RequestBody User user) {
        Boolean add = userService.add(user);
        return add;
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<User> list() {
        List<User> list = userService.list();
        return list;
    }

    @RequestMapping("/get")
    @ResponseBody
    public User get(@RequestParam("flowId") String flowId) {
        User user = userService.get(flowId);
        return user;
    }

}
