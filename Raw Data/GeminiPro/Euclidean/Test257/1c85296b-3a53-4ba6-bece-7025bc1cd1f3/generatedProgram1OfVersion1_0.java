import java.util.Arrays;

public class RemoveDuplicates {

    /**
     * Educational function to remove duplicates from a sorted array and return the updated length.
     *
     * @param nums The sorted integer array.
     * @return The length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // Handle empty or null input
        }

        int uniqueIndex = 0; // Index to track unique elements

        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous unique element
            if (nums[i] != nums[uniqueIndex]) { 
                uniqueIndex++; // Move to the next unique position
                nums[uniqueIndex] = nums[i]; // Place the unique element at the correct position
            }

            //Print statements for educational purposes, demonstrating the process step-by-step
            System.out.println("Iteration " + i + ":");
            System.out.println("Current element: " + nums[i]);
            System.out.println("Unique Index: " + uniqueIndex);
            System.out.println("Array state: " + Arrays.toString(nums)); // Show how the array changes
            System.out.println("------------------");
        }



        return uniqueIndex + 1; // Return the new length (number of unique elements)
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 2, 3, 4, 4, 5, 5, 5};
        int len1 = removeDuplicates(nums1);
        System.out.println("Example 1: Updated array length: " + len1);
        System.out.println("Updated Array: "+ Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));


        int[] nums2 = {1, 2, 3, 4, 5};
        int len2 = removeDuplicates(nums2);
        System.out.println("\nExample 2: Updated array length: " + len2);
        System.out.println("Updated Array: "+Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));

        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("\nExample 3: Updated array length: " + len3);


        int[] nums4 = null; // Null array
        int len4 = removeDuplicates(nums4);
        System.out.println("\nExample 4: Updated array length: " + len4);


    }
}
