package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.DELIMITER;
import static hexlet.code.util.NumberGenerator.generateDefaultNumber;
import static hexlet.code.util.NumberGenerator.generateWithMaxBound;

public final class Calculator {

    private static final String START_MESSAGE = "What is the result of the expression?";

    private static final char[] OPERATIONS = new char[]{'+', '-', '*'};

    private static char generateOperation() {
        return OPERATIONS[generateWithMaxBound(OPERATIONS.length - 1)];
    }

    private static String[][] generateData() {
        String[][] data = new String[Engine.ANSWERS_TO_WIN][2];

        for (int i = 0; i < Engine.ANSWERS_TO_WIN; i++) {
            int firstNumber = generateDefaultNumber();
            int secondNumber = generateDefaultNumber();
            char operation = generateOperation();

            String question = firstNumber + DELIMITER + operation + DELIMITER + secondNumber;
            String answer = String.valueOf(calculate(firstNumber, secondNumber, operation));

            data[i] = new String[] {question, answer};
        }

        return data;
    }

    public static void run() {
        Engine.play(START_MESSAGE, generateData());
    }

    private static int calculate(int firstNumber, int secondNumber, char operation) {
        switch (operation) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            default:
                throw new RuntimeException("Should not have gotten here");
        }
    }
}
