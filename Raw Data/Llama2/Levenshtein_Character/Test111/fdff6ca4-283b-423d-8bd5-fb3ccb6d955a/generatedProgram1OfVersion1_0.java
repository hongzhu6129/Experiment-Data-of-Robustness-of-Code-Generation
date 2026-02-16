import java.util.Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Initialize with 1 as the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Compare with the previous element
                nums[uniqueCount] = nums[i]; // If different, add it to the unique section
                uniqueCount++;
            }
        }
        return uniqueCount;


    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = removeDuplicates(nums1);
        System.out.println("Updated Length: " + len1); // Output: 2
       // System.out.println(Arrays.toString(nums1));// Output: [1, 2, 2]  - Note the original array is modified in-place


        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len2 = removeDuplicates(nums2);
        System.out.println("Updated Length: " + len2); // Output: 5
        //System.out.println(Arrays.toString(nums2)); // Output: [0, 1, 2, 3, 4, 2, 2, 3, 3, 4] - Note the original array is modified in-place
    }
}
