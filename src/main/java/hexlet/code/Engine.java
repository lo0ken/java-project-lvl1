package hexlet.code;

import hexlet.code.util.Cli;
import hexlet.code.util.Greet;

import java.util.Random;

public abstract class Engine {

    private static final int ANSWERS_TO_WIN = 3;

    protected static final Random RANDOM = new Random();

    public final void play() {
        int correctAnswers = 0;

        String playerName = Greet.askName();

        printStartMessage();

        while (correctAnswers < ANSWERS_TO_WIN) {
            String question = generateQuestion();
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String answer = Cli.inputString();

            String correctAnswer = getCorrectAnswer(question);
            if (!answer.equals(correctAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n",
                        answer, correctAnswer);
                System.out.printf("Let's try again, %s!\n", playerName);
                return;
            }

            System.out.println("Correct!");
            correctAnswers++;
        }

        System.out.printf("Congratulations, %s!\n", playerName);
    }

    protected abstract void printStartMessage();

    protected abstract String generateQuestion();

    protected abstract String getCorrectAnswer(String question);
}
