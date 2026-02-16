import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array of integers, removes duplicate elements in-place such that each unique element appears only once.
     * The relative order of the elements should be kept the same.
     *
     * Returns the length of the updated array (number of unique elements).
     *
     * Example:
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     *
     * @param nums The sorted input array of integers
     * @return The new length of the array after removing duplicates
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track the position for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len1 = removeDuplicates(nums1);
        System.out.println("Length: " + len1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));

        int[] nums2 = {1, 1, 2};
        int len2 = removeDuplicates(nums2);
        System.out.println("Length: " + len2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));

        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Length: " + len3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Empty array

        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Length: " + len4); // null input
        
        int[] nums5 = {1};
        int len5 = removeDuplicates(nums5);
        System.out.println("Length: " + len5 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5))); // Single element
    }
}
