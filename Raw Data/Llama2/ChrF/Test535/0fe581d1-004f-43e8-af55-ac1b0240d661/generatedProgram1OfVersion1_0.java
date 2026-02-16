class Solution {
    /**
     * Finds the contiguous subarray with the largest sum in a given array of non-negative integers.
     *
     * @param nums The input array of non-negative integers.
     * @return The maximum sum of a contiguous subarray.
     */
    public static int max_SubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // Handle empty or null input
        }

        int maxSoFar = 0;
        int currentMax = 0;

        for (int num : nums) {
            currentMax += num; 
            
            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }
             // Since all numbers are non-negative, we don't need to reset currentMax to 0. If it were to become negative (which it won't in this case), the optimal strategy would be to simply start a new subarray from the next positive number.
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Maximum subarray sum: " + max_SubArray(nums1)); // Output: 15

        int[] nums2 = {5, 4, -10, 7, 8}; // Example with a negative number (even though the prompt says non-negative, showing how it *would* be handled if they were present).
        System.out.println("Maximum subarray sum: " + max_SubArray(nums2)); // Output: 15 (7+8)

        int[] nums3 = {};
        System.out.println("Maximum subarray sum: " + max_SubArray(nums3)); // Output: 0

        int[] nums4 = {0,0,0};
        System.out.println("Maximum subarray sum:" + max_SubArray(nums4)); // Output: 0
    }
}
