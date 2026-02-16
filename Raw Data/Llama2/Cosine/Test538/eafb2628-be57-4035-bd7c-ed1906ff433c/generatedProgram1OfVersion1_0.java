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

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int result = multiply_two_nums(a, b);
        System.out.println("The product of " + a + " and " + b + " is: " + result);


        a = -5;
        b = 3;
        result = multiply_two_nums(a, b);
        System.out.println("The product of " + a + " and " + b + " is: " + result);


        a = 5;
        b = -3;
        result = multiply_two_nums(a, b);
        System.out.println("The product of " + a + " and " + b + " is: " + result);

        a = -5;
        b = -3;
        result = multiply_two_nums(a, b);
        System.out.println("The product of " + a + " and " + b + " is: " + result);


        a = 5;
        b = 0;
        result = multiply_two_nums(a, b);
        System.out.println("The product of " + a + " and " + b + " is: " + result);

        a = 0;
        b = 3;
        result = multiply_two_nums(a, b); // Demonstrates handling b=0 in recursive call
        System.out.println("The product of " + a + " and " + b + " is: " + result);
    }
}
