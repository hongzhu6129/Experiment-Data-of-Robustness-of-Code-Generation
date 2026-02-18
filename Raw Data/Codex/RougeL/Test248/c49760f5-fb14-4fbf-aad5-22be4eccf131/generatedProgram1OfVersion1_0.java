import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array of integers, find the length of the array after removing duplicates.
     *
     * @param nums The sorted array of integers.
     * @return The length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Index for the unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i]; 
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        int len1 = removeDuplicates(nums1);
        System.out.println("Original array: " + Arrays.toString(nums1));
        System.out.println("The length of the original array is: " + nums1.length);
        System.out.println("After removing duplicates, the new length of the array is: " + len1);


         // Additional test cases (optional, but recommended for thorough testing)
        int[] nums2 = {};
        int len2 = removeDuplicates(nums2);
        System.out.println("Original array: " + Arrays.toString(nums2));
        System.out.println("After removing duplicates, the new length of the array is: " + len2);

        int[] nums3 = {1, 2, 3, 4, 5};
        int len3 = removeDuplicates(nums3);
        System.out.println("Original array: " + Arrays.toString(nums3));
        System.out.println("After removing duplicates, the new length of the array is: " + len3);

        int[] nums4 = {1, 1, 1, 1, 1};
        int len4 = removeDuplicates(nums4);
        System.out.println("Original array: " + Arrays.toString(nums4));
        System.out.println("After removing duplicates, the new length of the array is: " + len4);


    }
}
