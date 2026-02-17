import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array of integers `nums`, remove the duplicates in-place such that each element appears only once and returns the new length.
     * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
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
     *
     * @param nums The sorted input array
     * @return The length of the array after removing duplicates
     */

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track the position of unique elements

        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous unique element,
            // we've found a new unique element
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++; // Move to the next position for the unique element
                nums[uniqueIndex] = nums[i]; // Place the unique element at its correct position
            }
        }

        return uniqueIndex + 1; // Return the length of the unique subarray
    }




    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int length1 = removeDuplicates(nums1);
        System.out.println("Example 1: New length = " + length1 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, length1))); // Output: 2, [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length2 = removeDuplicates(nums2);
        System.out.println("Example 2: New length = " + length2 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, length2))); // Output: 5, [0, 1, 2, 3, 4]

        // Test case with an empty array
        int[] nums3 = {};
        int length3 = removeDuplicates(nums3);
        System.out.println("Example 3: New length = " + length3 + ", Array = " + Arrays.toString(nums3)); // Output: 0, []

        // Test case with a null array
        int[] nums4 = null;
        int length4 = removeDuplicates(nums4);
        System.out.println("Example 4: New length = " + length4 ); // Output: 0

         // Test case with all same elements
        int[] nums5 = {1,1,1,1};
        int length5 = removeDuplicates(nums5);
        System.out.println("Example 5: New length = " + length5 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums5, 0, length5))); // Output: 1, [1]
    }
}
