package io.hexlet.games;

import io.hexlet.Cli;

import java.util.Random;

public class GCD {
    private static Random random = new Random();
    static final int UPPER_BOUND = 10;
    static final int WINNING_COUNT = 3;

    private static int generateFirstTerm() {
        return random.nextInt(UPPER_BOUND);
    }

    private static int generateSecondTerm() {
        return random.nextInt(UPPER_BOUND);
    }

    public static void gcd() {
        Cli.print("Find the greatest common divisor of given numbers.");
        for (int countOfRightAnswers = 0; countOfRightAnswers < WINNING_COUNT; countOfRightAnswers++) {
            int firstTerm = generateFirstTerm();
            int secondTerm = generateSecondTerm();
            int calculationResult = calculateGcd(firstTerm, secondTerm);
            Cli.print("Question:" + firstTerm + " " + secondTerm);
            int answer = Integer.parseInt(Cli.readLine());
            if (!(answer == calculationResult)) {
                Cli.print("'" + answer + "' is wrong answer ;(. Correct answer was '" + calculationResult + "'.");
                return;
            }
            Cli.print("Correct!");
        }
        Cli.print("Congratulations, " + Cli.getUserName());
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
}
