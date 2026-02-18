import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     *
     * @param nums Sorted array of integers
     * @return The new length of the array after removing duplicates
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Initialize k to 1 (first element is unique)

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Place unique element at index k
                k++;              // Increment k
            }
        }

        return k; 
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Example 1: Updated Length = " + len1 );
        System.out.println("Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Example 2: Updated Length = " + len2 );
        System.out.println("Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));

         int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Example 3: Updated Length = " + len3 );
        System.out.println("Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)));


         int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Example 4: Updated Length = " + len4 );


    }
}
