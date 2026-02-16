import java.util.Arrays;

class Solution {
    /**
     * Removes duplicates from a sorted integer array in-place and returns the new length.
     *
     * @param nums The sorted integer array.
     * @return The length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track the position of unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {  // If the current element is different from the last unique element
                uniqueIndex++;                   // Move to the next unique position
                nums[uniqueIndex] = nums[i];     // Place the current element at the unique position
            }
        }

        return uniqueIndex + 1; // Return the new length (number of unique elements)
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("New length: " + len1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Expected: 2, [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("New length: " + len2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2))); // Expected: 5, [0, 1, 2, 3, 4]
        

        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("New length: " + len3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Expected: 0, []

        int[] nums4 = null; // Null array
        int len4 = removeDuplicates(nums4);
        System.out.println("New length: " + len4 ); // Expected: 0
         if (nums4 != null) {
             System.out.println( ", Array: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, len4))); // This won't execute
        }




    }
}
