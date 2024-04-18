package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Cli.name;
import static org.apache.commons.lang3.StringUtils.isNumeric;

public class Gcd {
    public static void getGcd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        Random random1 = new Random();
        int randomNumber1 = random1.nextInt(100);
        int randomNumber2 = random1.nextInt(100);
        int randomNumber3 = random1.nextInt(100);
        int randomNumber4 = random1.nextInt(100);
        int randomNumber5 = random1.nextInt(100);
        int randomNumber6 = random1.nextInt(100);
        System.out.print("Question: ");
        System.out.println(randomNumber1 + " " + randomNumber2);
        while (randomNumber2 !=0) {
            int tmp = randomNumber1%randomNumber2;
            randomNumber1 = randomNumber2;
            randomNumber2 = tmp;
        }
        int answer1 = randomNumber1;
        System.out.print("Your answer: ");
        String userSelection = scanner.next();
        boolean vibor = isNumeric(userSelection);
        if (vibor == false) {
            return;
        }
        int userSelection1 = Integer.parseInt(userSelection);
        if (answer1 != userSelection1) {
            System.out.println("'" + userSelection + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer1 + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        }
        System.out.println("Correct!");


        System.out.print("Question: ");
        System.out.println(randomNumber3 + " " + randomNumber4);
        while (randomNumber4 !=0) {
            int tmp = randomNumber3%randomNumber4;
            randomNumber3 = randomNumber4;
            randomNumber4 = tmp;
        }
        int answer2 = randomNumber3;
        System.out.print("Your answer: ");
        String userSelection2 = scanner.next();
        boolean vibor2 = isNumeric(userSelection2);
        if (vibor2 == false) {
            return;
        }
        int userSelection22 = Integer.parseInt(userSelection2);
        if (answer2 != userSelection22) {
            System.out.println("'" + userSelection2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer2 + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        }
        System.out.println("Correct!");


        System.out.print("Question: ");
        System.out.println(randomNumber5 + " " + randomNumber6);
        while (randomNumber6 !=0) {
            int tmp = randomNumber5%randomNumber6;
            randomNumber5 = randomNumber6;
            randomNumber6 = tmp;
        }
        int answer3 = randomNumber5;
        System.out.print("Your answer: ");
        String userSelection3 = scanner.next();
        boolean vibor3 = isNumeric(userSelection3);
        if (vibor3 == false) {
            return;
        }
        int userSelection33 = Integer.parseInt(userSelection3);
        if (answer3 != userSelection33) {
            System.out.println("'" + userSelection3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer3 + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        }
        System.out.println("Correct!");
        System.out.println("Congratulations, " + name + "!");
    }
}
