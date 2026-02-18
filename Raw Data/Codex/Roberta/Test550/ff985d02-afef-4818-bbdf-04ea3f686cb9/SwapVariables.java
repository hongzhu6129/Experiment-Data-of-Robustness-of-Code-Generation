import java.util.Scanner;

public class SwapVariables {

    public static void main(String[] args) {

        // Method 1: Using a temporary variable
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable (a):");
        int a = scanner.nextInt();
        System.out.println("Enter the second variable (b):");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping (using temp): a = " + a + ", b = " + b);


        // Method 2: Using addition and subtraction (avoids temp variable but can cause overflow with very large numbers)
        System.out.println("\nEnter the first variable (a):");
        a = scanner.nextInt();  // Re-input values for demonstration
        System.out.println("Enter the second variable (b):");
        b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping (using + and -): a = " + a + ", b = " + b);


        // Method 3: Using bitwise XOR (avoids temp variable and overflow issues)
        System.out.println("\nEnter the first variable (a):");
        a = scanner.nextInt();  // Re-input values for demonstration
        System.out.println("Enter the second variable (b):");
        b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);


        a = a ^ b;
        b = a ^ b;
        a = a ^ b;


        System.out.println("After swapping (using XOR): a = " + a + ", b = " + b);
        scanner.close();


    }
}
