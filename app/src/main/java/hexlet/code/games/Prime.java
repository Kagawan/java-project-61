package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Cli.name;

public class Prime {
    /*private static Integer random1;
    public Prime(Integer random1) {
        Random random3 = new Random();
        int randomNumber1 = random3.nextInt(100);
        this.random1 = randomNumber1;
    }*/
    public static String isSimple(int number) {
        if(number < 2) return "no";
        for(int i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
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
        System.out.print("Your answer: ");
        String userSelection1 = scanner.next();
        String answer1 = Prime.isSimple(randomNumber1);
        if (!answer1.equals(userSelection1)) {
            System.out.println("'" + userSelection1 + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer1 + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        } else {
            System.out.println("Correct!");
        }


        System.out.println("Question: " + randomNumber2);
        System.out.print("Your answer: ");
        String userSelection2 = scanner.next();
        String answer2 = Prime.isSimple(randomNumber2);
        if (!answer2.equals(userSelection2)) {
            System.out.println("'" + userSelection2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer2 + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        } else {
            System.out.println("Correct!");
        }


        System.out.println("Question: " + randomNumber3);
        System.out.print("Your answer: ");
        String userSelection3 = scanner.next();
        String answer3 = Prime.isSimple(randomNumber3);
        if (!answer3.equals(userSelection3)) {
            System.out.println("'" + userSelection3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer3 + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        } else {
            System.out.println("Correct!");
            System.out.print("Congratulations, " + name + "!");
        }
    }
}
