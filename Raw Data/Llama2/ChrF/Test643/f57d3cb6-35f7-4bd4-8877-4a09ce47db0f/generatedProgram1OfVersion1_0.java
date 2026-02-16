import java.util.Arrays;
import java.util.Scanner;

public class ShortestPalindromicSubstring {

    // Function to find the shortest palindromic substring within another string
    public static String findShortestPalindromicSubstring(String str) {
        // If the string is null or empty, return an empty string
        if (str == null || str.isEmpty()) {
            return "";
        }

        // Create a 2D array to store the longest palindromic substring for each substring of the given string
        int[][] dp = new int[str.length()][str.length()];

        // Initialize the diagonal elements of the dp array to 1, since a single character is always a palindrome
        for (int i = 0; i < str.length(); i++) {
            dp[i][i] = 1;
        }

        // Find the longest palindromic substring for each substring of the given string
        for (int length = 2; length <= str.length(); length++) {
            for (int i = 0; i <= str.length() - length; i++) {
                int j = i + length - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    if (length == 2) {
                        dp[i][j] = 2;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        // Find the shortest palindromic substring that covers the entire given string
        int minLength = str.length();
        int startIndex = 0;
        for (int i = 0; i <= str.length() - minLength; i++) {
            int j = i + minLength - 1;
            if (dp[i][j] == minLength) {
                startIndex = i;
                break;
            }
        }

        // Return the shortest palindromic substring
        return str.substring(startIndex, startIndex + minLength);
    }

    // Function to test the findShortestPalindromicSubstring function
    public static void main(String[] args) {
        // Create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the input string from the console
        System.out.println("Enter the input string: ");
        String str = scanner.nextLine();

        // Find the shortest palindromic substring within the given string
        String shortestPalindromicSubstring = findShortestPalindromicSubstring(str);

        // Print the shortest palindromic substring
        System.out.println("The shortest palindromic substring is: " + shortestPalindromicSubstring);
    }
}
