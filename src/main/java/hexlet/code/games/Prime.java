package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;

public final class Prime extends Engine {

    private static final String YES_ANSWER = "yes";
    private static final String NO_ANSWER = "no";

    @Override
    protected String getStartMessage() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    protected Pair generatePair() {
        int randomNumber = generateDefaultNumber();

        return new Pair(
                String.valueOf(randomNumber),
                isPrime(randomNumber) ? YES_ANSWER : NO_ANSWER
        );
    }

    private boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
}
