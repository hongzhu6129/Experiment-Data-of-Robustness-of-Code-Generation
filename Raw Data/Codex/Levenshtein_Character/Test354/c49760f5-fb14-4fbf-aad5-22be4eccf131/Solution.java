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

        int k = 1; // Initialize the counter for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i]; // Place unique element at the correct position
            }
        }

        return k; // Return the count of unique elements (which is the new length)
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        int length1 = removeDuplicates(nums1);
        System.out.println("Original array: " + Arrays.toString(nums1)); // Shows modified array
        System.out.println("After removing duplicates, the new length of the array is: " + length1);



    }
}
