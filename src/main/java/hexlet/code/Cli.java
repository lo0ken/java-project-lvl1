package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static final Scanner scanner = new Scanner(System.in);

    public static String askName() {
        System.out.print("May I have your name? ");
        return scanner.nextLine();
    }
}
