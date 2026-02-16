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
        double quotient = num1 / num2; // Note: Potential for ArithmeticException if num2 is 0
        double remainder = num1 % num2;


        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        if (num2 == 0) {
             System.out.println("Division by zero is not allowed.");
        } else {
             System.out.println("Quotient: " + quotient);
             System.out.println("Remainder: " + remainder);
        }
            

        input.close(); 
    }
}
