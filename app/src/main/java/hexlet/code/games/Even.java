package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Cli.name;

public class Even {
    public static String chetNechet(int number) {
        if ((number % 2) == 0) {
            return "yes";
        } else {
            if ((number % 1) == 0) {
                return "no";
            }
        }
        return "";
    }
    public static void getEven() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int randomNumber = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);
        int randomNumber3 = random.nextInt(100);
        System.out.print("Question: " + randomNumber + "\n" + "Your answer: ");
        String answer1 = Even.chetNechet(randomNumber);
        String userSelection1 = scanner.next();
        Engine.engine(answer1, userSelection1);
        System.out.print("Question: " + randomNumber2 + "\n" + "Your answer: ");
        String answer2 = Even.chetNechet(randomNumber2);
        String userSelection2 = scanner.next();
        Engine.engine(answer2, userSelection2);
        System.out.print("Question: " + randomNumber3 + "\n" + "Your answer: ");
        String answer3 = Even.chetNechet(randomNumber3);
        String userSelection3 = scanner.next();
        Engine.engine(answer3, userSelection3);
        System.out.println("Congratulations, " + name + "!");
    }
}
