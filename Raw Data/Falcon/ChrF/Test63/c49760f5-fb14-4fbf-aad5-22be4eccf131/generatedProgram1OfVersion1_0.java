import java.util.Arrays;

class Solution {

    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 1; // Initialize k to 1 (first element is always unique)

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("The length of the original array is: " + originalArray.length);


        int newLength = removeDuplicates(originalArray);


        System.out.println("After removing duplicates, the new length of the array is: " + newLength);


        // Print the updated array (optional -  the problem only asked for length)
        System.out.print("Updated array: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(originalArray[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
