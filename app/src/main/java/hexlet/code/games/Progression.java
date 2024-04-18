package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.games.Cli.name;
import static org.apache.commons.lang3.StringUtils.isNumeric;


public class Progression {
    public static void progres() {
        Scanner scanner = new Scanner(System.in);
        Random random1 = new Random();
        int randomNumber1 = random1.nextInt(10);
        int randomNumber2 = random1.nextInt(10);
        int randomNumber3 = random1.nextInt(10);
        System.out.println("What number is missing in the progression?");
        System.out.print("Question: ");
        String str = "5 7 9 11 13 15 17 19 21 23";
        String[] words = str.split(" ");
        int[] answer1 = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            answer1[i] = Integer.parseInt(words[i]);
            //System.out.print(answer1[i] + " ");
        }
        words[randomNumber1] = "..";
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.print("Your answer: ");
        String userSelection = scanner.next();
        boolean vibor = isNumeric(userSelection);
        if (vibor == false) {
            return;
        }
        int userSelection1 = Integer.parseInt(userSelection);
        if (answer1[randomNumber1] != userSelection1) {
            System.out.println("'" + userSelection + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer1[randomNumber1] + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        }
        System.out.println("Correct!");


        System.out.print("Question: ");
        String str2 = "2 5 8 11 14 17 20 23 26 29";
        String[] words2 = str2.split(" ");
        int[] answer2 = new int[words2.length];
        for (int i = 0; i < words2.length; i++) {
            answer2[i] = Integer.parseInt(words2[i]);
            //System.out.print(answer2[i] + " ");
        }
        words2[randomNumber2] = "..";
        for (String word2 : words2) {
            System.out.print(word2 + " ");
        }
        System.out.println();
        System.out.print("Your answer: ");
        String userSelection2 = scanner.next();
        boolean vibor2 = isNumeric(userSelection2);
        if (vibor2 == false) {
            return;
        }
        int userSelection22 = Integer.parseInt(userSelection2);
        if (answer2[randomNumber2] != userSelection22) {
            System.out.println("'" + userSelection2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer2[randomNumber2] + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        }
        System.out.println("Correct!");


        System.out.print("Question: ");
        String str3 = "14 19 24 29 34 39 44 49 54 59";
        String[] words3 = str3.split(" ");
        int[] answer3 = new int[words3.length];
        for (int i = 0; i < words3.length; i++) {
            answer3[i] = Integer.parseInt(words3[i]);
            //System.out.print(answer2[i] + " ");
        }
        words3[randomNumber3] = "..";
        for (String word3 : words3) {
            System.out.print(word3 + " ");
        }
        System.out.println();
        System.out.print("Your answer: ");
        String userSelection3 = scanner.next();
        boolean vibor3 = isNumeric(userSelection3);
        if (vibor3 == false) {
            return;
        }
        int userSelection33 = Integer.parseInt(userSelection3);
        if (answer3[randomNumber3] != userSelection33) {
            System.out.println("'" + userSelection3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer3[randomNumber3] + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        }
        System.out.println("Correct!");
        System.out.println("Congratulations, " + name + "!");
    }
}