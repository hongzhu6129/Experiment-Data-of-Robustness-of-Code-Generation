class Solution {
    /**
     * Checks if one integer is the midpoint between two others.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @param c The third integer.
     * @return True if one integer is the midpoint, false otherwise.
     */
    public static boolean test(int a, int b, int c) {
        if ((a + c) == 2 * b || (a + b) == 2 * c || (b + c) == 2 * a) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(test(2, 4, 6)); // Output: true
        System.out.println(test(4, 6, 2)); // Output: true
        System.out.println(test(2, 4, 5)); // Output: false
        System.out.println(test(1, 2, 3)); // Output: true
        System.out.println(test(5, 3, 1)); // Output: true
        System.out.println(test(1, 5, 3)); // Output: true


    }
}
