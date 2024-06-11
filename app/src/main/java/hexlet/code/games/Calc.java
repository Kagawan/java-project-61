package hexlet.code.games;

import static hexlet.code.Engine.MAX;
import static hexlet.code.Engine.NUMBEROFROUNDS;
import static hexlet.code.Engine.random;
import static hexlet.code.Engine.engine;

public class Calc {
    private static final String QUESTION = "What is the result of the expression?";
    /*private static int randomNumber1;
    private static int randomNumber2;*/
    public static void calculator() {
        String[][] questionAndAnswers = new String[NUMBEROFROUNDS][2];
        for (var questionAnswer : questionAndAnswers) {
            int randomNumber1 = random(1, MAX);
            int randomNumber2 = random(1, MAX);
            var randomNumber = (int) (Math.random() * NUMBEROFROUNDS);
            var array = new String[]{"*", "+", "-"};
            var operator = array[randomNumber];
            questionAnswer[1] = String.valueOf(item(operator, randomNumber1, randomNumber2));
            questionAnswer[0] = Integer.toString(randomNumber1)
                    + " " + operator + " "
                    + Integer.toString(randomNumber2);
        }
        engine(questionAndAnswers, QUESTION);
    }

    public static int item(String operator, int randomNumber1, int  randomNumber2) {
        switch (operator) {
            case "*" -> {
                return randomNumber1 * randomNumber2;
            }
            case "-" -> {
                return randomNumber1 - randomNumber2;
            }
            case "+" -> {
                return randomNumber1 + randomNumber2;
            }
            default -> {
                throw new RuntimeException("Unknown input");
            }
        }
    }
}
