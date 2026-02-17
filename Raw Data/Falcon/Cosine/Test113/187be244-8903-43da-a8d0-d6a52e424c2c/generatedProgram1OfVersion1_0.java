import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array of integers, removes duplicate elements in-place.
     * Returns the length of the modified array containing unique elements.
     *
     * @param nums The sorted input array.
     * @return The length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index for placing unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Length after removing duplicates: " + len1);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Print only the unique part


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Length after removing duplicates: " + len2);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2))); // Print only the unique part



        int[] nums3 = {}; // Empty array test case
        int len3 = removeDuplicates(nums3);
        System.out.println("Length after removing duplicates: " + len3);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Print only the unique part (empty)



        int [] nums4 = null; // Null array test case
        int len4 = removeDuplicates(nums4);
        System.out.println("Length after removing duplicates: " + len4); // Output 0 for null


        int[] nums5 = {1, 2, 3, 4, 5}; // Array with no duplicates
        int len5 = removeDuplicates(nums5);
        System.out.println("Length after removing duplicates: " + len5);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)));
    }
}
