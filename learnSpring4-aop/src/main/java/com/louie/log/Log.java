package com.louie.log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {
    @Before("execution(* com.louie.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("********* before execution *********");
    }

    @After("execution(* com.louie.service.*.*(..))")
    public void after() {
        System.out.println("********* after execution *********");
    }
}
