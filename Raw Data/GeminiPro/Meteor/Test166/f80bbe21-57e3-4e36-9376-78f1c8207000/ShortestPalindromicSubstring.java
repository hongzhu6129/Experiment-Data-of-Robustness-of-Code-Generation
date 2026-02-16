import java.util.*;

public class ShortestPalindromicSubstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        // Find the shortest palindromic substring
        String palindrome = findShortestPalindromicSubstring(str);

        // Print the result
        System.out.println("The shortest palindromic substring is: " + palindrome);
    }

    public static String findShortestPalindromicSubstring(String str) {
        // Create a dp table to store the results
        int[][] dp = new int[str.length()][str.length()];

        // Initialize the dp table
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        // Calculate the longest palindromic substring for all substrings
        for (int i = str.length() - 2; i >= 0; i--) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    if (j - i == 1) {
                        dp[i][j] = 2;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }
                }
            }
        }

        // Find the shortest palindromic substring
        int minLength = str.length();
        int startIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (dp[i][j] > 0 && j - i + 1 < minLength) {
                    minLength = j - i + 1;
                    startIndex = i;
                }
            }
        }

        // Return the shortest palindromic substring
        return str.substring(startIndex, startIndex + minLength);
    }
}
