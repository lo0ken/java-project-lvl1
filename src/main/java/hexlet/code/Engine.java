package hexlet.code;

import hexlet.code.util.Cli;
import hexlet.code.util.Greet;


public abstract class Engine {

    public static final int ANSWERS_TO_WIN = 3;

    public static final String DELIMITER = " ";

    public static void play(String startMessage, String[][] roundsData) {
        String playerName = Greet.greet();

        System.out.println(startMessage);

        for (String[] roundData: roundsData) {
            System.out.println("Question: " + roundData[0]);
            System.out.print("Your answer: ");
            String answer = Cli.inputString();

            String correctAnswer = roundData[1];

            if (!answer.equals(correctAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n",
                        answer, correctAnswer);
                System.out.printf("Let's try again, %s!\n", playerName);
                return;
            }
            System.out.println("Correct!");
        }
        System.out.printf("Congratulations, %s!\n", playerName);
    }
}
