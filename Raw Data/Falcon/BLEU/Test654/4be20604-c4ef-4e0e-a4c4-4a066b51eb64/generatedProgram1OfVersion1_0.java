import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array of integers, remove the duplicates in-place such that each unique element appears only once.
     * The relative order of the elements should be kept the same.
     * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
     * Return k after placing the final result in the first k slots of nums.
     * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
     *
     * Example:
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
     * It does not matter what you leave beyond the first five elements.
     *
     * @param nums sorted array of integers
     * @return updated length of the array after removing duplicates
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Initialize k to 1 as the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Compare with the previous element
                nums[k] = nums[i];       // If different, place the unique element at the kth position
                k++;                     // Increment k
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k1 = removeDuplicates(nums1);
        System.out.println("k = " + k1 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, k1)));

        int[] nums2 = {1, 1, 2};
        int k2 = removeDuplicates(nums2);
        System.out.println("k = " + k2 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, k2)));

         int[] nums3 = {};
        int k3 = removeDuplicates(nums3);
        System.out.println("k = " + k3 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums3, 0, k3))); // Empty array

        int[] nums4 = {1};
        int k4 = removeDuplicates(nums4);
        System.out.println("k = " + k4 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums4, 0, k4))); // Single element
    }
}
