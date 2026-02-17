import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Variable to track the length of the new array

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move elements not equal to val to the front
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 7, 6, 2};
        int val = 6;

        System.out.println("Original array: " + Arrays.toString(nums));

        int newLength = removeElement(nums, val);

        System.out.println("The length of the new array as: " + newLength);


        // Print the updated array (optional - only elements up to newLength are valid)
         int[] newArray = Arrays.copyOfRange(nums, 0, newLength);
        System.out.println("New array: " + Arrays.toString(newArray));

    }
}
