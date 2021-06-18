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
        return random.nextInt((UPPER_BOUND - MIN_BOUND)) + MIN_BOUND;
    }

    private String printProgression() {
        int difference = generateDifference();
        int progressionLength = generateProgressionLength();
        int hiddenElement = random.nextInt(progressionLength) + 1;
        int currElement = generateStartElement();
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

    @Override
    public String getRule() {
        return "What number is missing in the progression?";
    }

    @Override
    public String getQuestion() {
        return printProgression();
    }

    @Override
    public String getResult() {
        return String.valueOf(result);
    }
}
