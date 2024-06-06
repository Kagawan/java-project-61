package hexlet.code.games;

import static hexlet.code.Engine.MAX;
import static hexlet.code.Engine.NUMBEROFROUNDS;
import static hexlet.code.Engine.random;
import static hexlet.code.Engine.engine;

public class Gcd {
    static final String QUESTION = "Find the greatest common divisor of given numbers.";
    public static String[][] gcd() {
        String[][] questionAndAnswers = new String[NUMBEROFROUNDS][2];
        for (var questionAnswer : questionAndAnswers) {
            var randomNumber1 = random(1, MAX);
            var randomNumber2 = random(1, MAX);
            questionAnswer[0] = Integer.toString(randomNumber1) +  " " + Integer.toString(randomNumber2);
            questionAnswer[1] = Integer.toString(checkGcd(randomNumber1, randomNumber2));
        }
        engine(questionAndAnswers, QUESTION);
        return questionAndAnswers;
    }
    public static int checkGcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : checkGcd(b, a % b);
    }
}
