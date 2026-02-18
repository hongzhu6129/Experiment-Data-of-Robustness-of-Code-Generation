import java.util.Arrays;

public class RemoveDuplicates {

    /**
     * Educational method to remove duplicates from a sorted array and return the new length.
     *
     * @param nums The sorted integer array.
     * @return The length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;  // Handle empty or null input
        }

        int uniqueIndex = 0; // Index to track the position of unique elements


        // Iterate through the array, starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous unique element
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++; // Move to the next unique position
                nums[uniqueIndex] = nums[i]; // Place the unique element at its correct position

            }
        }


        // The length of the unique subarray is uniqueIndex + 1
        return uniqueIndex + 1;



    }


    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Example 1: Updated Length = " + len1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1,0,len1)));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Example 2: Updated Length = " + len2+ ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2,0,len2)));

        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("Example 3 (Empty Array): Updated Length = " + len3 + ", Array: " + Arrays.toString(nums3)); // Output: []

        int[] nums4 = null; // Null array
        int len4 = removeDuplicates(nums4);
        System.out.println("Example 4 (Null Array): Updated Length = " + len4); // Output: 0



    }
}
