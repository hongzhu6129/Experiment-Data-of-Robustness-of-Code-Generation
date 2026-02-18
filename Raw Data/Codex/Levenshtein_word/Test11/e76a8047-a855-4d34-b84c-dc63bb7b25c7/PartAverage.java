import java.util.Scanner;

public class PartAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double partAverage = calculatePartAverage(num1, num2, num3);

        if (Double.isNaN(partAverage)) {
            System.out.println("Part average cannot be calculated (division by zero).");
        } else {
            System.out.println("Part average: " + partAverage);
        }
        scanner.close();
    }

    public static double calculatePartAverage(double num1, double num2, double num3) {
        if (num1 + num2 == 0) {
            return Double.NaN; // Handle potential division by zero
        }
        return (num1 + num2 + num3) / (num1+ num2) ; // Corrected Formula to avoid Integer Division
    }
}
