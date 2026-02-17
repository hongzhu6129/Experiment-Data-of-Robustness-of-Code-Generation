import java.util.Arrays;

public class AddToArray {

    public static void main(String[] args) {
        // Example usage:
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToAdd = 6;

        // Add the element to the end of the array (creating a new array)
        int[] newArray = addElement(originalArray, elementToAdd);
        System.out.println("New array with added element: " + Arrays.toString(newArray));


        // Example with adding at a specific index (modifies the original array if there's space)
        int[] anotherArray = {1, 2, 3, 4, 0}; // Note the 0 at the end for demonstration
        int indexToAdd = 4;  // Add at index 4 (the last element)
        int elementToAdd2 = 5;

        addElementAtIndex(anotherArray, indexToAdd, elementToAdd2);
        System.out.println("Array modified in-place (if possible): " + Arrays.toString(anotherArray));


        // Demonstration of adding element at a specific index which is not within range - prints warning message
        int[] rangeTestArray = {1,2,3,4,5};
        addElementAtIndex(rangeTestArray, 5, 10);
        System.out.println("After attempting out-of-range modification: " + Arrays.toString(rangeTestArray));


    }

    public static int[] addElement(int[] originalArray, int elementToAdd) {
        int[] newArray = new int[originalArray.length + 1];
        System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);
        newArray[newArray.length - 1] = elementToAdd;
        return newArray;
    }


    public static void addElementAtIndex(int[] array, int index, int element) {
        if (index >= 0 && index < array.length) {
            array[index] = element;
        } else {
            System.out.println("Warning: Invalid index. Element not added.");
        }

    }
}


