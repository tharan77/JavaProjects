import java.util.Scanner;
public class WeightConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight;
        double convertedWeight;
        int operation;

        System.out.println(" ---Enter what you want to convert---");
        System.out.println(" Enter 1 if kg to lbs");
        System.out.println(" Enter 2 if lbs to kg\n");
        System.out.print(" Enter the operation number: ");
        operation = input.nextInt();

        System.out.print(" Enter the weight: ");
        weight = input.nextDouble();
        if (weight > 0) {
            switch (operation) {
                case 1 -> {
                    convertedWeight = weight * 2.20462;
                    System.out.println(weight + "kg = " + convertedWeight + "lbs");
                }
                case 2 -> {
                    convertedWeight = weight * 0.453592;
                    System.out.println(weight + "lbs = " + convertedWeight + "kg");
                }
                default -> System.out.println("Invalid operation");
            }
        }






        input.close();

    }
}
