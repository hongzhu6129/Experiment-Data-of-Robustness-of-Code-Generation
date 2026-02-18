public class ModulusWithoutModulus {

    public static int calculateModulus(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero.");
        }

        // Handle negative numbers
        if (dividend < 0) {
            return calculateModulus(-dividend, divisor) * (divisor < 0 ? -1 : 1) ; // Adjust sign if needed
        }
        if (divisor < 0) {
            return calculateModulus(dividend, -divisor);
        }


        // Repeated subtraction method (efficient if divisor is small)
        while (dividend >= divisor) {
            dividend -= divisor;
        }

        return dividend;
    }

    public static void main(String[] args) {
         // Test cases
        System.out.println("10 % 3 = " + calculateModulus(10, 3));     // Expected: 1
        System.out.println("15 % 5 = " + calculateModulus(15, 5));     // Expected: 0
        System.out.println("7 % 9 = " + calculateModulus(7, 9));     // Expected: 7
        System.out.println("-10 % 3 = " + calculateModulus(-10, 3));    // Expected: 2  (-10 = -4*3 + 2) Careful with sign!
        System.out.println("10 % -3 = " + calculateModulus(10, -3));    // Expected: 1 
        System.out.println("-10 % -3 = " + calculateModulus(-10, -3));   // Expected: -1 (-10 = 4*-3 + 2, but divisor is negative)
        System.out.println("0 % 5 = " + calculateModulus(0, 5));      // Expected: 0 
        System.out.println("5 % 0 = ");

        try {
            System.out.println(calculateModulus(5, 0));       // Expected: ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }



        // Large numbers test
        System.out.println("123456789 % 123 = " + calculateModulus(123456789, 123));

        // Integer.MIN_VALUE cases (corner cases for potential overflow)
        System.out.println(Integer.MIN_VALUE + " % 2" + " = " + calculateModulus(Integer.MIN_VALUE, 2)); // 0
        System.out.println(Integer.MIN_VALUE + " % -1" + " = " + calculateModulus(Integer.MIN_VALUE, -1)); // 0 (careful!)

    }
}
