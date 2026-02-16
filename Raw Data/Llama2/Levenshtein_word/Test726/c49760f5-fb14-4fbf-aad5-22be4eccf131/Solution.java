import java.util.Arrays;

class Solution {

    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
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
        int[] nums = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        System.out.println("Original array: " + Arrays.toString(nums));
        System.out.println("The length of the original array is: " + nums.length);

        int newLength = removeDuplicates(nums);
        System.out.println("After removing duplicates, the new length of the array is: " + newLength);

         // Print the updated array (optional, to verify the in-place modification)
        System.out.print("Updated array: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");


    }
}
