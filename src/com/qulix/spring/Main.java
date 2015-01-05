package com.qulix.spring;

import com.qulix.spring.exception.PerformanceException;
import com.qulix.spring.performer.Performer;import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");


        Performer performer = (Performer) context.getBean("poeticDuke");
        performer.perform();
    }
}
