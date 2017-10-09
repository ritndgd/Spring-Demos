package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        /*Load the Spring container*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(coach.);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        /*Close the context*/
        context.close();
    }

}
