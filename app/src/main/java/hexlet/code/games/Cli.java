package hexlet.code.games;

import java.util.Scanner;

public class Cli {
    private static String name;
    public static void getCli() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
        return;
    }
    public static String getName() {
        return name;
    }
}
