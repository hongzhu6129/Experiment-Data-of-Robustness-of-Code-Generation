import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
     *
     * @param nums Sorted array of integers
     * @return The length of the updated array containing unique elements.
     *
     * Example 1:
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2,_]
     * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     *
     * Example 2:
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track the position of unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; 
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Length: " + len1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Length: " + len2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


        // Test case with empty array
        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Length: " + len3 + ", Array: " + Arrays.toString(nums3)); // Output: 0, []

         // Test case with null array
        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Length: " + len4); // Output: 0


        // Test with all duplicates:
        int[] nums5 = {1,1,1,1,1};
        int len5 = removeDuplicates(nums5);
        System.out.println("Length: " + len5 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5))); // 1, [1]

        // Test with unique elements:
        int [] nums6 = {1,2,3,4,5};
        int len6 = removeDuplicates(nums6);
        System.out.println("Length: " + len6 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums6, 0, len6))); // 5, [1, 2, 3, 4, 5]

    }
}
