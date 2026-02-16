import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3;

        try {
            System.out.print("Enter the first number: ");
            num1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            num2 = input.nextDouble();

            System.out.print("Enter the third number: ");
            num3 = input.nextDouble();

            double average = calculateAverage(num1, num2, num3);
            System.out.println("The average of the three numbers is: " + average);

        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter numbers only.");
        } finally {
             input.close(); // Ensure the scanner is closed in all cases
        }
    }

    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}
