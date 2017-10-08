package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        /*Load the Spring container*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("swimCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(alphaCoach.getDailyFortune());
        System.out.println(alphaCoach.getDailyWorkout());

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        /*Close the context*/
        context.close();
    }

}
