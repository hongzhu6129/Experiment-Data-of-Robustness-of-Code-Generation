import java.util.Scanner;

public class NNN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer (n): ");

        try {
            int n = input.nextInt();

            if (n < 0 || n > 9) {  // Restrict input to single digits for simplicity and to avoid potential overflows
                System.out.println("Please enter a single-digit integer (0-9).");
                return;
            }


            int nn = n * 10 + n;
            int nnn = n * 100 + nn;
            int result = n + nn + nnn;

            System.out.println("Result of n + nn + nnn: " + result);


        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            input.close();  // Close the scanner to prevent resource leaks
        }
    }
}
