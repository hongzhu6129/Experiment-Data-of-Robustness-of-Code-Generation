import java.util.Arrays;

public class RemoveDuplicates {

    /**
     * Given a sorted array of integers, removes duplicate elements in-place such that each element appears only once.
     * Returns the new length of the modified array.
     *
     * @param nums The sorted input array of integers.
     * @return The length of the array after removing duplicates.
     *
     * Example:
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5  (The modified array becomes [0,1,2,3,4])
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track the position for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++; // Move to the next position for a unique element
                nums[uniqueIndex] = nums[i]; // Place the unique element at the correct index
            }
        }

        // The length of the modified array (containing unique elements) is uniqueIndex + 1
        return uniqueIndex + 1; 
    }

    public static void main(String[] args) {
        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len1 = removeDuplicates(nums1);
        System.out.println("Example 1: New Length = " + len1);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));


        int[] nums2 = {1, 1, 2};
        int len2 = removeDuplicates(nums2);
        System.out.println("Example 2: New Length = " + len2);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("Example 3: New Length = " + len3); 
        System.out.println("Modified Array: " + Arrays.toString(nums3)); // Output: []


        int[] nums4 = {1};  // Single element array
        int len4 = removeDuplicates(nums4);
        System.out.println("Example 4: New Length = " + len4);
        System.out.println("Modified Array: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, len4)));

    }
}
