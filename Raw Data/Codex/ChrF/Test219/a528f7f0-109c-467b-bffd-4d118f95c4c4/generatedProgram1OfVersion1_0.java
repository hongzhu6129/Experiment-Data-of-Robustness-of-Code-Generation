import java.util.Scanner;

public class PartAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double partAverage = calculatePartAverage(num1, num2, num3);

        System.out.println("Part average: " + partAverage);

        input.close(); // Close the scanner to release resources
    }

    public static double calculatePartAverage(double a, double b, double c) {
        return (a + b + c) / 3.0;  // Explicitly divide by 3.0 for double precision
    }
}
