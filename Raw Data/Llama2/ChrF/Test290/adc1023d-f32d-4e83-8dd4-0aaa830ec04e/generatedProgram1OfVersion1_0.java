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
        int countRight;
        int[] charCount = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < n; i++) {
            charCount[str.charAt(i)]++; 
        }

        for (int i = 1; i < 256; i++) {
            charCount[i] += charCount[i - 1];
        }

        for (int i = 0; i < n; i++) {
            int fact = makefactorial(n - 1 - i);
            countRight = 0;
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) > str.charAt(j)) {
                    countRight++;
                }
            }
            rank += countRight * fact;

            for (int j = str.charAt(i); j < 256; j++) {
                charCount[j]--;
            }
        }
        return rank;
    }

    public static void main(String[] args) {
        String str = "STRING";
        int n = str.length();
        int rank = calcuLexicoRank(str, n);
        System.out.println("Lexicographic Rank of " + str + " is: " + rank);


        str = "CBA";
        n = str.length();
        rank = calcuLexicoRank(str, n);
        System.out.println("Lexicographic Rank of " + str + " is: " + rank);


        str = "QUESTION";
        n = str.length();
        rank = calcuLexicoRank(str, n);
        System.out.println("Lexicographic Rank of " + str + " is: " + rank);


    }
}



