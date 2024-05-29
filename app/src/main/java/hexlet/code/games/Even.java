package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    static final int RANDOM_NUMBER_FROM_0_TO_100 = 100;
    static final int NUMBER_ROUNDS = 3;
    public static int chetNechet(int number) {
        if ((number % 2) == 0) {
            return 2;
        } else {
            if ((number % 1) == 0) {
                return 1;
            }
        }
        return 0;
    }
    public static void getEven() {
        Random random = new Random();
        String questionPlayer;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String answer2;
        for (int i = 0; i < NUMBER_ROUNDS; i++) {
            int randomNumber = random.nextInt(RANDOM_NUMBER_FROM_0_TO_100);
            questionPlayer = "Question: " + randomNumber;
            int answer1 = Even.chetNechet(randomNumber);
            if (answer1 == 2) {
                answer2 = "yes";
            } else {
                answer2 = "no";
            }
            Engine.engine(answer2, questionPlayer);
        }
        System.out.print("Congratulations, " + Cli.getName() + "!");
    }
}
