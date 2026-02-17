import java.util.Scanner;

public class AverageOfPartNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three part numbers:");

        try {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();

            double average = calculateAverage(num1, num2, num3);

            System.out.println("The average of the part numbers is: " + average);

        } catch (Exception e) { // Catch any input errors (e.g., non-numeric input)
            System.err.println("Invalid input. Please enter valid numbers.");
        } finally {
            scanner.close(); // Close the scanner to release resources
        }
    }

    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;  // Use 3.0 to ensure floating-point division
    }
}
