import java.util.Arrays;

public class RemoveDuplicates {

    /**
     * Removes duplicates from a sorted integer array and returns the new length.
     *
     * @param nums The sorted integer array.
     * @return The length of the array after removing duplicates.
     * This educational code demonstrates how to remove duplicates from a sorted array efficiently.
     * It uses a two-pointer approach to overwrite duplicate elements, achieving in-place modification.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {  // Handle empty or null input
            return 0;
        }

        int uniqueIndex = 0; // Pointer to track the index of unique elements


        // Iterate through the array, comparing each element with the previous unique element.
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++; // Move to the next unique element's index
                nums[uniqueIndex] = nums[i]; // Place the unique element at the correct position.

            } // If it's a duplicate, the 'i' pointer moves forward, but 'uniqueIndex' stays.
            // effectively overwriting duplicates on the next iteration.
        }

        // Note: The portion of the array after uniqueIndex contains the overwritten duplicate elements.
        //      However, the problem only requires the new length, so we don't need to handle the rest.

        return uniqueIndex + 1; // Return the length of the updated array (number of unique elements)
    }

    /**
     * Main method for demonstration.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int newLength1 = removeDuplicates(nums1);
        System.out.println("New length: " + newLength1 + ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1))); // Expected Output: 2, [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength2 = removeDuplicates(nums2);
        System.out.println("New length: " + newLength2+ ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2))); // Expected Output: 5, [0, 1, 2, 3, 4]

        int[] nums3 = {}; // Empty array
        int newLength3 = removeDuplicates(nums3);
        System.out.println("New length (empty array): " + newLength3 + ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3)));  // Expected Output: 0, []


        int[] nums4 = null; // Null input
        int newLength4 = removeDuplicates(nums4);
        System.out.println("New length (null input): " + newLength4);  // Expected Output: 0

         int[] nums5 = {1, 2, 3, 4, 5}; // No duplicates
        int newLength5 = removeDuplicates(nums5);
        System.out.println("New length (no duplicates): " + newLength5+ ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, newLength5)));  // Expected Output: 5, [1, 2, 3, 4, 5]


    }
}
