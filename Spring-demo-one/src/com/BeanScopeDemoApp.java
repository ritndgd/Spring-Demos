package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        /*Load the Spring Configuration File*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        /*Retrieve the bean from Spring Container*/
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        /*Check if these two beans are same*/

        System.out.println(coach == alphaCoach ? true : false);
        System.out.println("Memory Location: "+ coach + " "+ alphaCoach);
        context.close();
    }
}
