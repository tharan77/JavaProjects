import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double answer = 0;
        boolean isValidOperation = true;

        System.out.print(" Enter the first number: ");
        num1 = input.nextDouble();

        System.out.print(" Enter the operation you want to do (+,-,*,/,^,%): ");
        operator = input.next().charAt(0);

        System.out.print(" Enter the second number: ");
        num2 = input.nextDouble();

        switch (operator) {
            case '+' -> answer = num1 + num2;
            case '-' -> answer = num1 - num2;
            case '*' -> answer = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println(" .......Invalid operation....\n cannot divide by zero");
                    isValidOperation = false;
                }
                else {
                    answer = num1 / num2;
                }
            }
            case '^' -> answer = Math.pow(num1, num2);
            case '%' -> answer = num1 % num2;
            default -> {
                System.out.println(" Invalid operator..");
                isValidOperation = false;
            }
        }

        if(isValidOperation) {
            System.out.println(" The result is: " + answer);
        }




        input.close();
    }
}
