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
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                // put temp (the original a[i]) in its correct location
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {12, 34, 54, 2, 3};
        System.out.println("Array before sorting:");
        printArray(arr);

        shell(arr);

        System.out.println("Array after sorting:");
        printArray(arr);



        // Demonstrating the "sort" error handling.  The "sort" error happens
        // when you try to convert a non-numeric string (like "sort") to an integer.
        // This example avoids that error by ensuring inputs are integers.
        String[] strArr = {"10", "5", "20", "2"}; // String representation of numbers
        int[] intArr = new int[strArr.length];

        try {
            for (int i = 0; i < strArr.length; i++) {
                intArr[i] = Integer.parseInt(strArr[i]); // Correctly parse string to integer
            }
            shell(intArr);
            printArray(intArr);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter numbers only.");
        }
    }


    // Helper function to print an array
     public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

