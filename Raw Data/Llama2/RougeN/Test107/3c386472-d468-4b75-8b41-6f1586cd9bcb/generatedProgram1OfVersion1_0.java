import java.util.Arrays;

public class RemoveDuplicates {

    /**
     * Removes duplicates from a sorted integer array in-place and returns the new length.
     *
     * @param nums The sorted integer array.
     * @return The length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // Handle empty or null input
        }

        int uniqueIndex = 0; // Index to track the position for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {  // If current element is different from the last unique element
                uniqueIndex++;                   // Move to the next position for unique elements
                nums[uniqueIndex] = nums[i];     // Place the current unique element at the correct position
            }
        }

        // The array up to uniqueIndex + 1 now contains the unique elements.
        // We don't actually remove the duplicates from the original array physically,
        // but we logically consider the subarray from index 0 to uniqueIndex as the new array.

        // Print the updated array (optional - for demonstration):
        System.out.println("Updated array (elements up to index " + uniqueIndex + "): " + Arrays.toString(Arrays.copyOfRange(nums, 0, uniqueIndex + 1)));


        return uniqueIndex + 1;  // Return the new length
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int length1 = removeDuplicates(nums1);
        System.out.println("New length: " + length1); // Expected output: 2


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length2 = removeDuplicates(nums2);
        System.out.println("New length: " + length2);  // Expected output: 5

        int[] nums3 = {}; // Empty array
        int length3 = removeDuplicates(nums3);
        System.out.println("New length: " + length3); // Expected output: 0


        int[] nums4 = null; // Null array
        int length4 = removeDuplicates(nums4);
        System.out.println("New length: " + length4); // Expected output: 0

         int[] nums5 = {1, 2, 3, 4, 5}; // No duplicates
        int length5 = removeDuplicates(nums5);
        System.out.println("New length: " + length5); // Expected output: 5
    }
}
