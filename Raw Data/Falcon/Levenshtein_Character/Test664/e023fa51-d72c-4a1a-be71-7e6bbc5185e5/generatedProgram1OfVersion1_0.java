import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     *
     * @param nums The sorted array.
     * @return The length of the array with duplicates removed.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index for storing unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; // Shift the unique element to the correct position
            }
        }

        return uniqueIndex + 1;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("New length: " + len1 + ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Output: 2, [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("New length: " + len2 + ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2))); // Output: 5, [0, 1, 2, 3, 4]


        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("New length: " + len3 + ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Output: 0, []

        int[] nums4 = null; // Null array
        int len4 = removeDuplicates(nums4);
        System.out.println("New length: " + len4 + ", Updated array: " + (nums4 == null ? "null" : Arrays.toString(Arrays.copyOfRange(nums4, 0, len4)) )); // Output: 0, null


        int[] nums5 = {1, 2, 3, 4, 5}; // No duplicates
        int len5 = removeDuplicates(nums5);
        System.out.println("New length: " + len5+ ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5))); // Output: 5, [1, 2, 3, 4, 5]



    }
}
