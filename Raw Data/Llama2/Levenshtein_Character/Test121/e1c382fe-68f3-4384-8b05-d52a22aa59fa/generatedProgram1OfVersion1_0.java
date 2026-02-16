import java.util.Scanner;

public class SwapVariables {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first variable:");
        int a = scanner.nextInt();

        System.out.println("Enter the second variable:");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        // Demonstrating swapping without a temporary variable (using addition and subtraction)
        System.out.println("\nSwapping without a temporary variable (using addition and subtraction):");
        System.out.println("Enter the first variable:");
        int c = scanner.nextInt();

        System.out.println("Enter the second variable:");
        int d = scanner.nextInt();

        System.out.println("Before swapping: c = " + c + ", d = " + d);
        c = c + d;
        d = c - d;
        c = c - d;

        System.out.println("After swapping: c = " + c + ", d = " + d);



        scanner.close(); // Important to close the scanner
    }
}
