import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     *
     * @param nums The sorted array to remove duplicates from.
     * @return The length of the updated array.
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

    /**
     * Main method to demonstrate the removeDuplicates function.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int length1 = removeDuplicates(nums1);
        System.out.println("Updated array length: " + length1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, length1))); // Output: 2, [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length2 = removeDuplicates(nums2);
        System.out.println("Updated array length: " + length2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, length2))); // Output: 5, [0, 1, 2, 3, 4]

        int[] nums3 = {};
        int length3 = removeDuplicates(nums3);
        System.out.println("Updated array length: " + length3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, length3))); // Output: 0, []

         int[] nums4 = null;
        int length4 = removeDuplicates(nums4);
        System.out.println("Updated array length: " + length4+ ", Array: null"); // Output: 0, null

    }
}
