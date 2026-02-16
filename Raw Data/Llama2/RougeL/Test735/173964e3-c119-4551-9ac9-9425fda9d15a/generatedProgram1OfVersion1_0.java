import java.util.Arrays;

public class CountingSort {

    // k is the range of input (0 to k)
    void countingSort(int[] arr, int n, int k) {
        int[] count = new int[k + 1]; // Initialize count array with zeros
        int[] output = new int[n];   // Output array

        // Store the count of each element
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Update count[i] to store the sum of counts up to i
        for (int i = 1; i <= k; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--; 
        }

        // Copy the output array to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

    }

    public static void main(String[] args) {
        CountingSort cs = new CountingSort();
        int[] arr = {1, 4, 1, 2, 7, 5, 2};
        int k = 9; // Max element in array (adjust as needed)
        int n = arr.length;

        System.out.println("Original array: " + Arrays.toString(arr));

        cs.countingSort(arr, n, k);

        System.out.println("Sorted array: " + Arrays.toString(arr));



        // Demonstrating the error handling for non-integer input:

        String[] strArr = {"1", "4", "computer", "2", "7", "5", "2"};  // Example with invalid input


        try {
             int[] numArr = new int[strArr.length];

             for(int i=0; i<strArr.length; i++){
                numArr[i] = Integer.parseInt(strArr[i]); // This line throws exception if not a number
             }


             cs.countingSort(numArr, numArr.length, k); // Only call if parsing was successful

             System.out.println("Sorted numeric array (if successful parse): " + Arrays.toString(numArr));
            

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Cannot convert 'computer' (or other non-numeric string) to an integer.");
        }




    }
}



