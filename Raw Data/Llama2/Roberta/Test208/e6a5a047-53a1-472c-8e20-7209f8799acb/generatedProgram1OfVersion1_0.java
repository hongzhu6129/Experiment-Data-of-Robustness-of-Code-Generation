import java.util.Arrays;

class RemoveDuplicates {

    /**
     * Removes duplicates from a sorted integer array and returns the new length.
     *
     * @param nums The sorted integer array.
     * @return The length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track the position for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++; // Move to the next unique element's position
                nums[uniqueIndex] = nums[i]; // Copy the unique element
            }
        }


        return uniqueIndex + 1; // New length is the index of the last unique element + 1
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Example 1: nums = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)) + ", Length = " + len1); // Output: [1, 2], Length = 2


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Example 2: nums = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2))  + ", Length = " + len2); // Output: [0, 1, 2, 3, 4], Length = 5

        // Example with an empty array
        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Example 3 (Empty Array): Length = " + len3); // Output: 0

        // Example with a null array
         int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Example 4 (Null Array): Length = " + len4); // Output: 0


       int[] nums5 = {1, 2, 3,4, 5}; //already unique
        int len5= removeDuplicates(nums5);
        System.out.println("Example 5 (Already Unique): nums = "+Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)) + ", Length = " +len5); // Output: [1, 2, 3, 4, 5], Length = 5



    }
}
