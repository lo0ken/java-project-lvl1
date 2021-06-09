package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Game;
import hexlet.code.util.Greet;
import hexlet.code.util.Cli;

import java.util.Map;

public class App {

    private static Map<Integer, Game> gameList = Map.of(
      2, new Even()
    );


    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
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
                gameList.get(choice).play();
        }
    }
}
