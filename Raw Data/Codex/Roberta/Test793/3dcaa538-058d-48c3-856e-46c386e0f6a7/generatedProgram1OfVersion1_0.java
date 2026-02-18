import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input the first number: ");
        double num1 = input.nextDouble();

        System.out.print("input the second number: ");
        double num2 = input.nextDouble();

        System.out.print("input the third number: ");
        double num3 = input.nextDouble();

        double avg = average(num1, num2, num3);

        System.out.println("the average value is " + avg);

        input.close(); 
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
