import java.util.Scanner;

public class ComputeNNN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (n): ");

        try {
            int n = scanner.nextInt();

            if (n < 0 || n > 9) { // Restrict input to single digits for simplicity and to avoid integer overflow
                System.out.println("Please enter a single-digit integer (0-9).");
                return; 
            }

            int nn = n * 10 + n;
            int nnn = n * 100 + nn;
            int sum = n + nn + nnn;


            System.out.println("n+nn+nnn = " + sum);


        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}

