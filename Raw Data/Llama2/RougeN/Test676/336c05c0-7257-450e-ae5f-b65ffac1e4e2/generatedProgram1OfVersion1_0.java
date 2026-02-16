import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1; // Index of the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int newLength1 = removeDuplicates(nums1);
        System.out.println("New Length: " + newLength1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1))); // Output: 2, [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength2 = removeDuplicates(nums2);
        System.out.println("New Length: " + newLength2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2))); // Output: 5, [0, 1, 2, 3, 4]


        //Test case with empty array:
        int[] nums3 = {};
        int newLength3 = removeDuplicates(nums3);
        System.out.println("New Length: " + newLength3 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3))); // Output: 0, []
    }
}
