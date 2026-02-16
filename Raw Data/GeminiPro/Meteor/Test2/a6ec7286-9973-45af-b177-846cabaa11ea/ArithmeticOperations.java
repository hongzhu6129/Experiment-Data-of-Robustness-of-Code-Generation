import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Addition
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Subtraction
        double difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Multiplication
        double product = num1 * num2;
        System.out.println("Product: " + product);

        // Division
        if (num2 != 0) { // Check for division by zero
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }


        // Remainder (Modulo)
        if (num2 != 0) { // Check for division by zero
            double remainder = num1 % num2;
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Modulo by zero is not allowed.");
        }


        input.close();
    }
}
