package com.codecool.car_race;

import com.codecool.car_race.util.RandomHelper;

public class Weather {
    private static final int CHANCE_OF_RAIN = 30;
    private boolean isRaining = false;

    public Weather() {
        randomize();
    }

    void randomize() {
        isRaining = RandomHelper.eventWithChance(CHANCE_OF_RAIN);
    }

    public boolean isRaining() {
        return  isRaining;
    }
}
