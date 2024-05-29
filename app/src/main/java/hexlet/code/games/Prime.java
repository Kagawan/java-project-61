package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Prime {
    static final int RANDOM_NUMBER_FROM_0_TO_100 = 100;
    static final int NUMBER_ROUNDS = 3;
    private static String questionPlayer;
    public static String isSimple(int number) {
        if (number < 2) {
            return "no";
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
    public static void prime() {
        Random random1 = new Random();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < NUMBER_ROUNDS; i++) {
            int randomNumber1 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_100);
            questionPlayer = "Question: " + randomNumber1;
            String answer = Prime.isSimple(randomNumber1);
            Engine.engine(answer, questionPlayer);
            System.out.print("Congratulations, " + Cli.getName() + "!");
        }
    }
}
