import java.util.Scanner;

public class LatinisationCoefficient {

    private static long binomial_Coefficient(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        if (k > n / 2) {
            k = n - k; // Optimization: C(n, k) = C(n, n-k)
        }
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first positive number (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the second positive number (k): ");
        int k = scanner.nextInt();

        if (n <= 0 || k <= 0) {
            System.out.println("Both numbers must be positive.");
        } else {
            long coefficient = binomial_Coefficient(n, k);
            System.out.println("The Latinisation coefficient (binomial coefficient) of " + n + " and " + k + " is: " + coefficient);
        }
        scanner.close();


    }
}
