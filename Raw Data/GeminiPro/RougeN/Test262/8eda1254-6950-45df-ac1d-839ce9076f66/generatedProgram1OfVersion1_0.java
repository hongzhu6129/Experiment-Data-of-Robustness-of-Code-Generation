import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     *
     * @param nums Sorted integer array
     * @return The length of the updated array without duplicates
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1; // Index for placing unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Updated array length: " + len1);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Updated array length: " + len2);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));

         int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Updated array length: " + len3);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)));


        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Updated array length: " + len4);
        //System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, len4))); // Avoid accessing null array


    }
}
