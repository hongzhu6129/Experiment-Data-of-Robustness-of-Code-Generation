import java.util.Arrays;

public class RemoveElement {

    /**
     * Removes all occurrences of a specified value in a given array of integers.
     *
     * @param nums The array of integers.
     * @param val  The value to remove.
     * @return The updated length of the array after removing the specified value.
     */
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 0; // Index for keeping track of valid elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int len1 = removeElement(nums1, val1);
        System.out.println("Example 1: Updated array length: " + len1);
        System.out.println("Example 1: Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));


        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int len2 = removeElement(nums2, val2);
        System.out.println("Example 2: Updated array length: " + len2);
        System.out.println("Example 2: Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


        //Test case with empty array
        int[] nums3 = {};
        int val3 = 2;
        int len3 = removeElement(nums3, val3);
        System.out.println("Example 3: Updated array length: " + len3);
        System.out.println("Example 3: Updated array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)));


         //Test case with null array
        int[] nums4 = null;
        int val4 = 2;
        int len4 = removeElement(nums4, val4);
        System.out.println("Example 4: Updated array length: " + len4);

        // Test case where no element needs to be removed
        int[] nums5 = {1, 2, 3, 4, 5};
        int val5 = 6;
        int len5 = removeElement(nums5, val5);
        System.out.println("Example 5: Updated array length: " + len5);
        System.out.println("Example 5: Updated array: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, len5)));

    }
}
