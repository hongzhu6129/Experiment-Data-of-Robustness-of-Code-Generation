import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0; 
        double remainder = 0;

        if (num2 != 0) { // Protect against division by zero
            quotient = num1 / num2;
            remainder = num1 % num2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        if (num2 != 0) { // Only print quotient and remainder if num2 is not zero
           System.out.println("Quotient: " + quotient);
           System.out.println("Remainder: " + remainder); 
        }
        input.close(); // Close the scanner
    }
}
