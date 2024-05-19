package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Calc {
    static final int RANDOM_NUMBER_FROM_0_TO_100 = 100;
    private static String randomNumber;
    public static void issNumeric(String str) {
        boolean isOnlyDigits = true;
        for (int i = 0; i < str.length() && isOnlyDigits; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isOnlyDigits = false;
                System.exit(0);
            }
        }
    }
    public static void item() {
        List<String> items = new ArrayList<>();
        items.add("+");
        items.add("-");
        items.add("*");
        int index = (new Random()).nextInt(items.size());
        randomNumber = items.get(index);
    }
    public static void getCalc(int randomNumber1, int randomNumber2) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        int answer;
        if (randomNumber.equals("+")) {
            answer = randomNumber1 + randomNumber2;
        } else {
            if (randomNumber.equals("-")) {
                answer = randomNumber1 - randomNumber2;
            } else {
                answer = randomNumber1 * randomNumber2;
            }
        }
        System.out.print("Your answer: ");
        String userSelection = scanner.next();
        if (userSelection.contains("-")) {
            str = userSelection.replace("-", "");
            Calc.issNumeric(str);
        } else {
            Calc.issNumeric(userSelection);
        }
        int userSelection1 = Integer.parseInt(userSelection);
        Engine.engine(answer, userSelection1);
        return;
    }
    public static void calculator() {
        System.out.println("What is the result of the expression?");
        System.out.print("Question: ");
        Random random1 = new Random();
        int randomNumber1 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_100);
        int randomNumber2 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_100);
        int randomNumber3 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_100);
        int randomNumber4 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_100);
        int randomNumber5 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_100);
        int randomNumber6 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_100);
        Calc.item();
        System.out.println(randomNumber1 + " " + randomNumber + " " + randomNumber2);
        Calc.getCalc(randomNumber1, randomNumber2);
        System.out.print("Question: ");
        Calc.item();
        System.out.println(randomNumber3 + " " + randomNumber + " " + randomNumber4);
        Calc.getCalc(randomNumber3, randomNumber4);
        System.out.print("Question: ");
        Calc.item();
        System.out.println(randomNumber5 + " " + randomNumber + " " + randomNumber6);
        Calc.getCalc(randomNumber5, randomNumber6);
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
