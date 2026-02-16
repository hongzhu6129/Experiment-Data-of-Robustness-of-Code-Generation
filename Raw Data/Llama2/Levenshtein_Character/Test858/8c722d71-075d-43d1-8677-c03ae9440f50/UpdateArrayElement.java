import java.util.Arrays;

public class UpdateArrayElement {

    public static void main(String[] args) {
        // Example usage:
        int[] myArray = {1, 2, 3, 4, 5};
        int indexToUpdate = 2; // Update the element at index 2 (which is currently 3)
        int newValue = 10;

        // Update the array element if the index is valid
        if (indexToUpdate >= 0 && indexToUpdate < myArray.length) {
            myArray[indexToUpdate] = newValue;
            System.out.println("Updated array: " + Arrays.toString(myArray)); // Output: [1, 2, 10, 4, 5]
        } else {
            System.out.println("Invalid index. Array remains unchanged.");
            System.out.println("Original array: " + Arrays.toString(myArray));
        }



        // Another example demonstrating no change if the index is invalid:
        int[] anotherArray = {10, 20, 30};
        int invalidIndex = 5;  // Out of bounds
        int anotherNewValue = 50;

        if (invalidIndex >= 0 && invalidIndex < anotherArray.length) {
            anotherArray[invalidIndex] = anotherNewValue;
             System.out.println("Updated array: " + Arrays.toString(anotherArray));
        } else {
            System.out.println("Invalid index. Array remains unchanged.");
            System.out.println("Original array: " + Arrays.toString(anotherArray)); // Output: Original Array: [10, 20, 30]

        }
    }
}
