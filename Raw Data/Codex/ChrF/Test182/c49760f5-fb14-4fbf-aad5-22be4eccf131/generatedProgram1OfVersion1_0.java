import java.util.Arrays;

public class RemoveDuplicates {

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
        int[] originalArray = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("The length of the original array is: " + originalArray.length);

        int newLength = removeDuplicates(originalArray);

        System.out.println("After removing duplicates, the new length of the array is: " + newLength);


    }
}
