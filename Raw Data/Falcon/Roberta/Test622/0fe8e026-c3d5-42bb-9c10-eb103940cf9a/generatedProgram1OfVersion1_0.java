public class SwapFirstLast {

    public static void main(String[] args) {
        // Example usage:
        int[] originalArray = {1, 2, 3, 4, 5}; 

        // Check if the array is valid (length at least 1)
        if (originalArray.length < 1) {
            System.out.println("Array length must be at least 1.");
            return; // Exit if the array is invalid
        }

        // Create a new array with the same elements as the original
        int[] newArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // Swap the first and last elements in the new array
        int temp = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = temp;


        // Print both arrays to demonstrate the swap
        System.out.print("Original Array: ");
        printArray(originalArray);

        System.out.print("New Array (with swapped elements): ");
        printArray(newArray);

    }

    // Helper function to print an array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
