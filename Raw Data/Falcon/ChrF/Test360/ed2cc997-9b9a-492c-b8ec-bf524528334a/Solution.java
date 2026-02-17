class Solution {
    /**
     * Write a Java method to check whether every digit of a given integer is even. 
     * Return true if every digit is odd otherwise false.
     */
    public static boolean test(int n) {
        String numStr = String.valueOf(Math.abs(n)); // Handle negative numbers

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            if (digit % 2 == 0) { // Check if the digit is even
                return false; // If any digit is even, return false
            }
        }
        return true; // If all digits are odd, return true
    }

    public static void main(String[] args) {
        System.out.println(test(111)); // Output: true
        System.out.println(test(121)); // Output: false
        System.out.println(test(2222)); // Output: false
        System.out.println(test(1357)); // Output: true
        System.out.println(test(-135)); // Output: true
        System.out.println(test(-246)); // Output: false


    }
}
