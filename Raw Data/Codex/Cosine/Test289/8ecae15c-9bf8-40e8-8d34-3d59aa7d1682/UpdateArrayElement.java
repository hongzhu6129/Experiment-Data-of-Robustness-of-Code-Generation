import java.util.Arrays;

public class UpdateArrayElement {

    public static void main(String[] args) {
        // Example usage:
        int[] originalArray = {1, 2, 3, 4, 5};
        int indexToUpdate = 2;  // Update the element at index 2 (which is currently 3)
        int newValue = 10;

        // Update the array element
        if (indexToUpdate >= 0 && indexToUpdate < originalArray.length) {
            originalArray[indexToUpdate] = newValue;
            System.out.println("Updated array: " + Arrays.toString(originalArray)); 
        } else {
            System.out.println("Invalid index.  Index must be between 0 and " + (originalArray.length - 1));
        }


        // Another example with error handling for invalid input (e.g., from user input)
        String indexStr = "4"; // Simulate getting index as a string
        String valueStr = "25";

        try {
            int index = Integer.parseInt(indexStr);
            int value = Integer.parseInt(valueStr);

            if (index >= 0 && index < originalArray.length) {
                originalArray[index] = value;
                System.out.println("Updated array (after second update): " + Arrays.toString(originalArray));
            } else {
                System.out.println("Invalid index. Index must be within the array bounds.");
            }


        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers for the index and value.");
        }



    }
}
