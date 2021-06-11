package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Pair;

public final class Even extends Engine {

    private static final String YES_ANSWER = "yes";
    private static final String NO_ANSWER = "no";

    @Override
    protected String getStartMessage() {
        return "Answer 'yes' if number even otherwise answer 'no";
    }

    @Override
    protected Pair generatePair() {
        int questionNumber = generateDefaultNumber();

        return new Pair(
                String.valueOf(questionNumber),
                isEven(questionNumber)
        );
    }

    private String isEven(int number) {
        return number % 2 == 0 ? YES_ANSWER : NO_ANSWER;
    }
}
