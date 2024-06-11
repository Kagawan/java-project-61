package hexlet.code.games;

import java.util.Scanner;
public class App {
    static final int CHOOSE_GAMES_0 = 0;
    static final int CHOOSE_GAMES_1 = 1;
    static final int CHOOSE_GAMES_2 = 2;
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
        String chooseGame = scanner.next();
        boolean isOnlyDigits = true;
        for (int i = 0; i < chooseGame.length() && isOnlyDigits; i++) {
            if (!Character.isDigit(chooseGame.charAt(i))) {
                System.exit(0);
            }
        }
        int chooseGame1 = Integer.parseInt(chooseGame);
        if (chooseGame1 == CHOOSE_GAMES_0) {
        return;
        }
        System.out.println();
        if (chooseGame1 == CHOOSE_GAMES_1) {
            Cli.getCli();
        }
        if (chooseGame1 == CHOOSE_GAMES_2) {
            Even.even();
        }
        if (chooseGame1 == CHOOSE_GAMES_3) {
            Calc.calculator();
        }
        if (chooseGame1 == CHOOSE_GAMES_4) {
            Gcd.gcd();
        }
        if (chooseGame1 == CHOOSE_GAMES_5) {
            Progression.progression();
        }
        if (chooseGame1 == CHOOSE_GAMES_6) {
            Prime.prime();
        }
    }
}
