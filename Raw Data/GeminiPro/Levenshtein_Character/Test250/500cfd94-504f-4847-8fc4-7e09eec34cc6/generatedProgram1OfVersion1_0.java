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

        int uniqueIndex = 0; // Index to track the position of unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) { 
                // If the current element is different from the last unique element,
                // move the current element to the next position after the unique elements.
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        // The unique elements now occupy the first uniqueIndex + 1 positions of the array.
        // The remaining elements beyond uniqueIndex are not relevant anymore.
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Example 1: Updated array length: " + len1);
        System.out.println("Example 1: Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Example 2: Updated array length: " + len2);
        System.out.println("Example 2: Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("Example 3 (Empty Array): Updated array length: " + len3);


        int[] nums4 = null; // Null array
        int len4 = removeDuplicates(nums4);
        System.out.println("Example 4 (Null Array): Updated array length: " + len4);


        int[] nums5 = {1, 2, 3, 4, 5}; // No duplicates
        int len5 = removeDuplicates(nums5);
        System.out.println("Example 5 (No Duplicates): Updated array length: " + len5);
        System.out.println("Example 5: Updated array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)));

    }
}
