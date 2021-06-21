package io.hexlet.code;

import io.hexlet.Cli;
import io.hexlet.games.Game;

public class Engine {
    static final int WINNING_COUNT = 3;

    public static void gamePlay(Game game) {
        Cli.print(game.getRule());
        for (int countOfRightAnswers = 0; countOfRightAnswers < WINNING_COUNT; countOfRightAnswers++) {
            Cli.print("Question: " + game.getQuestion());
            String answer = Cli.readLine();
            String result = game.getResult();
            if (!answer.equalsIgnoreCase(result)) {
                Cli.print("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                return;
            }
            Cli.print("Correct!");
        }
        Cli.print("Congratulations, " + Cli.getUserName() + "!");
    }

}
