import java.util.Arrays;

public class RemoveDuplicates {

    /**
     * Removes duplicates from a sorted integer array and returns the new length.
     *
     * @param nums The sorted integer array.
     * @return The length of the array after removing duplicates.
     *
     * Example:
     * Input: nums = [1, 1, 2, 3, 3, 4]
     * Output: 4  (The unique elements are [1, 2, 3, 4])
     *
     *  This method modifies the input array `nums` in-place such that the first `k` elements 
     *  contain the unique elements, where `k` is the returned value. It does not allocate
     *  extra space for another array.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1; // Index of the next unique element

        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous unique element
            if (nums[i] != nums[uniqueIndex - 1]) {
                nums[uniqueIndex] = nums[i]; // Add it to the unique section of the array
                uniqueIndex++;             // Increment the index for the next unique element
            }
        }

        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 3, 4};
        int len1 = removeDuplicates(nums1);
        System.out.println("Example 1:");
        System.out.println("Original Array: " + Arrays.toString(nums1));
        System.out.println("New Length: " + len1);
        System.out.println("Unique Elements: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));

        int[] nums2 = {1, 2, 3, 4, 5};
        int len2 = removeDuplicates(nums2);
        System.out.println("\nExample 2:");
        System.out.println("Original Array: " + Arrays.toString(nums2));
        System.out.println("New Length: " + len2);
        System.out.println("Unique Elements: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("\nExample 3 (Empty array):");
        System.out.println("Original Array: " + Arrays.toString(nums3));
        System.out.println("New Length: " + len3);


        int[] nums4 = null; //testing with null
        int len4 = removeDuplicates(nums4);
        System.out.println("\nExample 4 (null array):");
        System.out.println("New Length: " + len4);


    }
}
