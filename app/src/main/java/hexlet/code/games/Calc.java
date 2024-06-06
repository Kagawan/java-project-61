package hexlet.code.games;

import static hexlet.code.Engine.MAX;
import static hexlet.code.Engine.NUMBEROFROUNDS;
import static hexlet.code.Engine.random;
import static hexlet.code.Engine.engine;

public class Calc {
    private static final String QUESTION = "What is the result of the expression?";
    private static int randomNumber1;
    private static int randomNumber2;
    public static String[][] calculator() {
        String[][] questionAndAnswers = new String[NUMBEROFROUNDS][2];
        for (var questionAnswer : questionAndAnswers) {
            randomNumber1 = random(1, MAX);
            randomNumber2 = random(1, MAX);
            var randomNumber = (int) (Math.random() * NUMBEROFROUNDS) + 1;
            var array = new String[]{"0", "*", "+", "-"};
            var operator = array[randomNumber];
            questionAnswer[1] = String.valueOf(item(operator));
            questionAnswer[0] = Integer.toString(randomNumber1)
                    + " " + operator + " "
                    + Integer.toString(randomNumber2);
        }
        engine(questionAndAnswers, QUESTION);
        return questionAndAnswers;
    }

    public static int item(String operator) {
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
