package io.hexlet.games;

import io.hexlet.Cli;

import java.util.Random;

public class Calc {
    private static Random random = new Random();
    static final int UPPER_BOUND = 10;
    static final int WINNING_COUNT = 3;


    private static int generateFirstTerm() {
        return random.nextInt(UPPER_BOUND);
    }

    private static int generateSecondTerm() {
        return random.nextInt(UPPER_BOUND);
    }

    private static String generateOperator() {
        String[] operators = {"+", "-", "*"};
        int i = random.nextInt(operators.length);
        return operators[i];
    }

    public static void calc() {
        Cli.print("What is the result of the expression?");
        for (int countOfRightAnswers = 0; countOfRightAnswers < WINNING_COUNT; countOfRightAnswers++) {
            int firstTerm = generateFirstTerm();
            int secondTerm = generateSecondTerm();
            String operator = generateOperator();
            int calculationResult = calculateExpression(firstTerm, operator, secondTerm);
            Cli.print("Question:" + firstTerm + operator + secondTerm);
            int answer = Integer.parseInt(Cli.readLine());

            if (!(answer == calculationResult)) {
                Cli.print("'" + answer + "' is wrong answer ;(. Correct answer was '" + calculationResult + "'.");
                return;
            }
            Cli.print("Correct!");
        }
        Cli.print("Congratulations, " + Cli.getUserName());

    }

    public static int calculateExpression(int firstTerm, String operator, int secondTerm) {
        int result = 0;
        switch (operator) {
            case "+":
                result = firstTerm + secondTerm;
                break;
            case "-":
                result = firstTerm - secondTerm;
                break;
            case "*":
                result = firstTerm * secondTerm;
                break;
        }
        return result;
    }

}
