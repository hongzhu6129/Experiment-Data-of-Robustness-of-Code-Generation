import java.util.Arrays;

public class BubbleSort {

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

        // Example usage demonstrating correct input format to avoid the "invalid literal for int()" error
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90}; // Correct integer array
        bs.bubbleSort(arr1);
        System.out.println("Sorted array: " + Arrays.toString(arr1));


        // Demonstrating how the original error might have occurred and how to fix it.
        String[] strArr = {"12", "34", "5", "sort,", "78"};  // Incorrect - contains non-numeric string

        // Correct way to handle potential non-numeric input
        int[] arr2 = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            try {
                arr2[i] = Integer.parseInt(strArr[i]); // Attempt to convert to int
            } catch (NumberFormatException e) {
                System.err.println("Error: Invalid input - " + strArr[i] + " is not a valid integer.");
                // Handle the error appropriately. E.g., assign a default value, skip the element, or exit.
                arr2[i] = -1; // Example: assigning -1 for invalid inputs.
            }
        }
        bs.bubbleSort(arr2); // Now you can sort the correctly parsed integer array.
        System.out.println("Sorted array (with error handling): " + Arrays.toString(arr2));




    }
}
