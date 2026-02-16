import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 1; // Index for placing unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        // You can optionally trim the array (though not strictly necessary 
        // as the problem asks for the length of the unique section).
        //nums = Arrays.copyOf(nums, uniqueIndex);

        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Updated Length: " + len1); // Output: 2
        System.out.println("Updated Array: " + Arrays.toString(Arrays.copyOf(nums1,len1)));  // Output: [1, 2]


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Updated Length: " + len2); // Output: 5
        System.out.println("Updated Array: " + Arrays.toString(Arrays.copyOf(nums2,len2))); // Output: [0, 1, 2, 3, 4]


        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Updated Length: " + len3); // Output: 0

         int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Updated Length: " + len4); // Output: 0
    }
}
