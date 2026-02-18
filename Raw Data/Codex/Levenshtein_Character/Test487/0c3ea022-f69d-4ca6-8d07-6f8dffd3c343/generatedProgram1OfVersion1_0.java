import java.util.Arrays;

public class BubbleSort {

    // Bubble Sort implementation
    void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();

        // Example usage demonstrating correct input:
        int[] arr = {64, 34, 25, 12, 22, 11, 90}; // Integer array input


        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(arr)); // Print original array

        bs.bubbleSort(arr); // Sort the array

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));  // Print the sorted array




        // Demonstrating how to handle potential input errors (outside the scope of bubbleSort itself)
        //  - This is likely where the original "invalid literal for int()" error was occurring

        String[] stringArray = {"10", "2", "5a", "20"}; // Example with potentially bad input

        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            try {
                intArray[i] = Integer.parseInt(stringArray[i]); // Attempt to convert
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: " + stringArray[i] + " is not an integer.");
                // Here, you can choose to exit, skip the invalid element, or use a default value.
                intArray[i] = 0; // Example: Using 0 as a default for invalid inputs.
            }
        }

       System.out.println("Converted and potentially corrected array (handling errors):");
       System.out.println(Arrays.toString(intArray));



    }
}
