package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach{

    /*Field Injection using @Autowired*/
    @Autowired
    @Qualifier("happyFortuneService")
    FortuneService fortuneService;

    public TennisCoach(){
        System.out.println("Inside the no-arg constructor");
    }

    /*Constructor injection using @Autowired*/
    /*@Autowired
    public TennisCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }*/

    /*Setter method for injection using @Autowired*/
   /* @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter method - Autowired");
        this.fortuneService = fortuneService;
    }*/

    /*Method to inject dependency using @Autowired*/
    /*@Autowired
    public void methodDependencyInjection(FortuneService fortuneService){
        System.out.println("Inside the method for injection");
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice service for 20 mins";
    }

    @Override
    public String getDailyFortune() {
        return "TennisCoach Fortune: " + fortuneService.getFortune();
    }

    /*Define init method*/
    @PostConstruct
    public void initMethod(){
        System.out.println("TennisCoach: Inside init method");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("TennisCoach: Inside destroy method");
    }
}
