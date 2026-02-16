import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));

        // Handle division by zero
        if (num2 != 0) {
            System.out.println("Quotient: " + divide(num1, num2));
            // Assuming "until" means modulo/remainder
             System.out.println("Remainder: " + modulo(num1, num2)); 
        } else {
            System.out.println("Cannot divide by zero.");
        }
        input.close();
    }



    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double modulo(double a, double b) {
        return a % b;
    }
}
