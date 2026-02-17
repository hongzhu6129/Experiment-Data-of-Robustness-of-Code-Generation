import java.util.Arrays;

public class LargestOfThree {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {10, 20, 30, 40, 50, 60};
        findLargestOfThree(arr1);  // Output: 60

        int[] arr2 = {5, 12, 8, 25, 1, 9};
        findLargestOfThree(arr2); // Output: 25

        int[] arr3 = {100, 2, 50, 4, 6, 80};
        findLargestOfThree(arr3); // Output: 100

         int[] arr4 = {1, 2}; //even length >=2
        findLargestOfThree(arr4); // Output: 2
        
        //Edge case (even length but only 2 elements - first, middle, and last are all effectively the same)
       //  int[] arr5 = {7, 11};
        // findLargestOfThree(arr5); // Output: 11

    }

    public static void findLargestOfThree(int[] arr) {
        if (arr == null || arr.length < 2 || arr.length % 2 != 0) {
            System.out.println("Invalid input: Array must be non-null, have an even length of at least 2.");
            return;
        }

        int first = arr[0];
        int middle = arr[arr.length / 2 -1 ]; // Adjust index for 0-based arrays
        int last = arr[arr.length - 1];

        int largest = Math.max(first, Math.max(middle, last));

        System.out.println(largest);

    }
}
