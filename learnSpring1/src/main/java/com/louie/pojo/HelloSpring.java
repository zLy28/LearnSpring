package com.louie.pojo;

public class HelloSpring {
    private String string;

    @Override
    public String toString() {
        return "HelloSpring{" +
                "string='" + string + '\'' +
                '}';
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
