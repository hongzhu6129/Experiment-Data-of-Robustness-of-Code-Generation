import java.util.Arrays;

public class LinearSearchTutorial {

    public static void main(String[] args) {
        // Example usage:
        int[] numbers = {5, 2, 9, 1, 5, 6};
        int target = 9;

        int index = Linear_Search(numbers, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }


        // Another example with an element that's not present
        target = 7; //  not in the array
        index = Linear_Search(numbers, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

       // Example demonstrating how to search in an empty array.
        int[] emptyArray = {};
        target = 5;
        index = Linear_Search(emptyArray, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array."); 
        }

        // Example demonstrating a search in an array with duplicate elements.
        int[] arrayWithDuplicates = {2, 4, 6, 4, 8};
        target = 4;
        index = Linear_Search(arrayWithDuplicates, target);
       if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array."); 
        }


    }

    private static int Linear_Search(int[] arr, int target) {
        // Iterate through each element of the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found after checking all elements
    }
}
