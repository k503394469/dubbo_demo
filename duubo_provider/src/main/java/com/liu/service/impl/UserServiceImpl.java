package com.liu.service.impl;

import com.liu.service.UserService;

public class UserServiceImpl implements UserService {
    public String hello(String name) {
        return "hello: "+name;
    }
}
