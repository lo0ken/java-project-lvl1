package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.util.Greet;
import hexlet.code.util.Cli;

public class App {

    /* Для избежания checkstyle-ошибки  '3' is a magic number. [MagicNumber] */
    private static final int GREET_ANSWER = 1;
    private static final int EVEN_ANSWER = 2;
    private static final int CALCULATOR_ANSWER = 3;
    private static final int GCD_ANSWER = 4;
    private static final int PROGRESSION_ANSWER = 5;
    private static final int PRIME_ANSWER = 6;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        System.out.println("Your choice: ");
        int choice = Integer.parseInt(Cli.inputString());

        switch (choice) {
            case 0:
                break;
            case GREET_ANSWER:
                Greet.greet();
                break;
            case EVEN_ANSWER:
                Even.run();
                break;
            case CALCULATOR_ANSWER:
                Calculator.run();
                break;
            case GCD_ANSWER:
                GCD.run();
                break;
            case PROGRESSION_ANSWER:
                Progression.run();
                break;
            case PRIME_ANSWER:
                Prime.run();
                break;
            default:
                System.out.println("Wrong input! Try again");
        }
    }
}
