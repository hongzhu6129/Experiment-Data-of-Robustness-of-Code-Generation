import java.util.Arrays;

public class UpdateArrayElement {

    public static void main(String[] args) {
        // Example 1: Updating a specific element by index
        int[] numbers = {1, 2, 3, 4, 5};
        int indexToUpdate = 2; // Update the element at index 2 (which is currently 3)
        int newValue = 10;

        if (indexToUpdate >= 0 && indexToUpdate < numbers.length) {
            numbers[indexToUpdate] = newValue;
            System.out.println("Array after updating element at index " + indexToUpdate + ": " + Arrays.toString(numbers)); // Output: [1, 2, 10, 4, 5]
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (numbers.length - 1));
        }



        // Example 2: Updating an element by value (first occurrence)
        int[] numbers2 = {1, 2, 3, 4, 3, 5};  // Notice there are two 3s
        int valueToUpdate = 3;
        int newValue2 = 15;
        boolean found = false;

        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] == valueToUpdate) {
                numbers2[i] = newValue2;
                found = true;
                break; // Stop after the first occurrence is updated (if you want to update all occurrences, remove this line)
            }
        }

        if (found) {
            System.out.println("Array after updating the first occurrence of " + valueToUpdate + ": " + Arrays.toString(numbers2)); //Output: [1, 2, 15, 4, 3, 5]
        } else {
            System.out.println("Value " + valueToUpdate + " not found in the array.");
        }




        // Example 3:  Updating all occurrences of a value
        int[] numbers3 = {1, 2, 3, 4, 3, 5};  // Notice there are two 3s
        int valueToUpdateAll = 3;
        int newValue3 = 20;


        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] == valueToUpdateAll) {
                numbers3[i] = newValue3; 
            }
        }

        System.out.println("Array after updating all occurrences of " + valueToUpdateAll + ": " + Arrays.toString(numbers3)); // Output: [1, 2, 20, 4, 20, 5]




    }
}
