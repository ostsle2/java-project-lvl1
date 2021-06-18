package io.hexlet.games;

import java.util.Random;

public class Prime implements Game {
    private static Random random = new Random();
    static final int UPPER_BOUND = 100;
    private int value;

    private static int generateValue() {
        return random.nextInt(UPPER_BOUND) + 2;
    }

    private static boolean isPrime(int value) {
        for (int i = 2; i <= value / 2; i++) {
            if ((value % i) == 0) {
                return false;
            }
        }
        return true;
    }


    @Override
    public String getRule() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String getQuestion() {
        value = generateValue();
        return String.valueOf(value);
    }

    @Override
    public String getResult() {
        return isPrime(value) ? "yes" : "no";
    }
}
