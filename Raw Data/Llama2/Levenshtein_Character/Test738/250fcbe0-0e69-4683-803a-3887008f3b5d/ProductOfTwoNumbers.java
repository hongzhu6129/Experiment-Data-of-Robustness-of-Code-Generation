import java.util.Scanner;

public class ProductOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        long num1 = scanner.nextLong();  // Use long to handle larger numbers and potential overflow

        System.out.print("Enter the second number: ");
        long num2 = scanner.nextLong();

        long product = num1 * num2;

        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        scanner.close(); // Close the scanner to release resources.
    }
}
