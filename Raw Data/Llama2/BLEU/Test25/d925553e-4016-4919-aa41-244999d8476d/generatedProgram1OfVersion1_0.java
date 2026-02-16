class Solution {
    public static boolean is_Amstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        int num = 153; // Example input

        if (is_Amstrong(num)) {
            System.out.println(num + " is Armstrong number?"); // Output as requested
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }


        num = 123; // Another example
        if (is_Amstrong(num)) {
            System.out.println(num + " is Armstrong number?"); // Output as requested
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        
    }
}
