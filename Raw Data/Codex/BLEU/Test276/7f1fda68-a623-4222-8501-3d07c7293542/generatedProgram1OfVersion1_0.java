import java.util.Scanner;

public class PartAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();

            double average = calculatePartAverage(num1, num2, num3);

            System.out.println("Part average: " + average);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }

    public static double calculatePartAverage(int num1, int num2, int num3) {
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            throw new ArithmeticException("Cannot divide by zero. At least one input is zero.");
        }

        return 3.0 / (1.0 / num1 + 1.0 / num2 + 1.0 / num3); // Part average formula

    }
}
