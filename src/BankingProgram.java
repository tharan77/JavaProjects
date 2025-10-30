import java.util.Scanner;
public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("--------------------------");
            System.out.println("Welcome to BANKING PROGRAM🏦");
            System.out.println("--------------------------");
            System.out.println(" Programs available👇");
            System.out.println(" 1. Deposit");
            System.out.println(" 2. Withdraw");
            System.out.println(" 3. Balance");
            System.out.println(" 4. Exit");
            System.out.print(" Select the options (1-4): ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1 -> balance += deposit();
                case 2 -> balance -= withdraw(balance);
                case 3 -> showBalance(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE😑");
            }
        }
        System.out.println(" Thank you for using BANKING PROGRAM!😊");
        scanner.close();
    }

    static void showBalance (double balance) {
        System.out.println("***************************");
        System.out.printf(" Your balance is: Rs %.2f\n", balance);
    }
    static double deposit() {
        double amount;
        System.out.println("****************************");
        System.out.print(" Enter the amount of deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println(" the deposit amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double withdraw(double balance) {
        double amount;
        System.out.println("*********************************");
        System.out.print(" Enter the amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println(" Insufficient funds");
            return 0;
        }
        else if (amount < 0) {
            System.out.println(" The withdrawal amount can't be negative..");
            return 0;
        }
        else {
            return amount;
        }
    }
}
