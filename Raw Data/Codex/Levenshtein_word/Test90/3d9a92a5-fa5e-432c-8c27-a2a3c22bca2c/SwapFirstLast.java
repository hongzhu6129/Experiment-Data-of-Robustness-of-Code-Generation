import java.util.Arrays;

public class SwapFirstLast {

    public static void main(String[] args) {
        // Example usage:
        int[] originalArray = {1, 2, 3, 4, 5};

        // Check if the array has at least one element
        if (originalArray.length < 1) {
            System.out.println("Array must have at least one element.");
            return; 
        }

        // Create a new array with the same elements as the original
        int[] newArray = Arrays.copyOf(originalArray, originalArray.length);

        // Swap the first and last elements in the new array
        int temp = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = temp;

        // Print both arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("New Array (with swapped elements): " + Arrays.toString(newArray));


        // Another Example (Handles arrays with only one element correctly):
        int[] oneElementArray = {7};
        
        if (oneElementArray.length < 1) {
            System.out.println("Array must have at least one element.");
            return;
        }

        int[] newArray2 = Arrays.copyOf(oneElementArray, oneElementArray.length);


        // (Swapping in a one-element array doesn't change anything, but the logic is still applied)
        temp = newArray2[0];
        newArray2[0] = newArray2[newArray2.length - 1];  // newArray2[0] = newArray2[0];
        newArray2[newArray2.length - 1] = temp;          // newArray2[0] = temp (original value)

         System.out.println("Original Array: " + Arrays.toString(oneElementArray));
        System.out.println("New Array (with swapped elements): " + Arrays.toString(newArray2));

    }
}
