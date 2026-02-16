public class UpdateArrayElement {

    public static void main(String[] args) {
        // Example usage:
        int[] myArray = {1, 2, 3, 4, 5};

        // Update the element at index 2 (which is currently 3) to 10
        int indexToUpdate = 2;
        int newValue = 10;

        if (indexToUpdate >= 0 && indexToUpdate < myArray.length) {
            myArray[indexToUpdate] = newValue;
        } else {
            System.out.println("Invalid index.  Array not updated.");
        }


        // Print the updated array
        System.out.print("Updated array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println(); // Add a newline for cleaner output



        // Another Example (showing how to handle invalid input)
        int[] anotherArray = {10, 20, 30};
        int badIndex = 5;  // Out of bounds
        int anotherNewValue = 50;

         if (badIndex >= 0 && badIndex < anotherArray.length) {
            anotherArray[badIndex] = anotherNewValue;
        } else {
            System.out.println("Invalid index. Array not updated.");
        }

        // Print the array (which remains unchanged because the index was invalid)
        System.out.print("Array after attempting update with bad index: ");
        for (int i = 0; i < anotherArray.length; i++) {
            System.out.print(anotherArray[i] + " ");
        }
        System.out.println();
    }
}
