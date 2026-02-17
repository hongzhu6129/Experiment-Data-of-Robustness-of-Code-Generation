import java.util.Arrays;

class Solution {
    /**
     * Removes duplicates from a sorted integer array in-place.
     *
     * @param nums The sorted integer array.
     * @return The new length of the array after removing duplicates.
     *         The first `return` elements of `nums` will contain the unique elements.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track the position for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; // Place the unique element at the next available position
            }
        }

        return uniqueIndex + 1; // Return the new length (number of unique elements)
    }


    public static void main(String[] args) {
        // Example usage and educational explanations:
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Example 1: Original array: " + Arrays.toString(nums1));
        System.out.println("New Length: " + len1 + ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));
        System.out.println("Explanation: The duplicate '1' is removed. The unique elements are [1, 2].");


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("\nExample 2: Original array: " + Arrays.toString(nums2));
        System.out.println("New Length: " + len2 + ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));
        System.out.println("Explanation: The duplicates are removed, leaving [0, 1, 2, 3, 4].");


        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("\nExample 3: Original array: " + Arrays.toString(nums3));
        System.out.println("New Length: " + len3 + ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)));
        System.out.println("Explanation:  The array is empty, so the length is 0.");

        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("\nExample 4: Original array: null");
        System.out.println("New Length: " + len4 + ", Updated array: null");
        System.out.println("Explanation: The array is null, so the length is 0.");



        int[] nums5 = {1, 2, 3, 4, 5}; // No duplicates
        int len5 = removeDuplicates(nums5);
        System.out.println("\nExample 5: Original array: " + Arrays.toString(nums5));
        System.out.println("New Length: " + len5 + ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)));
        System.out.println("Explanation: There are no duplicates, so the array remains the same.");


    }
}
