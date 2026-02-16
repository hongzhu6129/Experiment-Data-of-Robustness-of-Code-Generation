import java.util.Scanner;

public class LatinisationCoefficient {

    private static long binomial_Coefficient(int n, int k) {
        if (k < 0 || k > n) {
            return 0; // Handle invalid input where k is outside the valid range
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
        System.out.print("Enter the first positive integer (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the second positive integer (k): ");
        int k = scanner.nextInt();

        if (n < 0 || k < 0) {
            System.out.println("Error: Both integers must be positive.");
        } else {
            long coefficient = binomial_Coefficient(n + k -1, k); //Latinisation coefficient (combination with repetition)
            System.out.println("The Latinisation coefficient is: " + coefficient);
        }

        scanner.close();
    }
}

