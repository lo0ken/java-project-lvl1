package hexlet.code;

import hexlet.code.util.Cli;
import hexlet.code.util.Greet;

import java.util.Random;

public abstract class Engine {

    private static final int ANSWERS_TO_WIN = 3;

    protected static final String DELIMITER = " ";

    protected static final int MAX_NUMBER_BOUND = 100;

    private static final Random RANDOM = new Random();

    public final void play() {
        int correctAnswers = 0;

        String playerName = Greet.askName();

        System.out.println(getStartMessage());

        while (correctAnswers < ANSWERS_TO_WIN) {
            Pair pair = generatePair();
            System.out.println("Question: " + pair.getQuestion());
            System.out.print("Your answer: ");

            String answer = Cli.inputString();

            String correctAnswer = pair.getAnswer();
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

    /**
     * Generates a number with bounds [0, {@link #MAX_NUMBER_BOUND}).
     *
     * @return generated number
     */
    protected int generateDefaultNumber() {
        return RANDOM.nextInt(MAX_NUMBER_BOUND);
    }

    /**
     * Generates a number with bounds [0, {@code bound }).
     *
     * @param bound right bound of generated number
     * @return generated number
     */
    protected int generateWithBound(int bound) {
        return RANDOM.nextInt(bound);
    }

    protected abstract String getStartMessage();

    protected abstract Pair generatePair();
}
