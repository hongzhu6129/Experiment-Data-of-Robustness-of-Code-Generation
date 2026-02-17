import java.util.Arrays;

public class UpdateArray {

    public static void main(String[] args) {
        // Example usage:
        int[] originalArray = {1, 2, 3, 4, 5};
        int indexToUpdate = 2;  // Update element at index 2 (which is currently 3)
        int newValue = 99;

        updateArray(originalArray, indexToUpdate, newValue); 

        System.out.println("Updated array: " + Arrays.toString(originalArray));


        // Handle potential errors (index out of bounds)
        int[] anotherArray = {10, 20, 30};
        int invalidIndex = 5;
        int anotherNewValue = 77;

        updateArray(anotherArray, invalidIndex, anotherNewValue); // This will print an error message

    }


    public static void updateArray(int[] arr, int index, int newValue) {
        if (index >= 0 && index < arr.length) {
            arr[index] = newValue;
        } else {
            System.out.println("Error: Index " + index + " is out of bounds for the array.");
        }
    }
}
