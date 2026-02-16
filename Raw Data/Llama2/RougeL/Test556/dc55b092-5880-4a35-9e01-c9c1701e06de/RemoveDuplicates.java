import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index to track unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i]; 
            }
        }

        // The length of the updated array (with duplicates removed) is uniqueIndex + 1
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Updated length: " + len1 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums1, 0, len1)));


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Updated length: " + len2 + ", Array: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, len2)));

        int[] nums3 = {};
        int len3 = removeDuplicates(nums3);
        System.out.println("Updated length: " + len3+ ", Array: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, len3)));


        int[] nums4 = null;
        int len4 = removeDuplicates(nums4);
        System.out.println("Updated length: " + len4 + (nums4 != null ?  ", Array: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, len4)) : "")); // Handle null case


    }
}
