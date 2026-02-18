import java.util.Scanner;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Find the longest palindromic substring
        String longestPalindrome = findLongestPalindromicSubstring(str);

        // Print the longest palindromic substring
        System.out.println("The longest palindromic substring is: " + longestPalindrome);
    }

    public static String findLongestPalindromicSubstring(String str) {
        int n = str.length();
        int maxLength = 1;
        int start = 0;

        // Consider every character of the given string as a potential midpoint and expand in both directions to find the maximum length palindrome
        for (int i = 0; i < n; i++) {
            // Find the longest odd length palindrome with str[i] as a midpoint
            int low = i - 1;
            int high = i + 1;
            while (low >= 0 && high < n && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
            }

            int oddLength = high - low - 1;
            if (oddLength > maxLength) {
                maxLength = oddLength;
                start = low + 1;
            }

            // Find the longest even length palindrome with str[i] and str[i+1] as its midpoints
            low = i;
            high = i + 1;
            while (low >= 0 && high < n && str.charAt(low) == str.charAt(high)) {
                low--;
                high++;
            }

            int evenLength = high - low - 1;
            if (evenLength > maxLength) {
                maxLength = evenLength;
                start = low + 1;
            }
        }

        return str.substring(start, start + maxLength);
    }
}
