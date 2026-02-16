import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
     *
     * @param nums sorted array of integers
     * @return length of the array after removing duplicates
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; // Move the unique element forward
            }
        }

        return uniqueIndex + 1;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Length after removing duplicates: " + len1);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Print only the relevant part


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Length after removing duplicates: " + len2);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));

         int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Length after removing duplicates: " + len3);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Will print an empty array


        int[] nums4 = null; // Test with null input
        int len4 = removeDuplicates(nums4);
        System.out.println("Length after removing duplicates: " + len4); // Output should be 0
        // System.out.println("Modified array: " + Arrays.toString(nums4));  // Avoid this, as it would cause a NullPointerException if nums4 is null
    }
}
