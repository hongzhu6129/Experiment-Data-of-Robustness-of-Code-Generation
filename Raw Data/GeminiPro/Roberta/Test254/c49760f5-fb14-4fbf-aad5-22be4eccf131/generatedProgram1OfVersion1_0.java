import java.util.Arrays;

class Solution {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Initialize k to 1 (first element is always unique)

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i]; 
            }
        }

        return k;
    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("The length of the original array is: " + nums.length);
        int newLength = removeDuplicates(nums);
        System.out.println("After removing duplicates, the new length of the array is: " + newLength);


         nums = new int[]{1, 2, 2, 3, 4, 4, 4, 5, 5};  // Testing with a different array
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("The length of the original array is: " + nums.length);
        newLength = removeDuplicates(nums);
        System.out.println("After removing duplicates, the new length of the array is: " + newLength);

    }
}
