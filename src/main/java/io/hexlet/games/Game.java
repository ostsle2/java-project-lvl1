package io.hexlet.games;

/**
 * Class Game created as interface
 * to use in different games
 * */

public interface Game {
    /**
     * method getRule() created
     * to get game rules
     * */
    String getRule();
    /**
     * method getQuestion() created
     * to get game question
     * */
    String getQuestion();
    /**
     * method getResult() created
     * to get right result
     * */
    String getResult();
}
