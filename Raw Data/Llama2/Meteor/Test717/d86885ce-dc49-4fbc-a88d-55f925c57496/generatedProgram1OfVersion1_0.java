import java.util.Arrays;

public class LinearSearchEducational {

    public static void main(String[] args) {
        int[] array = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int searchElement = 110;

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Searching for element: " + searchElement);

        int index = Linear_Search(array, searchElement);

        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index: " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }


        // Example 2: Element not present
        searchElement = 15; // Element not in the array
        index = Linear_Search(array, searchElement);
        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index: " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }

    private static int Linear_Search(int[] array, int searchElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement) {
                return i; // Return the index where the element is found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}

