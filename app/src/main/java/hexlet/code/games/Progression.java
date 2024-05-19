package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
public class Progression {
    static final int RANDOM_NUMBER_FROM_0_TO_TEN = 10;
    public static void progEngine(int randomNumber1, String str) {
        Scanner scanner = new Scanner(System.in);
        String[] words = str.split(" ");
        int[] answerProgress = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            answerProgress[i] = Integer.parseInt(words[i]);
        }
        words[randomNumber1] = "..";
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.print("Your answer: ");
        String userSelection = scanner.next();
        Calc.issNumeric(userSelection);
        int userSelection1 = Integer.parseInt(userSelection);
        int answer = answerProgress[randomNumber1];
        Engine.engine(answer, userSelection1);
    }
    public static void progres() {
        Scanner scanner = new Scanner(System.in);
        Random random1 = new Random();
        String str = "5 7 9 11 13 15 17 19 21 23";
        String str2 = "2 5 8 11 14 17 20 23 26 29";
        String str3 = "14 19 24 29 34 39 44 49 54 59";
        int randomNumber1 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_TEN);
        int randomNumber2 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_TEN);
        int randomNumber3 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_TEN);
        System.out.println("What number is missing in the progression?");
        System.out.print("Question: ");
        Progression.progEngine(randomNumber1, str);

        System.out.print("Question: ");
        Progression.progEngine(randomNumber2, str2);

        System.out.print("Question: ");
        Progression.progEngine(randomNumber3, str3);
        System.out.print("Congratulations, " + Cli.getName() + "!");
    }
}
