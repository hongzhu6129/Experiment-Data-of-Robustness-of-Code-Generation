import java.util.Scanner;

public class ProductOfTwoNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        long num1 = input.nextLong(); // Use long to handle larger numbers

        System.out.print("Enter the second number: ");
        long num2 = input.nextLong();

        long product = num1 * num2;

        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        input.close();
    }
}
