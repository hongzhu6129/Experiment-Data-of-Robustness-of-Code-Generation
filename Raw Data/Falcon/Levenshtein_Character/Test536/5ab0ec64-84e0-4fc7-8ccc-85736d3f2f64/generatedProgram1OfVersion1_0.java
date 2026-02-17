import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array of integers, remove the duplicate elements such that each element appears only once.
     * Return the new length of the array.
     *
     * Example:
     * Input: nums = [1,1,2]
     * Output: 2
     * Explanation: The array after removing duplicates is [1,2].
     *
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5
     * Explanation: The array after removing duplicates is [0,1,2,3,4].
     *
     * @param nums The sorted array of integers.
     * @return The new length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;
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
         System.out.println("New length: " + len4+ ", Array: null"); // Handle null input


         int[] nums5 = {1};
        int len5 = removeDuplicates(nums5);
        System.out.println("New length: " + len5 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)));
    }
}
