import java.util.Arrays;

class Solution {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Start with 1 because the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i]; // Overwrite duplicates with unique elements
                uniqueCount++; 
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        System.out.println("Original array: " + Arrays.toString(nums1));
        System.out.println("The length of the original array is: " + nums1.length);

        int newLength = removeDuplicates(nums1);
        System.out.println("After removing duplicates, the new length of the array is: " + newLength);


    }
}
