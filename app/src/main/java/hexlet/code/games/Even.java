package hexlet.code.games;

import static hexlet.code.Engine.MAX;
import static hexlet.code.Engine.NUMBEROFROUNDS;
import static hexlet.code.Engine.random;
import static hexlet.code.Engine.engine;

public class Even {
    static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static boolean evenOrOddNumber(int randomNumber) {
        return randomNumber % 2 == 0;
    }
    public static void even() {
        String[][] questionAndAnswers = new String[NUMBEROFROUNDS][2];
        for (var questionAnswer : questionAndAnswers) {
            var randomNumber = random(1, MAX);
            questionAnswer[0] = Integer.toString(randomNumber);
            questionAnswer[1] = evenOrOddNumber(randomNumber) ? "yes" : "no";
        }
        engine(questionAndAnswers, QUESTION);
    }
}
