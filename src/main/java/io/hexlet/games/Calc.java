package io.hexlet.games;

import io.hexlet.Cli;

import java.util.Random;

public class Calc implements Game{
    private static Random random = new Random();
    static final int UPPER_BOUND = 10;
    private int firstTerm;
    private int secondTerm;
    private String operator;


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
            default:
                break;
        }
        return result;
    }

    @Override
    public String getRule() {
        return "What is the result of the expression?";
    }

    @Override
    public String getQuestion() {
        firstTerm = generateFirstTerm();
        secondTerm = generateSecondTerm();
        operator = generateOperator();
        return firstTerm + operator + secondTerm;
    }

    @Override
    public String getResult() {
        return String.valueOf(calculateExpression(firstTerm, operator, secondTerm));
    }
}
