package com.louie.pojo;

import com.louie.config.ConfigLouie;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {
    @Test
    public void userTest() {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigLouie.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
    }
}
