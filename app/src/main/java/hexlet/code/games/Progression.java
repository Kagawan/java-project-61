package hexlet.code.games;

import static hexlet.code.Engine.MAX;
import static hexlet.code.Engine.NUMBEROFROUNDS;
import static hexlet.code.Engine.random;
import static hexlet.code.Engine.engine;

public class Progression {

    static final int INTERVALMIN = 3;
    static final int INTERVALMAX = 15;
    static final int LENGTHMIN = 5;
    static final int LENGTHMAX = 10;

     static final String QUESTION = "What number is missing in the progression?";

    public static void progression() {
        String[][] questionAndAnswers = new String[NUMBEROFROUNDS][2];
        for (var questionAnswer : questionAndAnswers) {
            var interval = random(INTERVALMIN, INTERVALMAX);
            var length = random(LENGTHMIN, LENGTHMAX);
            var randomNumber = random(1, MAX);
            var hollow = random(1, length);
            String[] createProgression = generateProgression(interval, length, randomNumber);
            String answer = createProgression[hollow - 1];
            createProgression[hollow - 1] = "..";
            questionAnswer[0] = String.join(" ", createProgression);
            questionAnswer[1] = answer;

        }
        engine(questionAndAnswers, QUESTION);
    }


    public static String[] generateProgression(int interval, int length, int number) {
        String[] progression = new String[length];
        for (var i = 0; i < length; i++) {
            progression[i] = Integer.toString(number + i * interval);
        }
        return progression;
    }
}
