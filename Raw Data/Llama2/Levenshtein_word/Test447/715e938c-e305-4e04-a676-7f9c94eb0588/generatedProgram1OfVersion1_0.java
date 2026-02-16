import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     *
     * @param nums The sorted array
     * @return The new length of the array after removing duplicates
     */
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1; // Index to place the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
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


        //Test case with empty array
        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Updated array length: " + len3);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)));
         
        //Test case with one element
        int[] nums4 = {5};
        int len4 = removeDuplicates(nums4);
        System.out.println("Updated array length: " + len4);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, len4)));



    }
}
