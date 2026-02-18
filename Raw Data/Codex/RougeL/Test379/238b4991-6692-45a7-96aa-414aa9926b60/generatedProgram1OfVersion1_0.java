class Solution {
    /**
     * Multiplies two integers without using multiplication, division, bitwise operators, or loops.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of a and b.
     */
    public static int multiply_two_nums(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b > 0) {
            return a + multiply_two_nums(a, b - 1);
        } else {
            return -multiply_two_nums(a, -b); 
        }
    }

    /**
     * Main method for testing.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int product = multiply_two_nums(a, b);
        System.out.println("Product of " + a + " and " + b + " is: " + product);


         a = -5;
         b = 3;
         product = multiply_two_nums(a, b);
        System.out.println("Product of " + a + " and " + b + " is: " + product);


         a = 5;
         b = -3;
         product = multiply_two_nums(a, b);
        System.out.println("Product of " + a + " and " + b + " is: " + product);

         a = -5;
         b = -3;
         product = multiply_two_nums(a, b);
        System.out.println("Product of " + a + " and " + b + " is: " + product);

        a = 5;
        b = 0;
        product = multiply_two_nums(a,b);
        System.out.println("Product of " + a + " and " + b + " is: " + product);
    }
}
