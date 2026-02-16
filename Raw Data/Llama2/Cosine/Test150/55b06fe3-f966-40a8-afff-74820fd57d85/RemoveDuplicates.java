import java.util.Arrays;

public class RemoveDuplicates {

    /**
     * Educational Java method to remove duplicates from a sorted array and return the new length.
     *
     * @param nums The sorted integer array.
     * @return The length of the array after removing duplicates.
     *
     * Example:
     * Input: nums = [1, 1, 2, 2, 3, 4, 4, 5]
     * Output: 5  (The updated array would be [1, 2, 3, 4, 5])
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // Handle empty or null arrays
        }

        int uniqueIndex = 0; // Index to track the position of unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) { 
                // If the current element is different from the last unique element,
                // move it to the next position after the unique elements.
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        // At this point, uniqueIndex + 1 represents the number of unique elements.
        // The elements from index 0 to uniqueIndex (inclusive) are the unique ones.
        // The remaining elements in the original array (from uniqueIndex+1 onwards)
        // are not relevant anymore.

        // Print the updated array (for educational purposes) �
        //  Not part of the core problem, but helpful to visualize
         int[] uniqueArray = Arrays.copyOfRange(nums, 0, uniqueIndex + 1);
        System.out.println("Updated Array: " + Arrays.toString(uniqueArray));


        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 2, 3, 4, 4, 5};
        int length1 = removeDuplicates(nums1);
        System.out.println("New length: " + length1); // Output: 5

        int[] nums2 = {1, 2, 3, 4, 5};
        int length2 = removeDuplicates(nums2);
        System.out.println("New length: " + length2);  // Output 5


        int[] nums3 = {}; // Empty array
        int length3 = removeDuplicates(nums3);
        System.out.println("New length: " + length3);  // Output 0

        int[] nums4 = null; // Null array
        int length4 = removeDuplicates(nums4);
        System.out.println("New length: " + length4); // Output: 0


        int[] nums5 = {1,1,1,1,1}; // all duplicates
        int length5 = removeDuplicates(nums5);
        System.out.println("New length: " + length5); // Output 1
    }
}
