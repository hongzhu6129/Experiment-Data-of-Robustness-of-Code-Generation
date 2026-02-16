class Solution {
    /**
     * Checks if the value 20 appears three times and no 20's are next to each other in an array.
     *
     * @param nums The array of integers to check.
     * @return `true` if 20 appears three times and no 20's are adjacent, `false` otherwise.
     */
    public boolean check20(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 20) {
                count++;
                if (i < nums.length - 1 && nums[i + 1] == 20) {
                    return false; // Adjacent 20s found
                }
            }
        }
        return count == 3; // Check if 20 appears exactly three times
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {20, 1, 20, 3, 20};
        System.out.println(solution.check20(nums1)); // Output: true

        int[] nums2 = {20, 20, 1, 20};
        System.out.println(solution.check20(nums2)); // Output: false

        int[] nums3 = {20, 1, 20, 20, 3};
        System.out.println(solution.check20(nums3)); // Output: false

        int[] nums4 = {20, 1, 20, 3};
        System.out.println(solution.check20(nums4)); // Output: false


        int[] nums5 = {1, 2, 3, 4, 5};
        System.out.println(solution.check20(nums5)); // Output: false

        int[] nums6 = {20, 1, 20, 1, 20, 5, 6};
        System.out.println(solution.check20(nums6)); // Output: true


         int[] nums7 = {20, 20, 20, 1};
        System.out.println(solution.check20(nums7)); // Output: false
    }
}
