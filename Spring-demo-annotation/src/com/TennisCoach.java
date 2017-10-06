package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice service for 20 mins";
    }

    @Override
    public String getDailyFortune() {
        return "TennisCoach Fortune: " + fortuneService.getFortune();
    }
}
