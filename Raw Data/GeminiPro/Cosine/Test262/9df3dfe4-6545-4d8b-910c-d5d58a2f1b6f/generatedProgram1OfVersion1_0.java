import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     *
     * @param nums The sorted array
     * @return The length of the updated array
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Initialize k to 1 (first element is always unique)

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // If current element is different from previous
                nums[k] = nums[i];       // Place it at the kth position
                k++;                     // Increment k
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Example 1: Updated Length = " + len1 + ", Updated array = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Example 2: Updated Length = " + len2 + ", Updated array = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));

        // Additional Test cases
        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Example 3: Updated Length = " + len3 + ", Updated array = " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)));


        int[] nums4 = {1, 2, 3, 4, 5};
        int len4 = removeDuplicates(nums4);
        System.out.println("Example 4: Updated Length = " + len4 + ", Updated array = " + Arrays.toString(Arrays.copyOfRange(nums4, 0, len4)));
    }
}

