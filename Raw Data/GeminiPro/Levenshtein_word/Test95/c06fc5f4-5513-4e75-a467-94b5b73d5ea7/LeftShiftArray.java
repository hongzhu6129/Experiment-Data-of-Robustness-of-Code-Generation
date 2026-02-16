public class LeftShiftArray {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int n = originalArray.length;

        // Left shift by 1 position 
        int[] shiftedArray = new int[n];

        // Method 1: Using a loop (more efficient)
        for (int i = 0; i < n - 1; i++) {
            shiftedArray[i] = originalArray[i + 1];
        }
        shiftedArray[n - 1] = originalArray[0]; // Wrap around the last element


        System.out.print("Original Array: ");
        printArray(originalArray);

        System.out.print("Left Shifted Array: ");
        printArray(shiftedArray);



        // Example with a different shift amount (e.g., shift by 2)
        int shiftAmount = 2;
        int[] shiftedArray2 = new int[n];

        for (int i = 0; i < n; i++) {
            shiftedArray2[i] = originalArray[(i + shiftAmount) % n]; // Use modulo for wrap-around
        }


        System.out.print("Left Shifted Array (shift 2): ");
        printArray(shiftedArray2);

    }


    // Helper function to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}



