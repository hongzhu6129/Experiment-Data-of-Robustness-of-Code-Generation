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

        double average = (num1 + num2 + num3) / 3.0; // Use 3.0 for floating-point division

        System.out.println("The average of the three numbers is: " + average);
        input.close(); 
    }
}
