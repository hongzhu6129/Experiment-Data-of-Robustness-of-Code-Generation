import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Start with 1 because the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i]; // Overwrite duplicate with unique value
                uniqueCount++;
            }
        }

        return uniqueCount;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Length of unique elements: " + len1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1))); // Output: 2, [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Length of unique elements: " + len2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2))); // Output: 5, [0, 1, 2, 3, 4]

        int[] nums3 = {}; // Empty array
        int len3 = removeDuplicates(nums3);
        System.out.println("Length of unique elements: " + len3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3))); // Output: 0, []

         int[] nums4 = null; // Null array
        int len4 = removeDuplicates(nums4);
        System.out.println("Length of unique elements: " + len4 + ", Array: null"); // Output: 0, null
    }
}
