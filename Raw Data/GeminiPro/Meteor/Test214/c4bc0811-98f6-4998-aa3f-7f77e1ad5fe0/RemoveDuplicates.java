import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int newLength1 = removeDuplicates(nums1);
        System.out.println("New Length: " + newLength1 + ", Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, newLength1))); // Output: New Length: 2, Updated Array: [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength2 = removeDuplicates(nums2);
        System.out.println("New Length: " + newLength2 + ", Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2))); // Output: New Length: 5, Updated Array: [0, 1, 2, 3, 4]

        int[] nums3 = {};
        int newLength3 = removeDuplicates(nums3);
        System.out.println("New Length: " + newLength3 + ", Updated Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3))); // Output: New Length: 0, Updated Array: []

        int[] nums4 = null;
        int newLength4 = removeDuplicates(nums4);
        System.out.println("New Length: " + newLength4 + ", Updated Array: null"); // Output: New Length: 0, Updated Array: null



    }
}
