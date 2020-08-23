package com.louie.pojo;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name;

    public void shout() {
        System.out.println("miao~~~");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
