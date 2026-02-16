import java.util.Arrays;

class Solution {
    /**
     * Removes duplicate elements from a sorted integer array in-place.
     *
     * @param nums The sorted integer array.
     * @return The new length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index of the last unique element

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
        System.out.println("Array 1: New length = " + len1 + ", Updated array = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Output: [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Array 2: New length = " + len2 + ", Updated array = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2))); // Output: [0, 1, 2, 3, 4]


        //Test cases added as requested for empty and null arrays:
        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Array 3: New length = " + len3 + ", Updated array = " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Output: []

        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Array 4: New length = " + len4 ); // Output: 0 (Handles null gracefully)


    }
}
