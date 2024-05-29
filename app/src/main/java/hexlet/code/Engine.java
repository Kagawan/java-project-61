package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;

import java.util.Scanner;

public class Engine {
    public static void engine(Object answer, Object questionPlayer) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        System.out.println(questionPlayer);
        System.out.print("Your answer: ");
        String userSelection1 = scanner.next();
        boolean userSelectionIsEven = Calc.issNumeric(userSelection1);
        if (userSelection1.contains("-")) {
            str = userSelection1.replace("-", "");
            Calc.issNumeric(str);
            int userSelection2 = Integer.parseInt(userSelection1);
            correctAnswer(answer, userSelection2);
        } else if (userSelectionIsEven) {
            Calc.issNumeric(userSelection1);
            int userSelection2 = Integer.parseInt(userSelection1);
            correctAnswer(answer, userSelection2);
        } else {
            correctAnswer(answer, userSelection1);
        }
    }
    public static void correctAnswer(Object answer, Object userSelection1) {
        if (!answer.equals(userSelection1)) {
            System.out.println("'" + userSelection1 + "'" + " is wrong answer ;(. Correct answer was " + "'"
                    + answer + "'.");
            System.out.println("Let's try again, " + Cli.getName() + "!");
            System.exit(0);
        } else {
            System.out.println("Correct!");
        }
    }
}
