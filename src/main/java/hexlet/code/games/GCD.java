package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.DELIMITER;
import static hexlet.code.util.NumberGenerator.generateDefaultNumber;

public final class GCD {

    private static final String START_MESSAGE = "Find the greatest common divisor of given numbers.";

    private static String[][] generateData() {
        String[][] data = new String[Engine.ANSWERS_TO_WIN][2];

        for (int i = 0; i < Engine.ANSWERS_TO_WIN; i++) {
            int firstNumber = generateDefaultNumber();
            int secondNumber = generateDefaultNumber();

            String question = firstNumber + DELIMITER + secondNumber;
            String answer = String.valueOf(gcd(firstNumber, secondNumber));

            data[i] = new String[] {question, answer};
        }

        return data;
    }

    public static void run() {
        Engine.play(START_MESSAGE, generateData());
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
