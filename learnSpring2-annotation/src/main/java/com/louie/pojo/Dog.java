package com.louie.pojo;

public class Dog {
    private String name;

    public void shout() {
        System.out.println("wang~~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
