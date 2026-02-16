import java.util.Arrays;

public class UpdateArrayElement {

    public static void main(String[] args) {
        // Example usage:
        int[] originalArray = {1, 2, 3, 4, 5};
        int indexToUpdate = 2; // Update the element at index 2 (which is currently 3)
        int newValue = 10;

        // Update the array element directly if the index is valid
        if (indexToUpdate >= 0 && indexToUpdate < originalArray.length) {
            originalArray[indexToUpdate] = newValue;
            System.out.println("Updated Array: " + Arrays.toString(originalArray)); 
        } else {
            System.out.println("Invalid index. Array remains unchanged.");
            System.out.println("Original Array: " + Arrays.toString(originalArray));
        }


        // Example using a new array (if you don't want to modify the original)
        int[] newArray = updateElement(originalArray, indexToUpdate, newValue);

        if (newArray != null) {
             System.out.println("Updated Array (new array): " + Arrays.toString(newArray));
        }

       
    }


    // Helper function (optional � if you need a method to return a new array)
    // This method avoids modifying the original array
    public static int[] updateElement(int[] arr, int index, int value) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid Index");
            return null; // Or throw an exception if you prefer.
        }

        int[] newArray = Arrays.copyOf(arr, arr.length); // Create a copy
        newArray[index] = value;
        return newArray;
    }
}
