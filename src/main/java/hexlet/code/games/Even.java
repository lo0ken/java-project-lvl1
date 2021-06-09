package hexlet.code.games;

import hexlet.code.util.Cli;
import hexlet.code.util.Greet;

import java.util.Random;

public final class Even implements Game {

    private static final int ANSWERS_TO_WIN = 3;

    private static final String YES_ANSWER = "yes";
    private static final String NO_ANSWER = "no";

    private final Random random = new Random();

    @Override
    public void play() {
        int correctAnswers = 0;

        String playerName = Greet.askName();

        printRules();

        while (correctAnswers < ANSWERS_TO_WIN) {
            int randomNumber = random.nextInt();

            askQuestion(randomNumber);
            String answer = Cli.inputString();

            if (!checkAnswer(randomNumber, answer)) {
                System.out.printf("Let's try again, %s!\n", playerName);
                return;
            }

            System.out.println("Correct!");
            correctAnswers++;
        }

        System.out.printf("Congratulations, %s!\n", playerName);
    }

    private void printRules() {
        System.out.println("\nAnswer 'yes' if number even otherwise answer 'no");
    }

    private void askQuestion(int number) {
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
    }

    private boolean checkAnswer(int number, String answer) {
        boolean even = number % 2 == 0;

        return (even && YES_ANSWER.equals(answer))
                || (!even && NO_ANSWER.equals(answer));
    }
}
