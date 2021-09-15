package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.util.Greet;
import hexlet.code.util.Cli;

import java.util.Map;

public class App {

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
            case 1:
                Greet.greet();
                break;
            case 2:
                Even.run();
                break;
            case 3:
                Calculator.run();
                break;
            case 4:
                GCD.run();
                break;
            case 5:
                Progression.run();
                break;
            case 6:
                Prime.run();
                break;
            default:
                System.out.println("Wrong input! Try again");
        }
    }
}
