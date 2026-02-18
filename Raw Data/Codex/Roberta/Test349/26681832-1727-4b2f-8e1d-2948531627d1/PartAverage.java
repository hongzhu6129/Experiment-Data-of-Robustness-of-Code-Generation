import java.util.Scanner;

public class PartAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double partAverage = calculatePartAverage(num1, num2, num3);

        System.out.println("Part average: " + partAverage);
        scanner.close();
    }

    public static double calculatePartAverage(double num1, double num2, double num3) {
        // Calculate the part average (average of the two larger numbers).

        if (num1 <= num2 && num1 <= num3) {
            return (num2 + num3) / 2.0;
        } else if (num2 <= num1 && num2 <= num3) {
            return (num1 + num3) / 2.0;
        } else { // num3 is the smallest
            return (num1 + num2) / 2.0;
        }

        // More concise (but perhaps less immediately clear) version:
        // return (num1 + num2 + num3 - Math.min(num1, Math.min(num2, num3))) / 2.0;

    }
}
