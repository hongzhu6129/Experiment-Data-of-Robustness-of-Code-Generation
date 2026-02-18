import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Initialize with 1 as the first element is unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        return uniqueCount;

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int newLength1 = removeDuplicates(nums1);
        System.out.println("Updated length: " + newLength1); // Output: 2
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1))); // Output: [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength2 = removeDuplicates(nums2);
        System.out.println("Updated length: " + newLength2); // Output: 5
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2))); // Output: [0, 1, 2, 3, 4]

        // Test with an empty array
        int[] nums3 = {};
        int newLength3 = removeDuplicates(nums3);
        System.out.println("Updated length (empty array): " + newLength3); // Output: 0


    }
}
