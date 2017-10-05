package com;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkOut() {
        return "Run a hard 5k";
    }

    public TrackCoach(FortuneService thefortuneService){
        fortuneService = thefortuneService;
    }

    @Override
    public String getDailyFortune() {
        return "Today's fortune: "+fortuneService.getFortune();
    }

    /*Add an init method and destroy method*/
    public void initMethod(){
        System.out.println("Inside in-it method");
    }

    public void destroyMethod(){
        System.out.println("Inside destroy method");
    }
}
