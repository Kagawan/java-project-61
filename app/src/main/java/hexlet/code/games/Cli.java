package hexlet.code.games;

import java.util.Scanner;

public class Cli {
    private static String name;
    public static void getCli() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        name = scanner.next();
        System.out.print("Hello, " + name + "!");
    }
}
