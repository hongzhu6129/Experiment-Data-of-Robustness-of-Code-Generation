import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Index for the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int k1 = removeDuplicates(nums1);
        System.out.println("k = " + k1 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums1, 0, k1))); // Output: k = 2, nums = [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = removeDuplicates(nums2);
        System.out.println("k = " + k2 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums2, 0, k2))); // Output: k = 5, nums = [0, 1, 2, 3, 4]
        
        int[] nums3 = {};
        int k3 = removeDuplicates(nums3);
        System.out.println("k = " + k3 + ", nums = " + Arrays.toString(Arrays.copyOfRange(nums3, 0, k3))); // Output: k = 0, nums = []

        int[] nums4 = null;
        int k4 = removeDuplicates(nums4);
        System.out.println("k = " + k4 + ", nums = null"); // Output: k = 0, nums = null


    }
}
