package io.hexlet.games;

/**
 * Class Game created as interface to use in different games.
 */
public interface Game {
    /**
     * method getRule() created get game rules.
     *
     * @return rule
     */
    String getRule();

    /**
     * method getQuestion() create to get game question.
     *
     * @return question
     */
    String getQuestion();

    /**
     * method getResult() created to get right result.
     *
     * @return result
     */
    String getResult();
}
