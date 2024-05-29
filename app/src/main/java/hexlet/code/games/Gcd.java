package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
public class Gcd {
    static final int RANDOM_NUMBER_FROM_0_TO_100 = 100;
    static final int NUMBER_ROUNDS = 3;
    private static String questionPlayer;
    //public static int answerGcd;
    public static void engineGcd(int randomNumber1, int randomNumber2) {
        while (randomNumber2 != 0) {
            int tmp = randomNumber1 % randomNumber2;
            randomNumber1 = randomNumber2;
            randomNumber2 = tmp;
        }
        int answerGcd = randomNumber1;
        Engine.engine(answerGcd, questionPlayer);
    }
    public static void getGcd() {
        System.out.println("Find the greatest common divisor of given numbers.");
        Random random1 = new Random();
        for (int i = 0; i < NUMBER_ROUNDS; i++) {
            int randomNumber1 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_100);
            int randomNumber2 = random1.nextInt(RANDOM_NUMBER_FROM_0_TO_100);
            questionPlayer = "Question: " + randomNumber1 + " " + randomNumber2;
            Gcd.engineGcd(randomNumber1, randomNumber2);
            System.out.print("Congratulations, " + Cli.getName() + "!");
        }
    }
}
