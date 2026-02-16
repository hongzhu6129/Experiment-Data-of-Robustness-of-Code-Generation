import java.util.Scanner;

class PalindromeGenerator {

    public static int nextPalindromeGenerate(int num) {
        num++;
        while (true) {
            if (isPalindrome(num)) {
                return num;
            }
            num++;
        }
    }

    private static boolean isPalindrome(int n) {
        int reversed = 0;
        int original = n;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int nextPalindrome = nextPalindromeGenerate(num);
        System.out.println("The next smallest palindrome is: " + nextPalindrome);
        scanner.close();
    }
}
