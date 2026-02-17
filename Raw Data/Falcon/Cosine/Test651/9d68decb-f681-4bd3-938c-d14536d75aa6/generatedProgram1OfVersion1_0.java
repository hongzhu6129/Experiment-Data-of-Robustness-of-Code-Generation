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
        int num1 = 5;
        int num2 = 3;
        int product = multiply_two_nums(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        num1 = -5;
        num2 = 3;
        product = multiply_two_nums(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        num1 = 5;
        num2 = -3;
        product = multiply_two_nums(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        num1 = -5;
        num2 = -3;
        product = multiply_two_nums(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);


         num1 = 5;
        num2 = 0;
        product = multiply_two_nums(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);
    }
}
