package hexlet.code.util;

public class Greet {

    public static String askName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = Cli.inputString();
        System.out.printf("Hello, %s!\n", name);

        return name;
    }
}
