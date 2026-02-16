import java.util.Arrays;

public class ShellSort {

    public static void shell(int[] arr) {
        int n = arr.length;

        // Start with a large gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already in gapped order
            // keep adding one more element until the entire array is gap sorted
            for (int i = gap; i < n; i += 1) {
                // add a[i] to the elements that have been gap sorted
                // save a[i] in temp and make a hole at position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                // put temp (the original a[i]) in its correct location
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {12, 34, 54, 2, 3}; 

        System.out.println("Array before sorting: " + Arrays.toString(arr));

        shell(arr);

        System.out.println("Array after sorting:  " + Arrays.toString(arr));


        // Demonstrating how the "invalid literal for int() with base 10: 'sort'" error occurs
        // and how to avoid it (this was the original problem in the prompt).  Don't try
        // to convert non-numeric strings to ints!
        String[] strArr = {"1", "2", "sort", "4"}; // Example with a non-numeric string

        // Correct way to handle potential errors during conversion:
        int[] numArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            try {
                numArr[i] = Integer.parseInt(strArr[i]);
            } catch (NumberFormatException e) {
                System.err.println("Error: Cannot convert '" + strArr[i] + "' to an integer.");
                // Handle the error appropriately (e.g., skip the element, assign a default value, exit)
                numArr[i] = -1; // Example: assign -1 to indicate an error
            }
        }
        System.out.println("Converted integer array (with error handling): " + Arrays.toString(numArr));

    }
}
