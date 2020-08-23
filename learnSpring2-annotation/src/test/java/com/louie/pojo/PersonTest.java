package com.louie.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
    @Test
    public void personTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person = context.getBean("person", Person.class);
        person.getCat().shout();
        person.getDog().shout();
    }
}
