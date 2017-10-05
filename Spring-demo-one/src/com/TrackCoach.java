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
}
