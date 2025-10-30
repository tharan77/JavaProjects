import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int guess;
        int attempt = 0;
        int min;
        int max;

        System.out.println(" Enter the number range of the game to be played...");
        System.out.print(" Enter the minimum: ");
        min = input.nextInt();
        System.out.print(" Enter the maximum: ");
        max = input.nextInt();

        int random = rand.nextInt(min, max + 1);

        System.out.println("-----Number Guessing Game 👾 -----");
        System.out.printf(" Guess a number between %d-%d\n", min, max);

        do {
            System.out.print(" Enter a guess: ");
            guess = input.nextInt();
            attempt++;

            if (guess > random) {
                System.out.println(" Your guess is higher 👆 than the actual number.");
            }
            else if (guess < random) {
                System.out.println(" Your guess is lower 👇 than the actual number.");
            }
            else {
                System.out.println(" Your guess is CORRECT.🏆. The actual number was " + random);
                System.out.println(" Number of attempts: " + attempt);
            }

        } while (guess != random);










        input.close();
    }
}
