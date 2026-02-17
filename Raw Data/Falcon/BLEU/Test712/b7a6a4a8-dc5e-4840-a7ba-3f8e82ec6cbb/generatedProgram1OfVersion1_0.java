import java.util.Scanner;

public class BinomialCoefficient {

    private static long binomial_Coefficient(int n, int k) {
        if (k < 0 || k > n) {
            return 0; // Binomial coefficient is 0 if k is out of range
        }
        if (k == 0 || k == n) {
            return 1; // Base cases
        }
        if (k > n / 2) {
            k = n - k; // Optimization: C(n, k) = C(n, n-k)
        }
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i; // Efficient calculation to avoid overflow
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        if (n < 0 || k < 0) {
            System.out.println("n and k must be non-negative.");
        } else {
            long coefficient = binomial_Coefficient(n, k);
            System.out.println("The binomial coefficient C(" + n + ", " + k + ") is: " + coefficient);
        }
        scanner.close();
    }
}
