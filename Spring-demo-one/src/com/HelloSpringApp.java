package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        /*Load the Spring Configuration File*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*Retrieve bean from Spring Container*/
        Coach coach = context.getBean("myCoach", Coach.class);

        /*Call methods on the bean*/
        System.out.println(coach.getDailyWorkOut());

        System.out.println(coach.getDailyFortune());
        /*Close the context*/
        context.close();
    }
}
