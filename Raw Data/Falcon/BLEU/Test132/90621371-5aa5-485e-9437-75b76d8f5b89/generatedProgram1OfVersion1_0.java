import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
     *
     * Example 1:
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2,_]
     * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     *
     * Example 2:
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     *
     * Constraints:
     * 1 <= nums.length <= 3 * 10^4
     * -100 <= nums[i] <= 100
     * nums is sorted in non-decreasing order.
     *
     * @param nums The sorted input array
     * @return The new length of the array after removing duplicates
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Initialize the new length to 1 (at least the first element is unique)
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // If the current element is different from the previous one
                nums[k] = nums[i]; // Place the unique element at the kth position
                k++; // Increment the new length
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int length1 = removeDuplicates(nums1);
        System.out.println("Length: " + length1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, length1)));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length2 = removeDuplicates(nums2);
        System.out.println("Length: " + length2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, length2)));

        int[] nums3 = {};
        int length3 = removeDuplicates(nums3);
        System.out.println("Length: " + length3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, length3)));


        int [] nums4 = null;
        int length4 = removeDuplicates(nums4);
         System.out.println("Length: " + length4+ ", Array: " + (nums4 == null ? "null" : Arrays.toString(Arrays.copyOfRange(nums4, 0, length4))));
    }
}
