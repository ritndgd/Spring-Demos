package com;

public class CricketCoach implements Coach {

    private FortuneService myFortuneService;
    private String email;
    private String team;

    public CricketCoach(){
        System.out.println("Inside CricketCoach no-arg Constructor");
    }

    /*Setter method to inject dependency*/
    public void setMyFortuneService(FortuneService myFortuneService) {
        System.out.println("Inside setter method");
        this.myFortuneService = myFortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public void setEmail(String email) {
        System.out.println("CricketCoach: Inside Setter Method - Email");
        this.email = email;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: Inside Setter Method - Team");
        this.team = team;
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice fast balling for 15 mins everyday";
    }

    @Override
    public String getDailyFortune() {
        return myFortuneService.getFortune();
    }
}
