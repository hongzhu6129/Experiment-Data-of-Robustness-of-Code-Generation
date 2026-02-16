import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1; // Return the count of unique elements
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.println("k = " + k1 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, k1))); // Output: k = 2, nums = [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);
        System.out.println("k = " + k2 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, k2))); // Output: k = 5, nums = [0, 1, 2, 3, 4]


        int[] nums3 = {}; // Empty array
        int k3 = removeDuplicates(nums3);
        System.out.println("k = " + k3 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums3, 0, k3))); // Output: k = 0, nums = []

        int[] nums4 = {1}; // Single element array
        int k4 = removeDuplicates(nums4);
        System.out.println("k = " + k4 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums4, 0, k4))); // Output: k = 1, nums = [1]


    }
}
