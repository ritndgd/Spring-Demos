package com;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkOut(){
        return "Spend 30 minutes on batting practice";
    }

    /*Private field for dependency*/
    private FortuneService fortuneService;

    /*Constructor for dependency injection*/
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
