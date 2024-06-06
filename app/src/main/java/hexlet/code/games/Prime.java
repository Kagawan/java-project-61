package hexlet.code.games;
import static hexlet.code.Engine.MAX;
import static hexlet.code.Engine.NUMBEROFROUNDS;
import static hexlet.code.Engine.random;
import static hexlet.code.Engine.engine;
public class Prime {
    static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static String[][] prime() {
        String[][] questionAndAnswers = new String[NUMBEROFROUNDS][2];
        for (var questionAnswer : questionAndAnswers) {
            var randomNumber = random(1, MAX);
            questionAnswer[0] = Integer.toString(randomNumber);
            questionAnswer[1] = isSimple(randomNumber)  ? "yes" : "no";
        }
        engine(questionAndAnswers, QUESTION);
        return questionAndAnswers;
    }


    private static boolean isSimple(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i += 1) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
