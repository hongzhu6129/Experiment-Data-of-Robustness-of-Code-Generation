class Solution {
    /**
     * Checks if a given number is an Armstrong number.
     *
     * @param n The number to check.
     * @return True if the number is an Armstrong number, false otherwise.
     */
    public static boolean is_Amstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        int numDigits = String.valueOf(n).length();

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int num = 153; // Example input
        boolean isArmstrong = is_Amstrong(num);
        System.out.println("Is Armstrong number? " + isArmstrong);


        num = 123; // Example input 2
        isArmstrong = is_Amstrong(num);
        System.out.println("Is Armstrong number? " + isArmstrong);

        num = 370; // Example input 3
        isArmstrong = is_Amstrong(num);
        System.out.println("Is Armstrong number? " + isArmstrong);


    }
}
