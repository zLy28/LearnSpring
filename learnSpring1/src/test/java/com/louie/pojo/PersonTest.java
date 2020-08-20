package com.louie.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    @Test
    public void personTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person.getName());
    }
}
