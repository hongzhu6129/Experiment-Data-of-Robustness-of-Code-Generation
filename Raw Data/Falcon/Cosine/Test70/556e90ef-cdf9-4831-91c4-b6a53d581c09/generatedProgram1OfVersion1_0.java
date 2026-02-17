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
        System.out.println("Example 1: New length = " + len1 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Output: 2, [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Example 2: New length = " + len2 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));// Output: 5, [0, 1, 2, 3, 4]

        int[] emptyArray = {};
        int len3 = removeDuplicates(emptyArray);
        System.out.println("Example 3 (Empty array): New length = " + len3 + ", Array = " + Arrays.toString(emptyArray)); // 0, []


         int[] nullArray = null;
        int len4 = removeDuplicates(nullArray);
        System.out.println("Example 4 (Null array): New length = " + len4 ); // 0
    }
}
