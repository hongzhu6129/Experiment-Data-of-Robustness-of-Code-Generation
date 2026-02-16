import java.util.Arrays;

class Solution {
    /**
     * Removes duplicates from a sorted integer array in-place.
     *
     * @param nums The sorted integer array.
     * @return The length of the updated array (number of unique elements).
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index for storing unique elements

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
        System.out.println("Updated array length: " + len1);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Print only the unique part


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Updated array length: " + len2);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2))); // Print only the unique part

        //Test with empty and null arrays
         int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Updated array length: " + len3);
        System.out.println("Updated array: " + Arrays.toString(nums3));

         int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Updated array length: " + len4);

          // Single Element
         int[] nums5 = {5};
        int len5 = removeDuplicates(nums5);
        System.out.println("Updated array length: " + len5);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)));


    }
}
