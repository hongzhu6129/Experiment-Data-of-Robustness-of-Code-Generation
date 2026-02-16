import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array of integers, find the length of the array after removing duplicate elements.
     *
     * @param nums The sorted array of integers.
     * @return The length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Initialize k to 1 (first element is always unique)
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        return k;

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        int length1 = removeDuplicates(nums1);
        System.out.println("Original array: " + Arrays.toString(nums1));
        System.out.println("The length of the original array is: " + nums1.length);


        System.out.println("After removing duplicates, the new length of the array is: " + length1);


    }
}
