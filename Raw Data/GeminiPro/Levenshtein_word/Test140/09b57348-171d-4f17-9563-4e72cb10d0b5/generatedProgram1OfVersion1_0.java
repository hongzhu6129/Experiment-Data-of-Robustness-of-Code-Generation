class Solution {
    /**
     * Given an array of integers, every element appears twice except for one. Find that single one.
     *
     * @param nums The input array of integers.
     * @return The single number that appears only once.
     *
     * Example:
     * Input: nums = [2,2,1]
     * Output: 1
     *
     * Input: nums = [4,1,2,1,2]
     * Output: 4
     *
     * Input: nums = [1]
     * Output: 1
     */
    public int getSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {2, 2, 1};
        int singleNumber1 = solution.getSingleNumber(nums1);
        System.out.println("Single Number (Example 1): " + singleNumber1); // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        int singleNumber2 = solution.getSingleNumber(nums2);
        System.out.println("Single Number (Example 2): " + singleNumber2); // Output: 4

        int[] nums3 = {1};
        int singleNumber3 = solution.getSingleNumber(nums3);
        System.out.println("Single Number (Example 3): " + singleNumber3); // Output: 1


        // Additional test cases (optional)
        int[] nums4 = {1, 1, 3, 4, 4, 5, 5};
        int singleNumber4 = solution.getSingleNumber(nums4);
        System.out.println("Single Number (Example 4): " + singleNumber4); // Output: 3

    }
}
