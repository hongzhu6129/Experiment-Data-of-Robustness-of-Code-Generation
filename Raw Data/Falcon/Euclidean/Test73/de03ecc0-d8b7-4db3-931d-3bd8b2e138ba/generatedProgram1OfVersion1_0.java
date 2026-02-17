class Solution {
    /**
     * Calculates the power of a number without using multiplication or division operators.
     *
     * @param base     The base number.
     * @param exponent The exponent.
     * @return The result of base raised to the power of exponent.
     */
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        int result = base;
        int increment = base; 

        for (int i = 1; i < Math.abs(exponent); i++) {
            for (int j = 1; j < Math.abs(base); j++) {
                result += increment; 
            }
            increment = result;
        }


        if (exponent < 0) {
            // We can't use division, so we'll return -1 to indicate an error for negative exponents.
            // A true implementation without multiplication/division for negative powers is very complex
            // and would likely involve bitwise operations.
            return -1; 

        }
      
        return result;
    }


    public static void main(String[] args) {
        System.out.println(power(2, 3)); // Output: 8
        System.out.println(power(3, 2)); // Output: 9
        System.out.println(power(5, 0)); // Output: 1
        System.out.println(power(2, -2)); // Output: -1 (Indicating error/not implemented)

    }
}
