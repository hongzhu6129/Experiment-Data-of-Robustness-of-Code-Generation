public class ArrayBeforeLast10 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 10, 3, 4, 5, 10, 6, 7};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 10, 2, 10, 3, 10};
        int[] arr4 = {10, 2, 3, 4, 10, 5, 6, 10};

        printSubArray(arr1); // Output: 1 2 10 3 4 5 
        printSubArray(arr2); // Output: 1 2 3 4 5
        printSubArray(arr3); // Output: 1 10 2 10 3
        printSubArray(arr4); // Output: 10 2 3 4 10 5 6
    }

    public static void printSubArray(int[] arr) {
        int lastIndexOf10 = -1;

        // Find the index of the last occurrence of 10
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10) {
                lastIndexOf10 = i;
            }
        }

        // If 10 is not found, print the entire array
        if (lastIndexOf10 == -1) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
        } else {
            // Print elements before the last 10
            for (int i = 0; i <= lastIndexOf10; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(); // New line for cleaner output
    }
}
