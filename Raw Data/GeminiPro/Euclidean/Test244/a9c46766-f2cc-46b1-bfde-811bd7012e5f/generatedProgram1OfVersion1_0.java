import java.util.Arrays;

public class RemoveDuplicates {

    /**
     * Given a sorted array of integers, removes duplicate elements in-place such that each unique element appears only once.
     * The relative order of the elements should be kept the same.  The method modifies the original array and returns the new length.
     * 
     * @param nums The sorted integer array.
     * @return The length of the updated array containing only unique elements.
     *
     * Example:
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2,_]  (Note that the original array is modified)
     *
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track the position of unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {  // If the current element is different from the last unique element
                uniqueIndex++;                   // Move to the next position for unique elements
                nums[uniqueIndex] = nums[i];     // Place the unique element in its correct position
            }
        }

        return uniqueIndex + 1; // Return the new length (number of unique elements)
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Length: " + len1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)) );


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Length: " + len2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("Length: " + len3 + ", Array: " + Arrays.toString(nums3)); // Output: 0, []


        int[] nums4 = null;  // Null array
        int len4 = removeDuplicates(nums4);
        System.out.println("Length: " + len4 ); // Output: 0 (handles null input gracefully)

         int[] nums5 = {1, 2, 3, 4, 5}; // Already unique
        int len5 = removeDuplicates(nums5);
        System.out.println("Length: " + len5 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)));
    }
}

