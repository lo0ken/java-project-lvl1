package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;

public final class GCD extends Engine {

    @Override
    protected String getStartMessage() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    protected Pair generatePair() {
        int firstNumber = generateDefaultNumber();
        int secondNumber = generateDefaultNumber();

        return new Pair(
            firstNumber + DELIMITER + secondNumber,
                String.valueOf(gcd(firstNumber, secondNumber))
        );
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
