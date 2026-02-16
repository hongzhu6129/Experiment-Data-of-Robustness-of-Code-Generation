import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Initialize with 1 as the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];  // Overwrite duplicates with unique elements
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int length1 = removeDuplicates(nums1);
        System.out.println("Updated length: " + length1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, length1))); // Output: 2, [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length2 = removeDuplicates(nums2);
        System.out.println("Updated length: " + length2+ ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, length2)));// Output: 5, [0, 1, 2, 3, 4]

        // Test cases for empty and null arrays
        int[] nums3 = {};
        int length3 = removeDuplicates(nums3);
        System.out.println("Updated length: " + length3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, length3))); // Output: 0, []

        int[] nums4 = null;
        int length4 = removeDuplicates(nums4);
        System.out.println("Updated length: " + length4); // Output: 0
    }
}
