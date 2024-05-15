package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Cli.name;

public class Calc {
    public static String randomItem;
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
        randomItem = items.get(index);
    }
    public static void getCalc(int randomNumber1, int randomNumber2) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        int answer;
        if (randomItem.equals("+")) {
            answer = randomNumber1 + randomNumber2;
        } else {
            if (randomItem.equals("-")) {
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
            /*boolean vibor = isNumeric(str);
            if (!vibor) {
                System.exit(0);
            }
        } else {
            boolean vibor = isNumeric(userSelection);
            if (!vibor) {
                System.exit(0);
            }
        }*/
        int userSelection1 = Integer.parseInt(userSelection);
        Engine.engine(answer, userSelection1);
        return;
    }
    public static void calculator() {
        System.out.println("What is the result of the expression?");
        System.out.print("Question: ");
        Random random1 = new Random();
        int randomNumber1 = random1.nextInt(100);
        int randomNumber2 = random1.nextInt(100);
        int randomNumber3 = random1.nextInt(100);
        int randomNumber4 = random1.nextInt(100);
        int randomNumber5 = random1.nextInt(100);
        int randomNumber6 = random1.nextInt(100);
        Calc.item();
        System.out.println(randomNumber1 + " " + randomItem + " " + randomNumber2);
        Calc.getCalc(randomNumber1, randomNumber2);
        System.out.print("Question: ");
        Calc.item();
        System.out.println(randomNumber3 + " " + randomItem + " " + randomNumber4);
        Calc.getCalc(randomNumber3, randomNumber4);
        System.out.print("Question: ");
        Calc.item();
        System.out.println(randomNumber5 + " " + randomItem + " " + randomNumber6);
        Calc.getCalc(randomNumber5, randomNumber6);
        System.out.println("Congratulations, " + name + "!");
    }
}
