package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.util.NumberGenerator.generateWithBounds;
import static hexlet.code.util.NumberGenerator.generateWithMaxBound;
import static java.lang.String.join;

public final class Progression extends Engine {

    private static final int MIN_NUMBERS_COUNT = 5;
    private static final int MAX_NUMBERS_COUNT = 15;

    private static final String HIDDEN_ELEMENT_SIGN = "..";
    private static final String START_MESSAGE = "What number is missing in the progression?";

    private static String[][] generateData() {
        String[][] data = new String[Engine.ANSWERS_TO_WIN][2];

        for (int i = 0; i < Engine.ANSWERS_TO_WIN; i++) {
            int numbersCount = generateNumber();
            int firstNumber = generateNumber();
            int step = generateNumber();

            String[] progression = generateProgression(firstNumber, step, numbersCount);
            int hiddenElementIndex = generateWithMaxBound(progression.length - 1);

            String hiddenElementValue = progression[hiddenElementIndex];
            progression[hiddenElementIndex] = HIDDEN_ELEMENT_SIGN;

            String question = join(" ", progression);

            data[i] = new String[] {question, hiddenElementValue};
        }

        return data;
    }

    public static void run() {
        Engine.play(START_MESSAGE, generateData());
    }

    private static int generateNumber() {
        return generateWithBounds(MIN_NUMBERS_COUNT, MAX_NUMBERS_COUNT);
    }

    private static String[] generateProgression(int first, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(first + i * step);
        }
        return progression;
    }
}
