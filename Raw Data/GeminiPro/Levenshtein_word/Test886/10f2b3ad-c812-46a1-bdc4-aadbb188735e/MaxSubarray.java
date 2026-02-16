public class MaxSubarray {

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum contiguous sum is " + max_SubArray(nums1)); // Output: 6

        int[] nums2 = {-1};
        System.out.println("Maximum contiguous sum is " + max_SubArray(nums2)); // Output: -1
        
        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Maximum contiguous sum is " + max_SubArray(nums3)); // Output: 23


    }

    public static int max_SubArray(int[] nums) {
        int maxSoFar = nums[0];  // Initialize with the first element
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide whether to extend the current subarray or start a new one
            currentMax = Math.max(nums[i], currentMax + nums[i]);

            // Update the overall maximum if the current subarray sum is greater
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}
