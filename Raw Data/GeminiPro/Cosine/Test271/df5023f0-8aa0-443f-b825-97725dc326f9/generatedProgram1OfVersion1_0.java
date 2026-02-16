import java.util.Arrays;

public class RemoveDuplicatesTwice {

    static int remove_Duplicates_twice(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int index = 0; // Index for the updated array (with at most two occurrences)

        for (int num : nums) {
            // If the current element is the first occurrence or the second occurrence, add it to the updated array
            if (index < 2 || num != nums[index - 2]) {
                nums[index++] = num;
            }
        }

        return index; 
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int newLength1 = remove_Duplicates_twice(nums1);
        System.out.println("Updated array length: " + newLength1);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1)));

        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int newLength2 = remove_Duplicates_twice(nums2);
        System.out.println("Updated array length: " + newLength2);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2)));


        int[] nums3 = {};
        int newLength3 = remove_Duplicates_twice(nums3);
        System.out.println("Updated array length: " + newLength3);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3)));

        int[] nums4 = null;
        int newLength4 = remove_Duplicates_twice(nums4);
        System.out.println("Updated array length: " + newLength4); // Output: 0
    }
}
