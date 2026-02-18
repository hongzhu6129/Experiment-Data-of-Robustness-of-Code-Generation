import java.util.Scanner;

public class NNN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer (n): ");

        try {
            int n = input.nextInt();

            // Handle negative input (optional, depends on requirements)
            if (n < 0) {
                System.out.println("Input must be a non-negative integer.");
                return;
            }

            int nn = n * 10 + n;
            int nnn = n * 100 + nn;
            int result = n + nn + nnn;

            System.out.println("Result: " + result);


        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            input.close(); // Close the scanner to prevent resource leaks
        }
    }
}
