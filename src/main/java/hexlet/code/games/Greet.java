package hexlet.code.games;

import hexlet.code.util.Cli;

public class Greet implements Game {

    @Override
    public final void play() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = Cli.inputString();
        System.out.printf("Hello, %s!", name);
    }
}
