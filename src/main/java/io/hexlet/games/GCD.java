package io.hexlet.games;

import java.util.Random;

public class GCD implements Game {
    private static Random random = new Random();
    static final int UPPER_BOUND = 10;
    private int firstTerm;
    private int secondTerm;

    private static int generateFirstTerm() {
        return random.nextInt(UPPER_BOUND) + 1;
    }

    private static int generateSecondTerm() {
        return random.nextInt(UPPER_BOUND) + 1;
    }

    public static int calculateGcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getQuestion() {
        firstTerm = generateFirstTerm();
        secondTerm = generateSecondTerm();
        return firstTerm + " " + secondTerm;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getResult() {
        int calculationResult = calculateGcd(firstTerm, secondTerm);
        return String.valueOf(calculationResult);
    }
}
