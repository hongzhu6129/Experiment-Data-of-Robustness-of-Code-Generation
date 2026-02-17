import java.util.Scanner;

public class PartAverage {

    public static double calculatePartAverage(double num1, double num2, double num3) {
        // Calculate the sum of the numbers.
        double sum = num1 + num2 + num3;

        // Calculate the average by dividing the sum by 3.
        double average = sum / 3.0; 

        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double average = calculatePartAverage(num1, num2, num3);

        System.out.println("The average of the three numbers is: " + average);

        scanner.close();
    }
}
