package hexlet.code;

import hexlet.code.games.Cli;

import java.util.Random;
import java.util.Scanner;
public class Engine {
    public static void engine(Object answer, Object userSelection) {
        Scanner scanner = new Scanner(System.in);
        Random random1 = new Random();
        if (!answer.equals(userSelection)) {
            System.out.println("'" + userSelection + "'" + " is wrong answer ;(. Correct answer was " + "'"
                    + answer + "'.");
            System.out.println("Let's try again, " + Cli.getName() + "!");
            System.exit(0);
        } else {
            System.out.println("Correct!");
        }
    }
}
