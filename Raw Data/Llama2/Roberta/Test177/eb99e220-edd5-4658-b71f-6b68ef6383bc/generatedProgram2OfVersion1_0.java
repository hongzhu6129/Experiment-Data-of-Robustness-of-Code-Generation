import java.util.Scanner;

public class Solution {
    // ... (rest of the code remains the same)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a positive integer: ");  // Prompt user for input
        int num = scanner.nextInt();

        if (is_Palindrome(num)) {
            System.out.println(num + " is a palindrome number?"); 
        } else {
            System.out.println(num + " is not a palindrome number?"); 
        }
        scanner.close(); // Close the scanner
    }
}
