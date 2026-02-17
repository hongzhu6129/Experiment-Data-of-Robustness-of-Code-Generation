import java.util.Scanner;

public class SwapVariables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first variable:");
        int a = scanner.nextInt();

        System.out.println("Enter the second variable:");
        int b = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
