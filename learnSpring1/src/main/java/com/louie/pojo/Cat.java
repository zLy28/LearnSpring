package com.louie.pojo;

public class Cat {
    private String name;

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
    public void shout() {
        System.out.println("Miao~");
    }
}
