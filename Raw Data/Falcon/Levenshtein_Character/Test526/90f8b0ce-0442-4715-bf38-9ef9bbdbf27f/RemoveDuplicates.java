import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Initialize with 1 as the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i]; // Overwrite duplicate with the next unique element
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int newLength1 = removeDuplicates(nums1);
        System.out.println("New length: " + newLength1 + ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1)));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength2 = removeDuplicates(nums2);
        System.out.println("New length: " + newLength2 + ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2)));


        // Test case with empty array
        int[] nums3 = {};
        int newLength3 = removeDuplicates(nums3);
        System.out.println("New length: " + newLength3 + ", Updated array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3)));

        // Test case with null array
        int[] nums4 = null;
        int newLength4 = removeDuplicates(nums4);
        System.out.println("New length: " + newLength4 + ", Updated array: " + (nums4 == null ? "null" : Arrays.toString(Arrays.copyOfRange(nums4,0, newLength4)))); // Handle null case
    }
}
