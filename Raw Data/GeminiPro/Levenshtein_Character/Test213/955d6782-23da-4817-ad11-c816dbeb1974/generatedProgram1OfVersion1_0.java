import java.util.Arrays;

class Solution {
    /**
     * Removes duplicates from a sorted integer array in-place and returns the new length.
     *
     * @param nums The sorted integer array.
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
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)) + ", Length: " + len1); // Output: [1, 2], Length: 2

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)) + ", Length: " + len2); // Output: [0, 1, 2, 3, 4], Length: 5
        
        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)) + ", Length: " + len3); // Output: [], Length: 0

        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Updated array: null , Length: " + len4); // Output: null, Length: 0


        int[] nums5 = {1, 2, 3, 4, 5}; // Already unique
        int len5 = removeDuplicates(nums5);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)) + ", Length: " + len5); // Output: [1, 2, 3, 4, 5], Length: 5


    }
}
