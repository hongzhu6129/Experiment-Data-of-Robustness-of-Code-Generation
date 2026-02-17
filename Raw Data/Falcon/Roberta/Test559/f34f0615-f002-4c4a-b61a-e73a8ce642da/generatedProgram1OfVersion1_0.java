import java.util.Arrays;

public class RemoveDuplicates {

    /**
     * Removes duplicates from a sorted integer array and returns the new length.
     * Modifies the input array in-place such that the first 'newLength' elements
     * contain the unique elements in sorted order.
     *
     * @param nums The sorted integer array.
     * @return The length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int newLength = 1; // Initialize the new length to 1 (at least the first element is unique)

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[newLength - 1]) { // Compare with the last unique element
                nums[newLength] = nums[i]; // Add the unique element to the updated array
                newLength++;
            }
        }

        return newLength;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)) + ", Length: " + len1); // Expected: [1, 2], 2

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)) + ", Length: " + len2); // Expected: [0, 1, 2, 3, 4], 5

        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)) + ", Length: " + len3);  // Expected: [], 0

        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Length: " + len4); // Expected 0

        int[] nums5 = {1};
        int len5 = removeDuplicates(nums5);
        System.out.println("Array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)) + ", Length: " + len5); // Expected: [1], 1
    }
}
