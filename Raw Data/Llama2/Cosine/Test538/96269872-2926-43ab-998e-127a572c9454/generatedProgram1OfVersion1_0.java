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
        } else { // b < 0
            return -multiply_two_nums(a, -b);
        }
    }


    public static void main(String[] args) {
        System.out.println(multiply_two_nums(5, 3)); // Output: 15
        System.out.println(multiply_two_nums(5, -3)); // Output: -15
        System.out.println(multiply_two_nums(-5, 3)); // Output: -15
        System.out.println(multiply_two_nums(-5, -3)); // Output: 15
        System.out.println(multiply_two_nums(0, 3)); // Output: 0
        System.out.println(multiply_two_nums(5, 0)); // Output: 0


    }
}
