class Solution {
    /**
     * Checks if a number is a "lucky" number.
     * A number is considered lucky if the sum of its digits is divisible by 7.
     *
     * @param n The number to check.
     * @return True if the number is lucky, false otherwise.
     */
    public static boolean isLucky(int n) {
        int sum = 0;
        String numStr = String.valueOf(n);

        for (int i = 0; i < numStr.length(); i++) {
            sum += Character.getNumericValue(numStr.charAt(i));
        }

        return sum % 7 == 0;
    }

    public static void main(String[] args) {
        int num = 25;  // Example usage
        boolean isLuckyNum = isLucky(num);
        System.out.println("Is Lucky number? " + isLuckyNum);


        num = 16; // Another example
        isLuckyNum = isLucky(num);
        System.out.println("Is Lucky number? " + isLuckyNum);


         num = 70; // Another example
        isLuckyNum = isLucky(num);
        System.out.println("Is Lucky number? " + isLuckyNum);

         num = 77; // Another example
        isLuckyNum = isLucky(num);
        System.out.println("Is Lucky number? " + isLuckyNum);

    }
}
