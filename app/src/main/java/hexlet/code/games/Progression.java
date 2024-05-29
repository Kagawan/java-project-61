package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;
public class Progression {
    static final int RANDOM_NUMBER_FROM_0_TO_TEN = 10;
    private static String questionPlayer1;
    public static void progEngine(int randomNumber1, String str) {
        String[] words = str.split(" ");
        int[] answerProgress = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            answerProgress[i] = Integer.parseInt(words[i]);
        }
        words[randomNumber1] = "..";
        questionPlayer1 = Arrays.toString(words);
        String newWord = questionPlayer1.substring(0, questionPlayer1.length() - 1);
        String newWord2 = "Question: " + newWord.substring(1);
        String value = newWord2.replaceAll("\\s*,\\s*", " ");

        int answer = answerProgress[randomNumber1];
        Engine.engine(answer, value);
    }
    public static void progress() {
        Random random1 = new Random();
        String str = "5 7 9 11 13 15 17 19 21 23";
        String str2 = "2 5 8 11 14 17 20 23 26 29";
        String str3 = "14 19 24 29 34 39 44 49 54 59";
        int randomNumber1 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_TEN);
        int randomNumber2 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_TEN);
        int randomNumber3 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_TEN);
        System.out.println("What number is missing in the progression?");

        Progression.progEngine(randomNumber1, str);

        Progression.progEngine(randomNumber2, str2);

        Progression.progEngine(randomNumber3, str3);

        System.out.print("Congratulations, " + Cli.getName() + "!");
    }
}
