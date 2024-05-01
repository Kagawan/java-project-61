package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Cli.name;

public class Prime {
    public static String isSimple(int number) {
        if (number < 2) {
            return "no";
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
    public static void prime() {
        Scanner scanner = new Scanner(System.in);
        Random random1 = new Random();
        int randomNumber1 = random1.nextInt(100);
        int randomNumber2 = random1.nextInt(100);
        int randomNumber3 = random1.nextInt(100);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        System.out.println("Question: " + randomNumber1);
        String answer = Prime.isSimple(randomNumber1);
        System.out.print("Your answer: ");
        String userSelection = scanner.next();
        Engine.engine(answer, userSelection);

        System.out.println("Question: " + randomNumber2);
        String answer2 = Prime.isSimple(randomNumber2);
        System.out.print("Your answer: ");
        String userSelection2 = scanner.next();
        Engine.engine(answer2, userSelection2);
        System.out.println("Question: " + randomNumber3);
        String answer3 = Prime.isSimple(randomNumber3);
        System.out.print("Your answer: ");
        String userSelection3 = scanner.next();
        Engine.engine(answer3, userSelection3);
        System.out.print("Congratulations, " + name + "!");
    }
}
