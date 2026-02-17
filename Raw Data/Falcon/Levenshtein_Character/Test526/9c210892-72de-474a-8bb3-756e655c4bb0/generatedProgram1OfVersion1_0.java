import java.util.Arrays;

public class RemoveDuplicates {

    /**
     * Educational Java code to remove duplicates from a sorted array and return the new length.
     *
     * @param nums The sorted input array.
     * @return The length of the array after removing duplicates (i.e., the number of unique elements).
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // Handle empty or null input
        }

        int uniqueIndex = 0; // Index to track the position of unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) { // If the current element is different from the last unique element
                uniqueIndex++; // Move to the next position for a unique element
                nums[uniqueIndex] = nums[i]; // Place the unique element at its correct position
            }
            // If the current element is a duplicate, we simply skip it and move to the next element.
        }

        // The subarray from index 0 to uniqueIndex (inclusive) now contains the unique elements.

        // Print the updated array (for educational purposes - not required for the problem itself)
        System.out.println("Updated array (first " + (uniqueIndex + 1) + " elements): " + Arrays.toString(Arrays.copyOfRange(nums, 0, uniqueIndex + 1)));

        return uniqueIndex + 1; // The length of the updated array is uniqueIndex + 1
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Length of updated array: " + len1); // Expected output: 2

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Length of updated array: " + len2); // Expected output: 5

        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("Length of updated array: " + len3); // Expected output: 0

        int[] nums4 = null;  // Null array test case
        int len4 = removeDuplicates(nums4);
        System.out.println("Length of updated array: " + len4); // Expected output: 0


        int[] nums5 = {1, 2, 3, 4, 5}; // Already unique elements
        int len5 = removeDuplicates(nums5);
        System.out.println("Length of updated array: " + len5); // Expected output: 5


    }
}
