package hexlet.code.games;

import java.util.Scanner;

public final class Cli {
    public static String name;
    public static void getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
        return;
    }
}
