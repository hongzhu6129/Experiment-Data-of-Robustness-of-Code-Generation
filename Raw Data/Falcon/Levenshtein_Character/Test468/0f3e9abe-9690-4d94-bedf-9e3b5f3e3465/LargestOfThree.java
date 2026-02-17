import java.util.Arrays;

public class LargestOfThree {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {1, 5, 9, 2, 6, 10};
        findLargestOfThree(arr1); // Output: 10

        int[] arr2 = {12, 2, 8, 1, 7, 3};
        findLargestOfThree(arr2); // Output: 12

        int[] arr3 = {1, 2, 3, 4, 5, 6};
        findLargestOfThree(arr3); // Output: 6

        // Handles empty array
        int[] emptyArr = {};
        findLargestOfThree(emptyArr);


        // Handles null array
        int[] nullArr = null;
        findLargestOfThree(nullArr);

        // Handles odd length array 
        int[] oddArr = {1, 2, 3, 4, 5};
        findLargestOfThree(oddArr);



    }


    public static void findLargestOfThree(int[] arr) {
        if (arr == null || arr.length == 0 ) {
            System.out.println("Invalid Input: Array is null or empty");
            return;
        }

        if (arr.length % 2 != 0) {
            System.out.println("Invalid Input: Array length must be even");
            return;
        }

        int first = arr[0];
        int last = arr[arr.length - 1];
        int middle = arr[arr.length / 2];


        int largest = first;

        if (last > largest) {
            largest = last;
        }

        if (middle > largest) {
            largest = middle;
        }

        System.out.println(largest);
    }
}
