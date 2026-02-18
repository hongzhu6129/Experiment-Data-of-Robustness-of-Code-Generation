import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and return the new length.
     *
     * @param nums Sorted array of integers
     * @return The length of the array with duplicates removed.
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
        System.out.println("Example 1: Expected Length = 2, Actual Length = " + len1 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Example 2: Expected Length = 5, Actual Length = " + len2 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Example 3 (Empty Array): Expected Length = 0, Actual Length = " + len3+ ", Array = " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)));

        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
         System.out.println("Example 4 (Null Array): Expected Length = 0, Actual Length = " + len4); // No array to print



    }
}
