import java.util.Arrays;

class Solution {
    /**
     * Removes duplicates from a sorted array in-place.
     *
     * @param nums The sorted array.
     * @return The new length of the array after removing duplicates.
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
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Updated array length: " + len1);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Print only the updated portion

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Updated array length: " + len2);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2))); // Print only the updated portion


        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("Updated array length: " + len3);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)));

        int[] nums4 = null; // Null array
        int len4 = removeDuplicates(nums4);
        System.out.println("Updated array length: " + len4); 
        // Don't try to print a null array; it'll cause a NullPointerException
         if(nums4 != null){
            System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, len4)));
        }


    }
}
