class Solution {

    void print_number(int n) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (n >= 0 && n <= 9) {
            System.out.print(words[n] + " ");
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int num = scanner.nextInt();
        int sumOfDigits = 0;

        // Calculate sum of digits
        int temp = num;
        while (temp > 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        // Print the number of each digit of the sum in English
        int tempSum = sumOfDigits;
        while (tempSum > 0) {
            sol.print_number(tempSum % 10);
            tempSum /= 10;
        }
        System.out.println();  // Add a newline for better formatting

        scanner.close();
    }
}
