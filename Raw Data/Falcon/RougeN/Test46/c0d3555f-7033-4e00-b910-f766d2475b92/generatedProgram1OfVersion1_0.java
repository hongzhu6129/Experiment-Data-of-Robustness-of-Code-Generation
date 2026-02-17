import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        try {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();

            double average = calculateAverage(num1, num2, num3);

            System.out.println("The average is: " + average);

        } catch (java.util.InputMismatchException e) {
            System.err.println("Invalid input. Please enter numbers only.");
        } finally {
            scanner.close(); // Close the scanner in the finally block
        }

    }

    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
