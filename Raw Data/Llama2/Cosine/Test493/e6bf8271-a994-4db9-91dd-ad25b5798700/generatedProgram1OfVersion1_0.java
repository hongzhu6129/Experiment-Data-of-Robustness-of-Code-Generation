import java.util.Arrays;

public class EditArrayElement {

    public static void main(String[] args) {
        // Example usage:
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToReplace = 3; // The element you want to replace
        int replacementElement = 10; // The new element

        // Find the index of the element to replace
        int indexToReplace = -1;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == elementToReplace) {
                indexToReplace = i;
                break; // Stop searching once found
            }
        }

        // Edit the array if the element was found
        if (indexToReplace != -1) {
            originalArray[indexToReplace] = replacementElement;
            System.out.println("Modified array: " + Arrays.toString(originalArray));
        } else {
            System.out.println("Element " + elementToReplace + " not found in the array.");
        }


        // Example 2:  Handling multiple occurrences (replace all)
         int[] array2 = {1, 2, 3, 4, 3, 5};
         int elementToReplace2 = 3;
         int replacementElement2 = 10;

         for (int i = 0; i < array2.length; i++) {
             if (array2[i] == elementToReplace2) {
                 array2[i] = replacementElement2;
             }
         }
         System.out.println("Modified array 2 (all occurrences replaced): " + Arrays.toString(array2));


        // Example 3: Using a more functional approach (Java 8+ for replacing all occurrences)
        int[] array3 = {1, 2, 3, 4, 3, 5};
        int elementToReplace3 = 3;
        int replacementElement3 = 10;

        int[] modifiedArray3 = Arrays.stream(array3)
                .map(n -> n == elementToReplace3 ? replacementElement3 : n) // Replace if it matches
                .toArray();

        System.out.println("Modified array 3 (functional approach - all occurrences): " + Arrays.toString(modifiedArray3));


    }
}
