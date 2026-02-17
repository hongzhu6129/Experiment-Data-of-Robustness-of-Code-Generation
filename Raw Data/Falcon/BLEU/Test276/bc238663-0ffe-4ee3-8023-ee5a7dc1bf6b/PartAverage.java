import java.util.Scanner;

public class PartAverage {

    public static double calculatePartAverage(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            throw new IllegalArgumentException("Input numbers must be non-negative.");
        }

        // Calculate sum of squares of the numbers
        double sumOfSquares = Math.pow(num1, 2) + Math.pow(num2, 2) + Math.pow(num3, 2);

        // Calculate the part average
        return sumOfSquares / 3.0; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        try {
            double partAverage = calculatePartAverage(num1, num2, num3);
            System.out.println("The part average is: " + partAverage);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
