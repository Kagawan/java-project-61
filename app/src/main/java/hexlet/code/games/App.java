package hexlet.code.games;

import java.util.Scanner;
public class App {
    static final int CHOOSE_GAMES_3 = 3;
    static final int CHOOSE_GAMES_4 = 4;
    static final int CHOOSE_GAMES_5 = 5;
    static final int CHOOSE_GAMES_6 = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - Gcd\n" + "5 - Progression\n" + "6 "
                + "- Prime\n" + "0 - Exit");
        System.out.print("Your choice: ");
        String userSelection = scanner.next();
        Calc.issNumeric(userSelection);
        int userSelection1 = Integer.parseInt(userSelection);
        if (userSelection1 == 0) {
            return;
        }
        System.out.println();
        if (userSelection1 == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getCli();
        }
        if (userSelection1 == 2) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getCli();
            Even.getEven();
            return;
        }
        if (userSelection1 == CHOOSE_GAMES_3) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getCli();
            Calc.calculator();
            return;
        }
        if (userSelection1 == CHOOSE_GAMES_4) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getCli();
            Gcd.getGcd();
            return;
        }
        if (userSelection1 == CHOOSE_GAMES_5) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getCli();
            Progression.progres();
            return;
        }
        if (userSelection1 == CHOOSE_GAMES_6) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getCli();
            Prime.prime();
            return;
        }
    }
}
