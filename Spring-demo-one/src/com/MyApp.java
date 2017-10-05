package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        /*Coach baseballCoach = new BaseballCoach();
        Coach trackCoach = new TrackCoach();

        System.out.println(baseballCoach.getDailyWorkOut());
        System.out.println(trackCoach.getDailyWorkOut());*/

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        System.out.println(cricketCoach.getDailyWorkOut());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getEmail());
        System.out.println(cricketCoach.getTeam());
    }
}
