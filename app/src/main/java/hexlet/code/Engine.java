package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int MAX = 100;
    public static final int NUMBEROFROUNDS = 3;
    public static void engine(String[][] answersAndQuestion, String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(question);
        for (var questionAnswer : answersAndQuestion) {
            System.out.println("Question: " + questionAnswer[0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (!answer.equals(questionAnswer[1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionAnswer[1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.print("Congratulations, " + name + "!");
    }
    public static int random(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min - 1) + min;
    }
}
