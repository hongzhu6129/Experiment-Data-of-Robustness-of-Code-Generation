import java.util.Scanner;

public class AveragePartNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three part numbers:");

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            double average = calculateAverage(num1, num2, num3);

            System.out.println("The average of the part numbers is: " + average);

        } catch (Exception e) {
            System.err.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close(); // Close the scanner to prevent resource leaks
        }
    }

    public static double calculateAverage(int num1, int num2, int num3) {
        return (double) (num1 + num2 + num3) / 3; // Cast to double for accurate average
    }
}



