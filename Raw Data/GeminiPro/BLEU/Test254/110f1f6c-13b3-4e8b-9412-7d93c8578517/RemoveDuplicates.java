import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Start with 1 as the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {  // Compare with the previous element
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Updated array length: " + len1);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Updated array length: " + len2);
        System.out.println("Updated array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));


        // Empty array test case
        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Updated array length (empty array): " + len3);
        System.out.println("Updated array (empty array): " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)));



    }
}
