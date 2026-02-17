import java.util.Scanner;

public class NNN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (n): ");

        // Input validation: Check if the input is a valid integer
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            // Calculate n + nn + nnn
            long result = calculateNNN(n); 

            System.out.println("Result: " + result);


        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();

    }

    public static long calculateNNN(int n) {
        long nn = (long) n * 10 + n;  // Use long to avoid potential integer overflow
        long nnn = nn * 10 + n;     // Use long to avoid potential integer overflow

        return (long)n + nn + nnn;

    }
}
