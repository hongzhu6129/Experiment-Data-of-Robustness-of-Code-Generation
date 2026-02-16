import java.util.Scanner;

class Solution {

    /**
     * Generates the next smallest palindrome greater than the given number.
     *
     * @param num The input number.
     * @return The next smallest palindrome.
     */
    public static int nextPalindromeGenerate(int num) {
        num++; // Start checking from the number immediately after the input

        while (true) {
            if (isPalindrome(num)) {
                return num;
            }
            num++;
        }
    }

    /**
     * Checks if a number is a palindrome.
     *
     * @param num The number to check.
     * @return True if the number is a palindrome, false otherwise.
     */
    private static boolean isPalindrome(int num) {
        String numStr = String.valueOf(num);
        String reversedNumStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedNumStr);
    }

    /**
     * Main method to demonstrate the functionality.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int nextPalindrome = nextPalindromeGenerate(num);
        System.out.println("The next smallest palindrome is: " + nextPalindrome);

        scanner.close();

    }
}
