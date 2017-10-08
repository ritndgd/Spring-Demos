package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService(){
        SadFortuneService sadFortuneService = new SadFortuneService();
        return sadFortuneService;
    }

    @Bean
    public Coach swimCoach(){
        SwimCoach swimCoach = new SwimCoach(sadFortuneService());
        return swimCoach;
    }

}
