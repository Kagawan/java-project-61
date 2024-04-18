package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Cli.name;

public class Even {
    public static String Chet_Nechet(int number) {
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
        String userSelection1 = scanner.next();


        String answer1 = Even.Chet_Nechet(randomNumber);
        if (!answer1.equals(userSelection1)) {
            System.out.println("'" + userSelection1 + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer1 + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        } else {
            System.out.println("Correct!");
        }

        /*if (randomNumber % 2 == 0) {
            if (userSelection1.equals("yes")) {
                System.out.println("Correct!");
            } else { System.out.println("'"  + userSelection1 + "' is wrong answer ;(. Correct answer was 'yes'.\n" +
                        "Let's try again, " + name + "!");
                return;
            }
        }
        if (randomNumber % 2 != 0) {
            if (userSelection1.equals("no")) {
                System.out.println("Correct!");
            } else { System.out.println("'" + userSelection1 + "' is wrong answer ;(. Correct answer was 'no'.\n" +
                    "Let's try again, " + name + "!");
                return;
            }
        }*/
        System.out.print("Question: " + randomNumber2 + "\n" + "Your answer: ");
        String userSelection2 = scanner.next();
        if (randomNumber2 % 2 == 0) {
            if (userSelection2.equals("yes")) {
                System.out.println("Correct!");
            } else { System.out.println("'" + userSelection2 + "' is wrong answer ;(. Correct answer was 'yes'.\n" +
                    "Let's try again, " + name + "!");
                return;
            }
        }
        if (randomNumber2 % 2 != 0) {
            if (userSelection2.equals("no")) {
                System.out.println("Correct!");
            } else { System.out.println("'" + userSelection2 + "' is wrong answer ;(. Correct answer was 'no'.\n" +
                    "Let's try again, " + name + "!");
                return;
            }
        }
        System.out.print("Question: " + randomNumber3 + "\n" + "Your answer: ");
        String userSelection3 = scanner.next();
        if (randomNumber3 % 2 == 0) {
            if (userSelection3.equals("yes")) {
                System.out.println("Correct!");
                System.out.println("Congratulations, " + name + "!");
            } else { System.out.println("'" + userSelection3 + "' is wrong answer ;(. Correct answer was 'yes'.\n" +
                    "Let's try again, " + name + "!");
                return;
            }
        }
        if (randomNumber3 % 2 != 0) {
            if (userSelection3.equals("no")) {
                System.out.println("Correct!");
                System.out.println("Congratulations, " + name + "!");
            } else { System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                    "Let's try again, " + name + "!");
                return;
            }
        }
    }
}
