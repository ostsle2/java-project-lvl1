package io.hexlet.games;

import io.hexlet.Cli;

import java.util.Random;

public class Even implements Game{
    final Random random = new Random();
    final int upperBound = 1000;

    private int value;

    @Override
    public String getRule() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    @Override
    public String getQuestion() {
        value = random.nextInt(upperBound);
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
