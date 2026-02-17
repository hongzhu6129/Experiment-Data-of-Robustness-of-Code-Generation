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
        if (n < 0 || n > 9) { // Added validation for single digit
            throw new IllegalArgumentException("Input must be a single digit non-negative integer.");
        }
        long nn = (long) n * 10 + n;
        long nnn = nn * 10 + n;
        return (long) n + nn + nnn;
    }
}


