class Solution {
    public static void main(String[] args) {
        int num = 151; // Example input, you can modify this to take user input
        if (is_Palindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }


    public static int reverse_nums(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }


    public static boolean is_Palindrome(int num) {
        return num == reverse_nums(num);
    }
}
