import java.util.Scanner;

public class ProductOfThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();


        long product = (long)num1 * num2 * num3; // Use long to prevent potential integer overflow

        System.out.println("The product of the three numbers is: " + product);

        scanner.close();
    }
}
