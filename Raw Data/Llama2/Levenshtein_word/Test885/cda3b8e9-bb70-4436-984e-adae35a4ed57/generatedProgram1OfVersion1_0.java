import java.util.Scanner;

public class PartAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();


        double partAverage = calculatePartAverage(num1, num2, num3);

        System.out.println("The part average is: " + partAverage);

        input.close();
    }

    public static double calculatePartAverage(double a, double b, double c) {
        return (a + b + c) / 3.0;  // Explicitly divide by 3.0 for double precision
    }
}
