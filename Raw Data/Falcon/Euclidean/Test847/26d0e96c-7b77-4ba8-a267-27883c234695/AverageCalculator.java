import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        double average = calculateAverage(num1, num2, num3);

        System.out.println("The average is: " + average);
        input.close();
    }

    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
