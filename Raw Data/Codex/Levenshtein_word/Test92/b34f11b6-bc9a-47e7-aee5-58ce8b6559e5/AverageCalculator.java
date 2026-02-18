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

        } catch (Exception e) {  // Handle potential input errors
            System.out.println("Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close(); // Close the scanner to release resources
        }
    }

    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0; // Ensure floating-point division
    }
}
