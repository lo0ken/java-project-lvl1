package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.util.Greet;
import hexlet.code.util.Cli;

import java.util.Map;

public class App {

    private static final Map<Integer, Engine> GAME_LIST = Map.of(
            2, new Even(),
            3, new Calculator()
    );

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("0 - Exit");

        System.out.println("Your choice: ");
        int choice = Integer.parseInt(Cli.inputString());

        switch (choice) {
            case 0:
                break;
            case 1:
                Greet.askName();
                break;
            default:
                GAME_LIST.get(choice).play();
        }
    }
}
