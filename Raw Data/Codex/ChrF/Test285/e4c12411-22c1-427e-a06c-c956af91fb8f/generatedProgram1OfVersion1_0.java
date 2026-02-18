import java.util.Arrays;

class Solution {
    /**
     * Removes duplicate elements from a sorted integer array.
     *
     * @param nums The sorted integer array.
     * @return The new length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Index for the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Example 1: Length = " + len1 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Example 2: Length = " + len2 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));

         // Test with null and empty input
        int[] nums3 = null;
        int len3 = removeDuplicates(nums3);
        System.out.println("Example 3 (Null array): Length = " + len3);

        int[] nums4 = {};
        int len4 = removeDuplicates(nums4);
        System.out.println("Example 4 (Empty array): Length = " + len4);

        //Test with all unique elements
        int[] nums5 = {1, 2, 3, 4, 5};
        int len5 = removeDuplicates(nums5);
        System.out.println("Example 5 (All unique): Length = " + len5 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)));
    }
}
