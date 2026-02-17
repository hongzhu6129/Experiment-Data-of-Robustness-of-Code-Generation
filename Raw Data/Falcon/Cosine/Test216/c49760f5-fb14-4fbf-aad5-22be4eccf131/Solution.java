import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     *
     * @param nums the sorted array
     * @return the new length
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Start with 1 because the first element is always unique.

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        int len1 = removeDuplicates(nums1);
        System.out.println("Original array: " + Arrays.toString(nums1));
        System.out.println("The length of the original array is: " + nums1.length);
        System.out.println("After removing duplicates, the new length of the array is: " + len1);


    }
}
