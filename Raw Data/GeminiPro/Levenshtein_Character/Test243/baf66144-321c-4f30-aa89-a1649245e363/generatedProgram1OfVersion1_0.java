import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
     *
     * Example 1:
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2,_]
     *
     * Example 2:
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     *
     * @param nums The sorted array to modify.
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
        System.out.println("Length: " + len1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Output: Length: 2, Array: [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Length: " + len2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2))); // Output: Length: 5, Array: [0, 1, 2, 3, 4]

        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Length: " + len3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Output: Length: 0, Array: []

         int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Length: " + len4 ); // Output: Length: 0

        int[] nums5 = {1};
        int len5 = removeDuplicates(nums5);
        System.out.println("Length: " + len5 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5))); // Output: Length: 1, Array: [1]
    }
}
