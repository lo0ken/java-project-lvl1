package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.util.NumberGenerator.generateDefaultNumber;

public final class Even {

    private static final String YES_ANSWER = "yes";
    private static final String NO_ANSWER = "no";
    private static final String START_MESSAGE = "Answer 'yes' if number even otherwise answer 'no";

    private static String[][] generateData() {
        String[][] data = new String[Engine.ANSWERS_TO_WIN][2];

        for (int i = 0; i < Engine.ANSWERS_TO_WIN; i++) {
            int questionNumber = generateDefaultNumber();
            String answer = isEven(questionNumber) ? YES_ANSWER : NO_ANSWER;

            data[i] = new String[] {String.valueOf(questionNumber), answer};
        }

        return data;
    }

    public static void run() {
        Engine.play(START_MESSAGE, generateData());
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
