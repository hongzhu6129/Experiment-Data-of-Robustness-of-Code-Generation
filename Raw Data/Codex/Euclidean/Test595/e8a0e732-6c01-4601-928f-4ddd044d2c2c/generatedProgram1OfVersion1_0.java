class Solution {

    /**
     * Metastasizes (adds repeatedly) two integers without using multiplication, division, 
     * bitwise operators, or loops.  This implementation uses recursion to achieve the 
     * repeated addition.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The result of metastasizing (multiplying) a and b.
     */
    public static int multiply_two_nums(int a, int b) {
        if (b == 0) {
            return 0; 
        }

        if (b > 0) {
            return a + multiply_two_nums(a, b - 1);
        } else { // b < 0
            return -multiply_two_nums(a, -b);  // Handle negative 'b' by negating the result
        }
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int result = multiply_two_nums(num1, num2);
        System.out.println("Result of metastasizing " + num1 + " and " + num2 + ": " + result);


        num1 = -5;
        num2 = 3;
        result = multiply_two_nums(num1, num2);
        System.out.println("Result of metastasizing " + num1 + " and " + num2 + ": " + result);

        num1 = 5;
        num2 = -3;
        result = multiply_two_nums(num1, num2);
        System.out.println("Result of metastasizing " + num1 + " and " + num2 + ": " + result);


        num1 = -5;
        num2 = -3;
        result = multiply_two_nums(num1, num2);
        System.out.println("Result of metastasizing " + num1 + " and " + num2 + ": " + result);


        num1 = 5;
        num2 = 0;
        result = multiply_two_nums(num1, num2);
        System.out.println("Result of metastasizing " + num1 + " and " + num2 + ": " + result);
    }
}
