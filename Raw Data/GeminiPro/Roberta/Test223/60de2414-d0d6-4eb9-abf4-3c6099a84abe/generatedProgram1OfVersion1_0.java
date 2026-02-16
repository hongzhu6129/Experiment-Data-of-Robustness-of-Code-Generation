import java.util.Arrays;

class Solution {
    /**
     * Removes duplicates from a sorted array in-place and returns the new length.
     *
     * @param nums The sorted array.
     * @return The length of the updated array without duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track the position of unique elements

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
        System.out.println("Array 1 - Updated Length: " + len1);
        System.out.println("Array 1 - Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Array 2 - Updated Length: " + len2);
        System.out.println("Array 2 - Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


          int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("Array 3 - Updated Length: " + len3);
         System.out.println("Array 3 - Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)));

        int[] nums4 = null; // Null array
        int len4 = removeDuplicates(nums4);
        System.out.println("Array 4 - Updated Length: " + len4);
        //System.out.println("Array 4 - Updated Array: " + Arrays.toString(nums4)); // Would cause a NullPointerException


        int[] nums5 = {1, 2, 3, 4, 5}; // Already unique
        int len5 = removeDuplicates(nums5);
        System.out.println("Array 5 - Updated Length: " + len5);
        System.out.println("Array 5 - Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)));
    }
}
