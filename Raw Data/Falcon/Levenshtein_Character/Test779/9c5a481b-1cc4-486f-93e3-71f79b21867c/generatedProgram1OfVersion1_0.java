import java.util.Arrays;

class Solution {
    /**
     * Removes duplicate elements from a sorted integer array.
     *
     * @param nums The sorted integer array.
     * @return The new length of the array after removing duplicates.
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
        System.out.println("Example 1: Length = " + len1 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Example 2: Length = " + len2 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));

        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("Example 3 (Empty Array): Length = " + len3 + ", Array = " + Arrays.toString(nums3) );

         int[] nums4 = null; // null array
        int len4 = removeDuplicates(nums4);
        System.out.println("Example 4 (Null Array): Length = " + len4 ); // No array to print


    }
}
