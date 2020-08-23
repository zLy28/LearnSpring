package com.louie.service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{
    public void add() {
        System.out.println("something added");
    }

    public void update() {
        System.out.println("something updated");
    }
}
