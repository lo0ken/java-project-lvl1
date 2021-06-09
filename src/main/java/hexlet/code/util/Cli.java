package hexlet.code.util;

import java.util.Scanner;

public class Cli {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String inputString() {
        return SCANNER.nextLine();
    }
}
