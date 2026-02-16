import java.util.Arrays;

public class RemoveDuplicates {

    /**
     * Educational Java code to remove duplicates from a sorted array and return the new length.
     *
     * @param nums The sorted integer array.
     * @return The length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) { // Handle empty or null input
            return 0; 
        }

        int uniqueCount = 1; // Start with 1 because the first element is always unique

        // Iterate through the array, comparing each element with the previous unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueCount - 1]) {  // If the current element is different from the last unique element
                nums[uniqueCount] = nums[i];         // Copy the current element to the next unique position
                uniqueCount++;                      // Increment the count of unique elements
            }
        }


        // Print the updated array (optional - for educational purposes)
        System.out.println("Updated array (first " + uniqueCount + " elements): " + Arrays.toString(Arrays.copyOfRange(nums, 0, uniqueCount)));

        return uniqueCount;
    }



    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Example 1: New length = " + len1); // Expected output: 2

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Example 2: New length = " + len2); // Expected output: 5

        //Test with empty array
        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Example 3: New length = " + len3); // Expected output: 0

        // Test with null array (important to handle this case gracefully).
        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Example 4: New length = " + len4); // Expected output: 0



    }
}
