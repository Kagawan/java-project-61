package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import static hexlet.code.games.Cli.name;
import static org.apache.commons.lang3.StringUtils.isNumeric;

public class Calc {
    public static void getCalc() {
        Scanner scanner = new Scanner(System.in);
        int answer;
        int answer2;
        int answer3;
        boolean i;
        int a;
        System.out.println("What is the result of the expression?");
        System.out.print("Question: ");
        String symbols = "+-*";
        String random = new Random().ints(1, 0, symbols.length())
                .mapToObj(symbols::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());
        String random2 = new Random().ints(1, 0, symbols.length())
                .mapToObj(symbols::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());
        String random3 = new Random().ints(1, 0, symbols.length())
                .mapToObj(symbols::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());
        Random random1 = new Random();
        int randomNumber1 = random1.nextInt(100);
        int randomNumber2 = random1.nextInt(100);
        int randomNumber3 = random1.nextInt(100);
        int randomNumber4 = random1.nextInt(100);
        int randomNumber5 = random1.nextInt(100);
        int randomNumber6 = random1.nextInt(100);
        System.out.println(randomNumber1 + " " + random + " " + randomNumber2);
        if (random.equals("+")) {
            answer = randomNumber1 + randomNumber2;
        } else {
            if (random.equals("-")) {
                answer = randomNumber1 - randomNumber2;
            } else {
                answer = randomNumber1 * randomNumber2;
            }
        }
        System.out.print("Your answer: ");

        String str = "";
        String str2 = "";
        String str3 = "";
        String userSelection = scanner.next();
        if (userSelection.contains("-")) {
            str = userSelection.replace("-", "");
            boolean vibor = isNumeric(str);
            if (vibor == false) {
                return;
            }
        }  else {
            boolean vibor = isNumeric(userSelection);
            if (vibor == false) {
                return;
            }
        }
        //String userSelection = scanner.hasNext();
        int userSelection1 = Integer.parseInt(userSelection);
        /*if (userSelection.equals(true)) {
            int userSelection1 = Integer.parseInt(userSelection);
        }*/
        if (answer != userSelection1) {
            System.out.println("'" + userSelection + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        }
        System.out.println("Correct!");


        System.out.print("Question: ");
        System.out.println(randomNumber3 + " " + random2 + " " + randomNumber4);
        if (random2.equals("+")) {
            answer2 = randomNumber3 + randomNumber4;
        } else {
            if (random2.equals("-")) {
                answer2 = randomNumber3 - randomNumber4;
            } else {
                answer2 = randomNumber3 * randomNumber4;
            }
        }
        System.out.print("Your answer: ");
        String userSelection22 = scanner.next();
        if (userSelection22.contains("-")) {
            str2 = userSelection22.replace("-", "");
            boolean vibor2 = isNumeric(str2);
            if (vibor2 == false) {
                return;
            }
        } else {
            boolean vibor2 = isNumeric(userSelection22);
            if (vibor2 == false) {
                return;
            }
        }
        int userSelection2 = Integer.parseInt(userSelection22);
        if (answer2 != userSelection2) {
            System.out.println("'" + userSelection2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer2 + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        }
        System.out.println("Correct!");


        System.out.print("Question: ");
        System.out.println(randomNumber5 + " " + random3 + " " + randomNumber6);
        if (random3.equals("+")) {
            answer3 = randomNumber5 + randomNumber6;
        } else {
            if (random3.equals("-")) {
                answer3 = randomNumber5 - randomNumber6;
            } else {
                answer3 = randomNumber5 * randomNumber6;
            }
        }
        System.out.print("Your answer: ");
        String userSelection33 = scanner.next();
        if (userSelection33.contains("-")) {
            str3 = userSelection33.replace("-", "");
            boolean vibor3 = isNumeric(str3);
            if (vibor3 == false) {
                return;
            }
        } else {
            boolean vibor3 = isNumeric(userSelection33);
            if (vibor3 == false) {
                return;
            }
        }
        int userSelection3 = Integer.parseInt(userSelection33);
        if (answer3 != userSelection3) {
            System.out.println("'" + userSelection3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + answer3 + "'.");
            System.out.println("Let's try again, " + name + "!");
            return;
        }
        System.out.println("Correct!");
        System.out.println("Congratulations, " + name + "!");
        return;
    }
}
