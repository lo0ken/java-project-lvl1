package hexlet.code.games;

import hexlet.code.Engine;

public final class Even extends Engine {

    private static final String YES_ANSWER = "yes";
    private static final String NO_ANSWER = "no";

    @Override
    protected String getStartMessage() {
        return "Answer 'yes' if number even otherwise answer 'no";
    }

    @Override
    protected String generateQuestion() {
        return String.valueOf(RANDOM.nextInt());
    }

    @Override
    protected String getCorrectAnswer(String question) {
        return Integer.parseInt(question) % 2 == 0 ? YES_ANSWER : NO_ANSWER;
    }
}
