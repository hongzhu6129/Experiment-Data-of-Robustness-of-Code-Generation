import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers:");

        try {
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();

            double average = calculateAverage(num1, num2, num3);

            System.out.println("The average is: " + average);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            input.close(); // Close the scanner in the finally block to ensure it's closed even if an exception occurs
        }
    }

    public static double calculateAverage(int num1, int num2, int num3) {
        return (double) (num1 + num2 + num3) / 3;  // Cast to double for accurate average
    }
}
