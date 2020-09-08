package com.codecool.car_race.util;

import java.util.Random;

public class RandomHelper {
    private static final  Random RANDOM = new Random();

    public static int nextInt(int lower, int upper) {
        return lower + nextInt(upper - lower);
    }

    public static int nextInt(int upper) {
        return RANDOM.nextInt(upper);
    }

    public static String chooseOne(String[] possibleNames) {
        if (possibleNames == null || possibleNames.length < 1) {
            final String msg = "Possibilities should be non-empty array of strings.";
            throw new IllegalArgumentException(msg);
        }
        return possibleNames[nextInt(possibleNames.length)];
    }

    public static boolean eventWithChance(int chanceOfRain) {
        return RANDOM.nextInt(100) < chanceOfRain;
    }
}
