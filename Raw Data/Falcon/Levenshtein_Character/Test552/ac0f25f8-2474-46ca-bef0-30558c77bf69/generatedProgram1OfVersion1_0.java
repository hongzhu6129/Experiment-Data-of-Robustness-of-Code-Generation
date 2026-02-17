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
        int count[] = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 1; i < 256; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < n; i++) {
            int multiplier = makefactorial(n - 1 - i);

            // Count smaller characters to the right
            int smallerCharacters = 0;
            for(int j = 0; j < str.charAt(i); j++) {
               smallerCharacters += count[j];
            }
           
            rank += (smallerCharacters - (count[str.charAt(i)-1] -  ( i > 0 ? count[str.charAt(i-1)] : 0 ) )) * multiplier;

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
        System.out.println("Lexicographic Rank of " + str + " is: " + rank);


        str = "DCBA";
        n = str.length();
        rank = calcuLexicoRank(str, n);
        System.out.println("Lexicographic Rank of " + str + " is: " + rank);


        str = "QUESTION";
        n = str.length();
        rank = calcuLexicoRank(str, n);
        System.out.println("Lexicographic Rank of " + str + " is: " + rank);

        str = "ACB";
        n = str.length();
        rank = calcuLexicoRank(str, n);
        System.out.println("Lexicographic Rank of " + str + " is: " + rank); // Output: 2

    }
}
