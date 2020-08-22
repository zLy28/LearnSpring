package com.louie.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CSGOTest {

    @Test
    public void csgoTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CSGO csgo = context.getBean("csgo", CSGO.class);
        CSGO csgo2 = context.getBean("csgo2", CSGO.class);
        System.out.println(csgo);
        System.out.println(csgo2);
    }
}
