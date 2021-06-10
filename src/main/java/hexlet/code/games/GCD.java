package hexlet.code.games;

import hexlet.code.Engine;

public final class GCD extends Engine {

    @Override
    protected String getStartMessage() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    protected String generateQuestion() {
        return generateDefaultNumber() + DELIMITER + generateDefaultNumber();
    }

    @Override
    protected String getCorrectAnswer(String question) {
        String[] questionParts = question.split(DELIMITER);

        int firstNumber = Integer.parseInt(questionParts[0]);
        int secondNumber = Integer.parseInt(questionParts[1]);

        return String.valueOf(gcd(firstNumber, secondNumber));
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
