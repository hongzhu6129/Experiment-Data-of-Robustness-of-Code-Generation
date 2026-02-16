import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference (num1 - num2): " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Quotient: " + (num1 / num2));
            System.out.println("Remainder: " + (num1 % num2));
        } else {
            System.out.println("Division by zero is not allowed.");
            // For remainder with a divisor of 0, Java throws an ArithmeticException. We handle it.
            System.out.println("Remainder (modulo) by zero is undefined."); 
        }
         input.close();
    }
}
