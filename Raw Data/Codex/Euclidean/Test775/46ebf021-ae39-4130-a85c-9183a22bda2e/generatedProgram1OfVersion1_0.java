import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array of integers, removes duplicate elements in-place such that each element appears only once.
     * Returns the new length of the array, representing the number of unique elements.
     *
     * @param nums The sorted array of integers.
     * @return The length of the updated array containing only unique elements.
     *
     * Example:
     * Input: nums = [1, 1, 2]
     * Output: 2
     * Explanation: The updated array is [1, 2], which contains 2 unique elements.
     *
     * Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
     * Output: 5
     * Explanation: The updated array is [0, 1, 2, 3, 4], which contains 5 unique elements.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index for placing unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;  // Move to the next position for a unique element
                nums[uniqueIndex] = nums[i]; // Place the unique element
            }
        }

        return uniqueIndex + 1; // Return the new length (number of unique elements)
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


        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("Updated array length (empty array): " + len3);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)));

        int[] nums4 = null; // Null array
        int len4 = removeDuplicates(nums4);
        System.out.println("Updated array length (null array): " + len4); 
        // No array to print in the null case
        
        int[] nums5 = {1,2,3,4,5}; // Already unique
        int len5 = removeDuplicates(nums5);
        System.out.println("Updated array length (already unique): " + len5);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)));

    }
}
