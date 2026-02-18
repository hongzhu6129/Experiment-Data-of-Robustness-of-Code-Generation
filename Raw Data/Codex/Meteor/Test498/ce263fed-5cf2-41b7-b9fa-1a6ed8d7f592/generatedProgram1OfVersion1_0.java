public class PalindromeChecker {

    public static void main(String[] args) {
        // Test cases
        int num1 = 121;
        int num2 = 12321;
        int num3 = 123;

        System.out.println(num1 + " is palindrome: " + isPalindrome(num1));
        System.out.println(num2 + " is palindrome: " + isPalindrome(num2));
        System.out.println(num3 + " is palindrome: " + isPalindrome(num3));
    }

    private static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}
