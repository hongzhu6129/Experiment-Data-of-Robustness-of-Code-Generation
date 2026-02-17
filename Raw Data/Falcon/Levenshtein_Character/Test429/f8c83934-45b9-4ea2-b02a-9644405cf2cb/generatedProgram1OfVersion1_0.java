import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array of integers, removes duplicate elements in-place such that each unique element appears only once.
     * The relative order of the elements should be kept the same.
     *
     * Returns the new length of the array after removing duplicates.
     *
     * @param nums The sorted array of integers.
     * @return The length of the updated array.
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
        System.out.println("Updated array length: " + len1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Output: 2, [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Updated array length: " + len2+ ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2))); // Output: 5, [0, 1, 2, 3, 4]

         int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Updated array length: " + len3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Output: 0, []

        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Updated array length: " + len4  + ", Array: null"); // Output: 0, null


        int[] nums5 = {1, 2, 3, 4, 5}; // Already unique
        int len5 = removeDuplicates(nums5);
        System.out.println("Updated array length: " + len5+ ", Array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5))); // Output: 5, [1, 2, 3, 4, 5]

    }
}

