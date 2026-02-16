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
        int count[] = new int[256];
        int mul = makefactorial(n);

        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < n - 1; i++) {
            mul /= (n - i);
            rank += count[str.charAt(i) - 1] * mul;
            for (int j = str.charAt(i); j < 256; j++) {
                count[j]--;
            }
        }
        return rank;
    }

    public static void main(String[] args) {
        String str = "STRING";
        int n = str.length();
        int rank = calcuLexicoRank(str, n);
        System.out.println("Lexicographic Rank of " + str + " is " + rank);


        str = "CBA";
        n = str.length();
        rank = calcuLexicoRank(str, n);
        System.out.println("Lexicographic Rank of " + str + " is " + rank); // Output: 6


        str = "DCBA";
        n = str.length();
        rank = calcuLexicoRank(str, n);
        System.out.println("Lexicographic Rank of " + str + " is " + rank); // Output 24

        str = "QUESTION";
        n = str.length();
        rank = calcuLexicoRank(str, n);
        System.out.println("Lexicographic Rank of " + str + " is " + rank); // Example output

        str = "abab";
        n = str.length();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sortedStr = new String(charArray);
        rank = calcuLexicoRank(str, n);
        System.out.println("Lexicographic Rank of " + str + " is " + rank); // Example with repeated chars
    }
}
