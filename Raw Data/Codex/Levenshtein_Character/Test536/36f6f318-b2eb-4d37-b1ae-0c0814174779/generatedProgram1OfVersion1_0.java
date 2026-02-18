import java.util.Arrays;

public class RemoveDuplicates {

    /**
     * Removes duplicates from a sorted array and returns the length of the unique elements.
     *
     * @param nums The sorted input array.
     * @return The length of the array after removing duplicates.
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track the position for unique elements

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
        System.out.println("Length after removing duplicates: " + len1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Length after removing duplicates: " + len2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("Length after removing duplicates (empty array): " + len3); // Output: 0

        int[] nums4 = null; // Null array
        int len4 = removeDuplicates(nums4);
        System.out.println("Length after removing duplicates (null array): " + len4); // Output: 0


        int[] nums5 = {1, 2, 3, 4, 5}; // No duplicates
        int len5 = removeDuplicates(nums5);
        System.out.println("Length after removing duplicates (no duplicates): " + len5 +  ", Array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)));


    }
}
