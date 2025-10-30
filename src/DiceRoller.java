import java.util.Scanner;
import java.util.Random;
public class DiceRoller {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        System.out.print(" Enter the number of times to roll the dice🎲: ");
        numOfDice = scanner.nextInt();

        if (numOfDice < 1){
            System.out.println(" Dice🎲 can't be rolled negative times..");
        }
        else {
            for (int i = 1; i <= numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                System.out.println(" You rolled🎲 " + roll);
                showDie(roll);
                total += roll;
            }
            System.out.println();
            System.out.println(" The total roll is: " + total);
        }
        scanner.close();
    }

    static void showDie(int roll){

        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println(" INVALID ROLL..");
        }
    }
}
