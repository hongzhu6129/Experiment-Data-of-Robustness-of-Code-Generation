import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                nums[++uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;  // Return the length of the updated array
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int newLength1 = removeDuplicates(nums1);
        System.out.println("New Length: " + newLength1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1))); // Output: New Length: 2, Array: [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength2 = removeDuplicates(nums2);
        System.out.println("New Length: " + newLength2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2))); // Output: New Length: 5, Array: [0, 1, 2, 3, 4]


        // Test cases with empty and null arrays:
        int[] nums3 = {};
        int newLength3 = removeDuplicates(nums3);
        System.out.println("New Length: " + newLength3 + ", Array: " + Arrays.toString(nums3)); // Output: New Length: 0, Array: []

        int[] nums4 = null;
        int newLength4 = removeDuplicates(nums4);
        System.out.println("New Length: " + newLength4 ); // Output: New Length: 0
    }
}
