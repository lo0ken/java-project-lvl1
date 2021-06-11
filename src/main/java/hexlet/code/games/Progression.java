package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;

import static java.lang.String.join;

public final class Progression extends Engine {

    private static final int MIN_NUMBERS_COUNT = 5;
    private static final int MAX_NUMBERS_COUNT = 15;

    private static final String HIDDEN_ELEMENT_SIGN = "..";

    @Override
    protected String getStartMessage() {
        return "What number is missing in the progression?";
    }

    @Override
    protected Pair generatePair() {
        int numbersCount = generateNumber();
        int firstNumber = generateNumber();
        int step = generateNumber();

        String[] progression = generateProgression(firstNumber, step, numbersCount);
        int hiddenElementIndex = generateWithMaxBound(progression.length - 1);

        String hiddenElementValue = progression[hiddenElementIndex];
        progression[hiddenElementIndex] = HIDDEN_ELEMENT_SIGN;

        String question = join(" ", progression);

        return new Pair(question, hiddenElementValue);
    }

    private int generateNumber() {
        return generateWithBounds(MIN_NUMBERS_COUNT, MAX_NUMBERS_COUNT);
    }

    private String[] generateProgression(int first, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(first + i * step);
        }
        return progression;
    }
}
