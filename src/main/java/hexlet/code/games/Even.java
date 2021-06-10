package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Even extends Engine {

    private static final String YES_ANSWER = "yes";
    private static final String NO_ANSWER = "no";

    private final Random random = new Random();

    @Override
    protected void printStartMessage() {
        System.out.println("\nAnswer 'yes' if number even otherwise answer 'no");
    }

    @Override
    protected String generateQuestion() {
        return String.valueOf(random.nextInt());
    }

    @Override
    protected String getCorrectAnswer(String question) {
        return Integer.parseInt(question) % 2 == 0 ? YES_ANSWER : NO_ANSWER;
    }
}
