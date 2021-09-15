package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.util.NumberGenerator.generateDefaultNumber;

public final class Prime extends Engine {

    private static final String YES_ANSWER = "yes";
    private static final String NO_ANSWER = "no";

    private static final String START_MESSAGE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static String[][] generateData() {
        String[][] data = new String[Engine.ANSWERS_TO_WIN][2];

        for (int i = 0; i < Engine.ANSWERS_TO_WIN; i++) {
            int randomNumber = generateDefaultNumber();

            String answer = isPrime(randomNumber) ? YES_ANSWER : NO_ANSWER;

            data[i] = new String[] {String.valueOf(randomNumber), answer};
        }

        return data;
    }

    public static void run() {
        Engine.play(START_MESSAGE, generateData());
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
}
