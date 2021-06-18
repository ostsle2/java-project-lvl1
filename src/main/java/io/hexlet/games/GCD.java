package io.hexlet.games;

import java.util.Random;

public class GCD implements Game {
    private static Random random = new Random();
    static final int UPPER_BOUND = 10;
    private int firstTerm;
    private int secondTerm;
    private int calculationResult;

    private static int generateFirstTerm() {
        return random.nextInt(UPPER_BOUND);
    }

    private static int generateSecondTerm() {
        return random.nextInt(UPPER_BOUND);
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

    @Override
    public String getRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String getQuestion() {
        firstTerm = generateFirstTerm();
        secondTerm = generateSecondTerm();
        return String.valueOf(firstTerm + " " + secondTerm);
    }

    @Override
    public String getResult() {
        calculationResult = calculateGcd(firstTerm, secondTerm);
        return String.valueOf(calculationResult);
    }
}
