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
        int[] originalArray = {1, 4, 6, 7, 6, 2};
        int valToRemove = 6;

        int newLength = removeElement(originalArray, valToRemove);


        System.out.println("Original array: " + Arrays.toString(originalArray)); 
        System.out.println("The length of the new array is: " + newLength);

        // Print the updated array (optional, but good for visualization)
        int[] newArray = Arrays.copyOfRange(originalArray, 0, newLength);
        System.out.println("New array (first " + newLength + " elements): " + Arrays.toString(newArray));

    }
}
