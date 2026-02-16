import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     *
     * @param nums The sorted input array.
     * @return The length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                nums[++uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Example 1: Updated array length: " + len1);
        System.out.println("Example 1: Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Example 2: Updated array length: " + len2);
        System.out.println("Example 2: Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));

        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Example 3 (Empty array): Updated array length: " + len3);

         int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Example 4 (Null array): Updated array length: " + len4);

        int[] nums5 = {1,2,3,4,5};
        int len5 = removeDuplicates(nums5);
        System.out.println("Example 5 (No Duplicates): Updated array length: " + len5);
        System.out.println("Example 5 (No Duplicates): Updated array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)));

    }
}
