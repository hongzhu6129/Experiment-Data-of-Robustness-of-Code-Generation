import java.util.Arrays;

public class UpdateArrayElement {

    public static void main(String[] args) {
        // Example usage:
        int[] originalArray = {1, 2, 3, 4, 5};
        int indexToUpdate = 2; // Update the element at index 2 (which is currently 3)
        int newValue = 10;     // Update it with the value 10

        if (indexToUpdate >= 0 && indexToUpdate < originalArray.length) {
            originalArray[indexToUpdate] = newValue;
            System.out.println("Updated array: " + Arrays.toString(originalArray));
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (originalArray.length - 1));
        }



        // Another Example:  Modifying the array based on finding a specific value.
        int[] anotherArray = {10, 20, 30, 40, 30};
        int valueToFind = 30;
        int replacementValue = 35;

        for (int i = 0; i < anotherArray.length; i++) {
            if (anotherArray[i] == valueToFind) {
                anotherArray[i] = replacementValue; // Update the first occurrence found
                break; // If you want to update *all* occurrences, remove this 'break'.
            }
        }

         System.out.println("Updated array (second example): " + Arrays.toString(anotherArray)); 

    }
}
