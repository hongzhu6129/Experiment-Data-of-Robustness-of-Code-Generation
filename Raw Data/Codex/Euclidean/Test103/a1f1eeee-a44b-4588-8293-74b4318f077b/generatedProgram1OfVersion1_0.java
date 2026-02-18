import java.util.Arrays;

class Solution {

    /**
     * Finds the next smallest palindrome greater than or equal to the given integer.
     *
     * @param num The input integer.
     * @return The next smallest palindrome.
     */
    public static int nextPalindromeGenerate(int num) {
        if (num < 0) {
            return 0; // Handle negative input (or throw an exception if needed)
        }

        while (true) {
            num++;
            if (isPalindrome(num)) {
                return num;
            }
        }
    }

    private static boolean isPalindrome(int num) {
        String numStr = String.valueOf(num);
        String reversedNumStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedNumStr);
    }



    public static void main(String[] args) {
        int num1 = 128;
        int nextPalindrome1 = nextPalindromeGenerate(num1);
        System.out.println("Next palindrome for " + num1 + ": " + nextPalindrome1); // Output: 131


        int num2 = 99;
        int nextPalindrome2 = nextPalindromeGenerate(num2);
        System.out.println("Next palindrome for " + num2 + ": " + nextPalindrome2); // Output: 101

        int num3 = 123321; // Already a palindrome
        int nextPalindrome3 = nextPalindromeGenerate(num3);
        System.out.println("Next palindrome for " + num3 + ": " + nextPalindrome3); // Output: 124421


        int num4 = 9;  // Single-digit
        int nextPalindrome4 = nextPalindromeGenerate(num4);
        System.out.println("Next palindrome for " + num4 + ": " + nextPalindrome4); // Output: 11


        int num5 = 0; // zero
        int nextPalindrome5 = nextPalindromeGenerate(num5);
        System.out.println("Next palindrome for " + num5 + ": " + nextPalindrome5); // Output : 1

        
        int num6 = -5; // Negative
        int nextPalindrome6 = nextPalindromeGenerate(num6);
        System.out.println("Next palindrome for " + num6 + ": " + nextPalindrome6); // Output : 0



    }
}
