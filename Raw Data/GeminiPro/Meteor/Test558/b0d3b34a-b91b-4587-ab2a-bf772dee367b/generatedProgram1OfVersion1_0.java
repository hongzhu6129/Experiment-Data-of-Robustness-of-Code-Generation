public class UpdateArrayElement {

    public static void main(String[] args) {
        // Example usage:
        int[] myArray = {1, 2, 3, 4, 5};
        int indexToUpdate = 2;  // Update the element at index 2 (value 3)

        // Update the element by itself (e.g., double it, square it, etc.)
        updateElement(myArray, indexToUpdate);


        // Print the updated array to verify the change:
        System.out.print("Updated array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }

    private static void updateElement(int[] arr, int index) {
         if (index >= 0 && index < arr.length) {
            arr[index] *= arr[index]; // Example: Square the element
            // Or any other update logic you need:
            // arr[index] *= 2; // Double the element
            // arr[index] += 5; // Add 5 to the element 
            // etc.
        } else {
            System.out.println("Invalid index. Array not updated.");
        }

    }
}

