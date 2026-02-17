import java.util.Scanner;

public class NNN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        long result = calculateNNN(n);

        System.out.println("Result of n + nn + nnn: " + result);
        scanner.close();
    }

    public static long calculateNNN(int n) {
        if (n < 0 || n > 9) {  // Validate input to be a single digit. Throw an exception or handle it as needed
            throw new IllegalArgumentException("Input n must be a single digit between 0 and 9.");

        }
        int nn = n * 10 + n;
        int nnn = n * 100 + nn;
        return (long) n + nn + nnn;  // Cast to long to handle potential overflow for larger n

    }
}
