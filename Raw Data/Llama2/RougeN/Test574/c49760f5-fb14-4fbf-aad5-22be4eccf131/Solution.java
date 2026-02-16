import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array of integers, remove duplicates in-place such that each element appears only once and returns the new length.
     *
     * @param nums The sorted array of integers.
     * @return The new length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        int newLength1 = removeDuplicates(nums1);
        System.out.println("Original array: " + Arrays.toString(nums1));
        System.out.println("The length of the original array is: " + nums1.length);
        System.out.println("After removing duplicates, the new length of the array is: " + newLength1);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1)));


    }
}
