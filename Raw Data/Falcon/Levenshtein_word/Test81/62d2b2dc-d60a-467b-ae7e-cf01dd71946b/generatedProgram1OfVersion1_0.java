public class CountingSort {

    void countingSort(int[] arr, int min, int max) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Count occurrences of each element
        for (int num : arr) {
            count[num - min]++; 
        }

        // Calculate cumulative counts
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in sorted order
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        CountingSort cs = new CountingSort();

        // Example usage:
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        int min = 1;  // Minimum value in the array
        int max = 8;  // Maximum value in the array

        cs.countingSort(arr, min, max);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        // Demonstrating the error handling for non-integer input (which was the original prompt's issue):
        try {
            String invalidInput = "computer"; 
            int num = Integer.parseInt(invalidInput); // This will throw NumberFormatException

            // The following code won't execute if the exception is thrown
            System.out.println("Parsed number: " + num); 

        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Cannot convert '" + e.getMessage().split(":")[1].trim()  + "' to an integer.");
        }



    }
}
