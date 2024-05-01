package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Cli.name;
import static org.apache.commons.lang3.StringUtils.isNumeric;


public class Progression {
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
        boolean vibor = isNumeric(userSelection);
        if (!vibor) {
            return;
        }
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
        int randomNumber1 = random1.nextInt(10);
        int randomNumber2 = random1.nextInt(10);
        int randomNumber3 = random1.nextInt(10);
        System.out.println("What number is missing in the progression?");
        System.out.print("Question: ");
        Progression.progEngine(randomNumber1, str);

        System.out.print("Question: ");
        Progression.progEngine(randomNumber2, str2);

        System.out.print("Question: ");
        Progression.progEngine(randomNumber3, str3);
        System.out.print("Congratulations, " + name + "!");
    }
}
