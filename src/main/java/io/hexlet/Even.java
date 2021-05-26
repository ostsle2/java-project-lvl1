package io.hexlet;

import java.util.Random;

public class Even {
    public static void even() {
        final Random random = new Random();
        final int UPPER_BOUND = 1000;
        final int WINNING_COUNT = 3;
        Cli.print("Answer 'yes' if number even otherwise answer 'no'.");
        for (int countOfRightAnswers = 0; countOfRightAnswers < WINNING_COUNT; countOfRightAnswers++) {
            int value = random.nextInt(UPPER_BOUND);
            Cli.print("Question:" + value);
            String answer = Cli.readLine();
            boolean even = isValueEven(value);
            if (!checkAnswer(answer, even)) {
                String rightResult = even ? "yes" : "no";
                Cli.print("'" + answer + "' is wrong answer ;(. Correct answer was '" + rightResult + "'.");
                return;
            }
            Cli.print("Correct!");
        }
        Cli.print("Congratulations, " + Cli.getUserName());
    }

    private static boolean checkAnswer(String answer, boolean even) {
        return (answer.equalsIgnoreCase("yes") && even)
                || (answer.equalsIgnoreCase("no") && !even);
    }

    private static boolean isValueEven(int value) {
        return (value % 2 == 0);
    }
}
