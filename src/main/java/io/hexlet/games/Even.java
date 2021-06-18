package io.hexlet.games;

import java.util.Random;

public class Even implements Game {
    private final Random random = new Random();
    private final int UPPER_BOUND = 1000;

    private int value;

    @Override
    public String getRule() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    @Override
    public String getQuestion() {
        value = random.nextInt(UPPER_BOUND);
        return String.valueOf(value);
    }

    @Override
    public String getResult() {
        return isValueEven(value) ? "yes" : "no";
    }

    private static boolean isValueEven(int value) {
        return (value % 2 == 0);
    }
}
