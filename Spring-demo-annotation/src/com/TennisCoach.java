package com;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice service for 20 mins";
    }
}
