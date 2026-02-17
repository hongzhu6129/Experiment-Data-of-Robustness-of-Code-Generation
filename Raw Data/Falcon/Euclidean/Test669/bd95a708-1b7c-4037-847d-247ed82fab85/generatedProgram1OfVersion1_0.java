import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array of integers, removes duplicate elements in-place such that each element appears only once.
     * Returns the new length of the array after removing duplicates.
     *
     * @param nums The sorted integer array.
     * @return The length of the array with duplicates removed.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track the position of unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; // Shift the unique element to its correct position
            }
        }

        return uniqueIndex + 1; 
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("New length: " + len1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Expected: 2, [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("New length: " + len2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2))); // Expected: 5, [0, 1, 2, 3, 4]

        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("New length: " + len3 + ", Array: " + Arrays.toString(nums3)); // Expected: 0, []

        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("New length: " + len4  + ", Array: null"); // Expected: 0, null


        int[] nums5 = {1,2,3,4,5};
         int len5= removeDuplicates(nums5);
        System.out.println("New length: " + len5+ ", Array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5))); // Expected: 5, [1, 2, 3, 4, 5]

    }
}
