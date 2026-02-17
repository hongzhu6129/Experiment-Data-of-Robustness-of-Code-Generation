import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     *
     * @param nums Sorted array of integers
     * @return Length of the updated array after removing duplicates
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Initialize with 1 since the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("The length of the original array is: " + nums.length);


        int newLength = removeDuplicates(nums);
        System.out.println("After removing duplicates, the new length of the array is: " + newLength);

         // Print the updated array (optional - for visualization)
        System.out.print("Updated array: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");



    }
}
