public class SwapFirstLast {

    public static void main(String[] args) {
        // Example usage:
        int[] originalArray = {1, 2, 3, 4, 5};

        // Check if the array has at least one element
        if (originalArray.length < 1) {
            System.out.println("Array must have at least one element.");
            return; 
        }

        // Create a new array with the same size as the original
        int[] newArray = new int[originalArray.length];


        // Copy elements to the new array, swapping the first and last
        for (int i = 0; i < originalArray.length; i++) {
            if (i == 0) {
                newArray[i] = originalArray[originalArray.length - 1];
            } else if (i == originalArray.length - 1) {
                newArray[i] = originalArray[0];
            } else {
                newArray[i] = originalArray[i];
            }
        }

        // Print the original and new arrays
        System.out.print("Original Array: ");
        printArray(originalArray);
        System.out.print("New Array: ");
        printArray(newArray);
    }



    // Helper function to print an array (for demonstration purposes)
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
