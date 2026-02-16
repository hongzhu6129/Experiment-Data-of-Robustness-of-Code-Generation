import java.util.Scanner;

public class NNN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (n): ");

        try {
            int n = scanner.nextInt();

            if (n < 0 || n > 9) { // Handling corner case:  n should be a single digit
                System.out.println("Input must be a single-digit non-negative integer.");
                return; // Exit if invalid input
            }


            int nn = n * 10 + n;
            int nnn = n * 100 + nn;
            int result = n + nn + nnn;


            System.out.println("n + nn + nnn = " + result);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close(); // Close the scanner in the finally block to ensure it's always closed.
        }

    }
}



