import java.util.Arrays;

public class LexicographicRank {

    public static void main(String[] args) {
        String[] testCases = {"a", "ab", "abc", "ba", "bca", "cab", "cba"};

        for (String testCase : testCases) {
            int rank = getLexicographicRank(testCase);
            System.out.println("The lexicographic rank of \"" + testCase + "\" is: " + rank);
        }
    }

    public static int getLexicographicRank(String str) {
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        int rank = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.charAt(i); j++) {
                rank += count[j];
            }

            count[str.charAt(i)]--;
        }

        return rank;
    }
}
