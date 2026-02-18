class Solution {
    /**
     * Checks if three integers are consecutive.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @param c The third integer.
     * @return True if the integers are consecutive, false otherwise.
     */
    public static boolean test(int a, int b, int c) {
        int[] nums = {a, b, c};
        java.util.Arrays.sort(nums);

        return (nums[1] == nums[0] + 1 && nums[2] == nums[1] + 1);


    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(test(1, 2, 3)); // True
        System.out.println(test(3, 2, 1)); // True
        System.out.println(test(1, 3, 2)); // True
        System.out.println(test(1, 4, 2)); // False
        System.out.println(test(5, 7, 6)); // True
        System.out.println(test(5, 6, 8)); // False


    }
}
