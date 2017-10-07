package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        /*Load the Spring container*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        /*Close the context*/
        context.close();
    }

}
