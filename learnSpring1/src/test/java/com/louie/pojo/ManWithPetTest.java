package com.louie.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManWithPetTest {
    @Test
    public void Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ManWithPet manwithpet = context.getBean("manwithpet", ManWithPet.class);
        manwithpet.getDog().shout();
        manwithpet.getCat().shout();
    }
}
