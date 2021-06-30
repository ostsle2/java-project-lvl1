package io.hexlet.games;

import java.util.Random;

public class Progression implements Game {
    private static Random random = new Random();
    static final int MIN_BOUND = 5;
    static final int UPPER_BOUND = 10;
    private int result;

    private static int generateStartElement() {
        return random.nextInt(MIN_BOUND);
    }

    private static int generateDifference() {
        return random.nextInt(MIN_BOUND) + 1;
    }

    private static int generateProgressionLength() {
        return random.nextInt((UPPER_BOUND - MIN_BOUND) + 1) + MIN_BOUND;
    }

    private String getProgression(int difference, int progressionLength, int hiddenElement, int currElement) {
        String resultedProgression = "";
        for (int i = 1; i <= progressionLength; i++) {
            currElement = currElement + difference;
            if (i == hiddenElement) {
                result = currElement;
                resultedProgression += (".. ");
            } else {
                resultedProgression += (currElement + " ");
            }
        }
        return resultedProgression;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getRule() {
        return "What number is missing in the progression?";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getQuestion() {
        int difference = generateDifference();
        int progressionLength = generateProgressionLength();
        int hiddenElement = random.nextInt(progressionLength) + 1;
        int currElement = generateStartElement();
        return getProgression(difference, progressionLength, hiddenElement, currElement);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getResult() {
        return String.valueOf(result);
    }
}
