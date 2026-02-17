import java.util.Scanner;

public class LexicographicRank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        long rank = calculateRank(str);
        System.out.println("The lexicographic rank of the string is: " + rank);
    }

    private static long calculateRank(String str) {
        int n = str.length();
        long[] fact = new long[n + 1];

        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = i * fact[i - 1];
        }

        long rank = 1;
        int[] count = new int[256];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < str.charAt(i); j++) {
                rank += count[j] * fact[n - i - 1];
            }
            count[str.charAt(i)]++;
        }

        return rank;
    }
}
