import java.util.Arrays;

public class LexicographicRank {

    public static void main(String[] args) {
        String str = "STRING";
        int rank = findRank(str);
        System.out.println("The lexicographic rank of the string " + str + " is " + rank);
    }

    public static int findRank(String str) {
        int n = str.length();
        int[] count = new int[26];
        for (int i = 0; i < n; i++) {
            count[str.charAt(i) - 'A']++;
        }

        int rank = 1;
        for (int i = 0; i < n; i++) {
            int smallerCount = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < ch - 'A'; j++) {
                smallerCount += count[j];
            }

            int sameCount = count[ch - 'A'] - 1;
            rank += smallerCount * factorial(n - i - 1) + sameCount * factorial(n - i - 2);
        }

        return rank;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
