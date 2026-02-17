import java.util.Scanner;

public class NPlusNNPlusNNN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (n): ");

        try {
            int n = scanner.nextInt();

            if (n < 0 || n > 9) {  // Restrict input to single digits for simplicity and to avoid potential overflow
                System.out.println("Please enter a single-digit integer.");
                return;
            }


            int nn = n * 10 + n;
            int nnn = n * 100 + nn;
            int result = n + nn + nnn;

            System.out.println("Result: " + result);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}
