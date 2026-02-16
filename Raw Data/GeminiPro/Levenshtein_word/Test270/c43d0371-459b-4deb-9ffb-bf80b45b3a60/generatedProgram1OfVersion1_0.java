import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Initialize with 1 as the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i]; // Overwrite duplicate with next unique element
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int newLength1 = removeDuplicates(nums1);
        System.out.println("New length: " + newLength1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1))); // Output: 2, [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength2 = removeDuplicates(nums2);
        System.out.println("New length: " + newLength2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2))); // Output: 5, [0, 1, 2, 3, 4]


        int[] nums3 = {};  // Empty array test case
        int newLength3 = removeDuplicates(nums3);
        System.out.println("New length: " + newLength3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3))); // Output: 0, []

         int[] nums4 = {1, 2, 3, 4, 5}; // No duplicates test case
        int newLength4 = removeDuplicates(nums4);
        System.out.println("New length: " + newLength4 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, newLength4))); // Output: 5, [1, 2, 3, 4, 5]
    }
}
