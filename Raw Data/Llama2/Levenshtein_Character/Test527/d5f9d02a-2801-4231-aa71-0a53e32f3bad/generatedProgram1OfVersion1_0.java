import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input the positive integer: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println(num);

        if (is_Palindrome(num)) {
            System.out.println("is a palindrome number?");
        } else {
            System.out.println("is not a palindrome number.");
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
