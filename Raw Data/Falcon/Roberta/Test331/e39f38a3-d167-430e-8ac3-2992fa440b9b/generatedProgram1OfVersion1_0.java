import java.util.Scanner;

public class MultiplyTwoNumbers {

    public static long multiply(long num1, long num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        long num1 = scanner.nextLong();

        System.out.print("Enter the second number: ");
        long num2 = scanner.nextLong();

        long product = multiply(num1, num2);
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
