package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Cli.name;

public class Gcd {
    //public static int answerGcd;
    public static void engineGcd(int randomNumber1, int randomNumber2) {
        Scanner scanner = new Scanner(System.in);
        while (randomNumber2 != 0) {
            int tmp = randomNumber1 % randomNumber2;
            randomNumber1 = randomNumber2;
            randomNumber2 = tmp;
        }
        int answerGcd = randomNumber1;
        System.out.print("Your answer: ");
        String userSelection = scanner.next();
        Calc.issNumeric(userSelection);
        /*boolean vibor = isNumeric(userSelection);
        if (!vibor) {
            return;
        }*/
        int userSelection1 = Integer.parseInt(userSelection);
        Engine.engine(answerGcd, userSelection1);
    }
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
        Gcd.engineGcd(randomNumber1, randomNumber2);
        System.out.print("Question: ");
        System.out.println(randomNumber3 + " " + randomNumber4);
        Gcd.engineGcd(randomNumber3, randomNumber4);
        System.out.print("Question: ");
        System.out.println(randomNumber5 + " " + randomNumber6);
        Gcd.engineGcd(randomNumber5, randomNumber6);
        System.out.println("Congratulations, " + name + "!");
    }
}
