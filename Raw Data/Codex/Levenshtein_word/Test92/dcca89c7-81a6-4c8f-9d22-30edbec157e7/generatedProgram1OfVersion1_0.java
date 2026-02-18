import java.util.Scanner;

public class PartAverage {

    public static double calculatePartAverage(int num1, int num2, int num3) {
        // Calculate the sum of the numbers.
        double sum = num1 + num2 + num3;

        // Calculate the average.
        double average = sum / 3.0; // Use 3.0 for double precision

        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        double average = calculatePartAverage(num1, num2, num3);

        System.out.println("The average of the three numbers is: " + average);
        scanner.close();
    }
}
