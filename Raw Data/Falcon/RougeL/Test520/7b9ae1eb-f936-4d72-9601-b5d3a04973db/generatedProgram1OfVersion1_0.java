import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     *
     * @param nums the sorted array
     * @return the new length of the array after removing duplicates
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index for placing unique elements

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
        System.out.println("Length after removing duplicates: " + len1);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Print only the relevant part

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Length after removing duplicates: " + len2);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));

        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Length after removing duplicates: " + len3);
        System.out.println("Modified array: " + Arrays.toString(nums3)); // Empty array

        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Length after removing duplicates: " + len4);
        System.out.println("Modified array: null"); // Handle null input


        int[] nums5 = {1, 2, 3, 4, 5};
        int len5 = removeDuplicates(nums5);
        System.out.println("Length after removing duplicates: " + len5);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)));

    }
}
