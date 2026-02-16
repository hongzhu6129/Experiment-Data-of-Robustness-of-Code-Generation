import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1; // Index for placing unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Compare with the previous element
                nums[uniqueIndex] = nums[i]; // Place the unique element
                uniqueIndex++; // Increment unique element index
            }
        }

        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int newLength1 = removeDuplicates(nums1);
        System.out.println("Updated length: " + newLength1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1))); // Expected: 2, [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength2 = removeDuplicates(nums2);
        System.out.println("Updated length: " + newLength2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2))); // Expected: 5, [0, 1, 2, 3, 4]

         int[] nums3 = {};
        int newLength3 = removeDuplicates(nums3);
        System.out.println("Updated length: " + newLength3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3))); // Expected 0, []

        int[] nums4 = null;
        int newLength4 = removeDuplicates(nums4);
        System.out.println("Updated length: " + newLength4+ ", Array: " + (nums4 == null ? "null" : Arrays.toString(Arrays.copyOfRange(nums4, 0, newLength4))) ); // Expected 0, []



    }
}
