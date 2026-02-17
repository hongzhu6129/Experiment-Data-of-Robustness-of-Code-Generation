import java.util.Arrays;

public class LexicographicRank {

    public static int makefactorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int calcuLexicoRank(String str, int n) {
        int rank = 1;
        int mul = makefactorial(n);
        int[] count = new int[256]; // Assuming ASCII characters

        // Count character occurrences
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }

        // Calculate cumulative counts
        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < n; i++) {
            mul /= (n - i);
            rank += count[str.charAt(i) - 1] * mul; 

            // Update counts for characters smaller than current character
            for (int j = str.charAt(i); j < 256; j++) {
                count[j]--;
            }
        }

        return rank;
    }

    public static void main(String[] args) {
        String str = "STRING"; // Example string
        int n = str.length();

        int rank = calcuLexicoRank(str, n);
        System.out.println("Lexicographic rank of " + str + " is: " + rank);

        str = "DCBA"; // Example 2
        n = str.length();
        rank = calcuLexicoRank(str, n);
        System.out.println("Lexicographic rank of " + str + " is: " + rank);


         str = "QUESTION"; // Example 3
        n = str.length();
        rank = calcuLexicoRank(str, n);
        System.out.println("Lexicographic rank of " + str + " is: " + rank);
    }
}
