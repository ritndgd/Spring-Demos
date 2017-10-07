package com;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] fortunes = {"Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"};
    private Random random = new Random();

    @Override
    public String getFortune() {
        return fortunes[random.nextInt(fortunes.length)];
    }
}
