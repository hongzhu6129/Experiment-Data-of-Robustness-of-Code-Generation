import java.util.Arrays;

public class LexicographicRank {

    public static void main(String[] args) {
        String str = "STRING";
        int rank = getRank(str);
        System.out.println("The lexicographic rank of " + str + " is " + rank);
    }

    public static int getRank(String str) {
        int n = str.length();
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = i * fact[i - 1];
        }

        int rank = 1;
        char[] arr = str.toCharArray();
        int[] count = new int[256];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            int smallerCount = 0;
            for (int j = 0; j < arr[i]; j++) {
                smallerCount += count[j];
            }
            rank += smallerCount * fact[n - i - 1];
            count[arr[i]]--;
        }

        return rank;
    }
}
