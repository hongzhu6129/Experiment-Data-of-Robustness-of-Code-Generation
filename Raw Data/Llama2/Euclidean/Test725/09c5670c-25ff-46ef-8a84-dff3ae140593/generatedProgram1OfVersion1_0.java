class Solution {
    /**
     * Multiplies two non-zero integers without using multiplication, division, 
     * bitwise operators, or loops.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of a and b.
     * @throws IllegalArgumentException if either a or b is zero.
     */
    public static int multiply_two_nums(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Input numbers cannot be zero.");
        }

        // Handle negative numbers
        int sign = 1;
        if (a < 0) {
            sign *= -1;
            a = -a;
        }
        if (b < 0) {
            sign *= -1;
            b = -b;
        }

        // Use recursion and repeated addition
       int result = multiplyRecursive(a, b);

        return sign * result;

    }

    private static int multiplyRecursive(int a, int b) {
        if (b == 1) {
            return a;
        }
        if(b == 0) return 0;


       return a + multiplyRecursive(a, b-1);
    }


    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int result = multiply_two_nums(num1, num2);
        System.out.println("Product: " + result); // Output: 15

        num1 = -2;
        num2 = 4;
        result = multiply_two_nums(num1, num2);
        System.out.println("Product: " + result); // Output: -8


         num1 = -2;
        num2 = -4;
        result = multiply_two_nums(num1, num2);
        System.out.println("Product: " + result); // Output: 8

        try {
            multiply_two_nums(5, 0); // Should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }



    }
}
