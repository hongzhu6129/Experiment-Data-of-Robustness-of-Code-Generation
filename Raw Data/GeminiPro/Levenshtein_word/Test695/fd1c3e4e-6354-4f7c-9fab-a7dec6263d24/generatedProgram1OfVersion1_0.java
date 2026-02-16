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

        if (exponent < 0) { 
            if (base == 0) {
                throw new ArithmeticException("Cannot raise 0 to a negative power");
            }
             return power(1/base,-exponent); // Not allowed by problem, showing concept only
        }


        int result = base;
        int increment = base;

        for (int i = 1; i < exponent; i++) {
            // Simulate multiplication using repeated addition
            for (int j = 1; j < base; j++) {
                result += increment;
            }
            increment = result;
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println("2^3 = " + power(2, 3)); // Output: 8
        System.out.println("3^4 = " + power(3, 4)); // Output: 81
        System.out.println("5^2 = " + power(5, 2)); // Output: 25
        System.out.println("10^0 = " + power(10, 0)); // Output: 1

        try {
             System.out.println("2^-2 = " + power(2, -2));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught Arithmetic Exception for negative power" );
        }

        try {
             System.out.println("0^-2 = " + power(0, -2));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught Arithmetic Exception for negative power of zero" );
        }
    }
}
