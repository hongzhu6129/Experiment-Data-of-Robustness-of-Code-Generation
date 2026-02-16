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
        System.out.println(test(1, 2, 3)); // Output: true
        System.out.println(test(3, 2, 1)); // Output: true
        System.out.println(test(1, 3, 2)); // Output: true
        System.out.println(test(1, 2, 4)); // Output: false
        System.out.println(test(4, 2, 1)); // Output: false


    }
}
