import java.util.Arrays;

class Solution {
    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
     *
     * @param nums Sorted array of integers
     * @return The length of the updated array without duplicates
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0; // Index for placing unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1; 
    }


    public static void main(String[] args) {
        int[] originalArray = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("The length of the original array is: " + originalArray.length);


        int newLength = removeDuplicates(originalArray);

        System.out.print("After removing duplicates, the array is: [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(originalArray[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("After removing duplicates, the new length of the array is: " + newLength);



    }
}
