import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array of integers, remove the duplicates in-place such that each element appears only once and return the new length.
     * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
     *
     * Example:
     * Given nums = [1,1,2],
     * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
     * It doesn't matter what you leave beyond the returned length.
     *
     * @param nums The sorted array of integers.
     * @return The new length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track unique elements

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
        System.out.println("New length: " + len1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("New length: " + len2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("New length: " + len3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)));


        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("New length: " + len4 + ", Array: null"); //  Handle null input


         int[] nums5 = {1};
        int len5 = removeDuplicates(nums5);
        System.out.println("New length: " + len5 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5))); // Handle single-element input



    }
}

