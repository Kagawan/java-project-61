package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Calc {
    static final int RANDOM_NUMBER_FROM_0_TO_100 = 100;
    static final int NUMBER_ROUNDS = 3;
    private static String questionPlayer;
    private static String randomSymbol;
    public static boolean issNumeric(String str) {
        boolean isOnlyDigits = true;
        for (int i = 0; i < str.length() && isOnlyDigits; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isOnlyDigits = false;
                return false;
                //System.exit(0);
            }
        }
        return isOnlyDigits;
    }
    public static void item() {
        Random rand = new Random();
        String[] items = {"+", "-", "*"};
        randomSymbol = items[rand.nextInt(items.length)];
    }
    public static void getCalc(int randomNumber1, int randomNumber2) {
        int answer;
        if (randomSymbol.equals("+")) {
            answer = randomNumber1 + randomNumber2;
        } else {
            if (randomSymbol.equals("-")) {
                answer = randomNumber1 - randomNumber2;
            } else {
                answer = randomNumber1 * randomNumber2;
            }
        }
        Engine.engine(answer, questionPlayer);
        return;
    }
    public static void calculator() {
        System.out.println("What is the result of the expression?");
        Random random1 = new Random();
        for (int i = 0; i < NUMBER_ROUNDS; i++) {
            int randomNumber1 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_100);
            int randomNumber2 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_100);
            Calc.item();
            questionPlayer = "Question: " + randomNumber1 + " " + randomSymbol + " " + randomNumber2;
            Calc.getCalc(randomNumber1, randomNumber2);
        }
        System.out.print("Congratulations, " + Cli.getName() + "!");
    }
}
