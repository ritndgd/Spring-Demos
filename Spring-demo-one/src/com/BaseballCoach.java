package com;

public class BaseballCoach implements Coach{

    public String getDailyWorkOut(){
        return "Spend 30 minutes on batting practice";
    }
    /*Private field for dependency*/
    private FortuneService fortuneService;

    /*Constructor for dependency injection*/
    public BaseballCoach(FortuneService theFortineService){
        fortuneService = theFortineService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
