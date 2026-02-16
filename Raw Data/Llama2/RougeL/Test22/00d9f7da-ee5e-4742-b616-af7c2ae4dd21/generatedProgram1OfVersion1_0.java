import java.util.Arrays;

public class SortIntArray {

    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        // The original error "invalid literal for int() with base 10: 'computer'" 
        // occurs when you try to convert a non-numeric string (like "computer") 
        // into an integer using Integer.parseInt() or similar.

        // This example demonstrates how to handle such a situation gracefully.

        String[] stringArray = {"123", "456", "computer", "789", "0"}; 
        int[] intArray = new int[stringArray.length];  // Initialize an array to hold integers
        int validIntegers = 0; // Keep track of valid integers

        for (int i = 0; i < stringArray.length; i++) {
            try {
                intArray[validIntegers] = Integer.parseInt(stringArray[i]);
                validIntegers++;
            } catch (NumberFormatException e) {
                System.err.println("Invalid integer format: " + stringArray[i]);
                // We handle the exception and simply continue to the next element.
            }
        }

        // Create a new array with the correct size to store only valid integers
        int[] sortedIntArray = new int[validIntegers];
        System.arraycopy(intArray, 0, sortedIntArray, 0, validIntegers);

        // Now we sort and print only the valid integers.
        sort(sortedIntArray);

        System.out.print("Sorted Integer Array: ");
        for (int num : sortedIntArray) {
            System.out.print(num + " ");
        }
        System.out.println();


        // Example using only int arrays (for demonstration of the sort method)
        int[] numbers = {5, 2, 8, 1, 9, 4};
        sort(numbers);

        System.out.print("Sorted numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
