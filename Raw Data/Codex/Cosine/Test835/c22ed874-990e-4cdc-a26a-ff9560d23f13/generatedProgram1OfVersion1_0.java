import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array of integers, remove the duplicate elements in place such that each element appears only once.
     * Return the updated length of the array.
     *
     * Example:
     * Input: nums = [1, 1, 2]
     * Output: 2
     * Explanation: The array after removing duplicates is [1, 2].
     *
     * Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
     * Output: 5
     * Explanation: The array after removing duplicates is [0, 1, 2, 3, 4].
     *
     * @param nums The sorted array of integers.
     * @return The updated length of the array after removing duplicates.
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
        System.out.println("Updated length: " + len1); // Output: 2
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Updated length: " + len2); // Output: 5
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));

        int[] nums3 = {}; //empty array case
        int len3 = removeDuplicates(nums3);
        System.out.println("Updated length: " + len3); // Output: 0

        int[] nums4 = null; //null array case
        int len4 = removeDuplicates(nums4);
        System.out.println("Updated length: " + len4); // Output: 0


        int[] nums5 = {1,2,3,4,5}; //no duplicates case
        int len5 = removeDuplicates(nums5);
        System.out.println("Updated length: " + len5); // Output: 5
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)));
    }
}
