import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
     *
     * @param nums The sorted array
     * @return The new length of the array
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Index for the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Example 1: Updated length = " + len1 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Example 2: Updated length = " + len2 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


        //Empty array case
        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Example 3 (Empty array): Updated length = " + len3 + ", Array = " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)));

         //Null array case
        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.print("Example 4 (Null array): Updated length = " + len4 ); // No array to print


    }
}
