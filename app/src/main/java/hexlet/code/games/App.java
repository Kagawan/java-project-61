package hexlet.code.games;

import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - Gcd\n" + "5 - Progression\n" + "6 - Prime\n" + "0 - Exit");
        System.out.print("Your choice: ");
        String userSelection = scanner.next();
        boolean vibor = isNumeric(userSelection);
        if (vibor == false) {
            return;
        }
        int userSelection1 = Integer.parseInt(userSelection);
        if (userSelection1 == 0) {
            return;
        }
        System.out.println();
        if (userSelection1 == 1) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getName();
        }
        if (userSelection1 == 2) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getName();
            Even.getEven();
            return;
        }
        if (userSelection1 == 3) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getName();
            Calc.getCalc();
            return;
        }
        if (userSelection1 == 4) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getName();
            Gcd.getGcd();
            return;
        }
        if (userSelection1 == 5) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getName();
            Progression.progres();
            return;
        }
        if (userSelection1 == 6) {
            System.out.println("Welcome to the Brain Games!");
            Cli.getName();
            Prime.prime();
            return;
        }
    }
}
