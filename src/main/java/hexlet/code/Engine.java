package hexlet.code;

import hexlet.code.util.Cli;
import hexlet.code.util.Greet;

import java.util.Random;

public abstract class Engine {

    private static final int ANSWERS_TO_WIN = 3;

    protected static final String DELIMITER = " ";

    protected static final int DEFAULT_MAX_NUMBER = 100;
    protected static final int DEFAULT_MIN_NUMBER = 0;

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
     * Generates a number with bounds [{@link #DEFAULT_MIN_NUMBER}, {@link #DEFAULT_MAX_NUMBER}].
     *
     * @return generated number
     */
    protected int generateDefaultNumber() {
        return generateWithBounds(DEFAULT_MIN_NUMBER, DEFAULT_MAX_NUMBER);
    }

    /**
     * Generates a number with bounds [0, {@code bound}].
     *
     * @param bound max value of number to generate
     * @return generated number
     */
    protected int generateWithMaxBound(int bound) {
        return generateWithBounds(DEFAULT_MIN_NUMBER, bound);
    }

    /**
     * Generates a number with bounds [{@code min}, {@code max}].
     *
     * @param min min value of number to generate
     * @param max max value of number to generate
     * @return generated number with specified bounds
     */
    protected int generateWithBounds(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }

    protected abstract String getStartMessage();

    protected abstract Pair generatePair();
}
