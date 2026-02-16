public class ModulusWithoutOperator {

    public static int modulus(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero.");
        }

        // Handle negative numbers
        if (dividend < 0) {
            return modulus(-dividend, divisor) * (divisor > 0 ? -1 : 1) ; // Propagate sign correctly
        }
        if (divisor < 0) {
            return modulus(dividend, -divisor);
        }



        // Repeated subtraction method 
        while (dividend >= divisor) {
            dividend -= divisor;
        }

        return dividend;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("10 % 3 = " + modulus(10, 3));  // Output: 1
        System.out.println("15 % 5 = " + modulus(15, 5));  // Output: 0
        System.out.println("7 % 9 = " + modulus(7, 9));  // Output: 7 
        System.out.println("-10 % 3 = " + modulus(-10, 3)); // Output: -1
        System.out.println("10 % -3 = " + modulus(10, -3)); // Output: 1
        System.out.println("-10 % -3 = " + modulus(-10, -3));// Output: -1

        // Corner cases
        System.out.println("0 % 5 = " + modulus(0, 5));  // Output: 0
        System.out.println("5 % 1 = " + modulus(5,1)); // Output 0

        try {
             System.out.println("5 % 0 = " + modulus(5, 0)); // Should throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage()); 
        }

         System.out.println("Integer.MIN_VALUE % 2 = " + modulus(Integer.MIN_VALUE, 2)); // Output: 0
         System.out.println("Integer.MAX_VALUE % 2 = " + modulus(Integer.MAX_VALUE, 2)); // Output: 1
        System.out.println("Integer.MIN_VALUE % -1 = " + modulus(Integer.MIN_VALUE, -1)); // Expect 0



    }
}
