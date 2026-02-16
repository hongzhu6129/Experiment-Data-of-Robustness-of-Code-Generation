import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; // Overwrite duplicate with next unique element
            }
        }

        return uniqueIndex + 1; // Return the length of the unique portion
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Updated length: " + len1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Updated length: " + len2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("Updated length: " + len3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Output: []

        int[] nums4 = null; // Null array
        int len4 = removeDuplicates(nums4);
        System.out.println("Updated length: " + len4); // Output: 0 (Handles null input gracefully)


    }
}
