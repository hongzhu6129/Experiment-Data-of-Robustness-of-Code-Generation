public class UpdateArrayElement {

    public static void main(String[] args) {
        // Example usage:
        int[] myArray = {1, 2, 3, 4, 5};
        int indexToUpdate = 2;  // Update the element at index 2 (which is currently 3)
        int newValue = 10;

        // Check for valid index before updating
        if (indexToUpdate >= 0 && indexToUpdate < myArray.length) {
            myArray[indexToUpdate] = newValue;

            // Print the updated array
            System.out.print("Updated array: ");
            for (int element : myArray) {
                System.out.print(element + " ");
            }
            System.out.println(); // Add a newline for cleaner output

        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (myArray.length - 1));
        }


        // Another example (to demonstrate updating multiple elements in a loop)
        int[] anotherArray = {10, 20, 30, 40, 50};


        for(int i = 0; i < anotherArray.length; i++){ //Iterate through entire array
            if(anotherArray[i] % 20 == 0){ // condition: only want to update elements divisible by 20
                anotherArray[i] = anotherArray[i]*2;
            }
        }

        // Print the updated anotherArray
        System.out.print("Updated anotherArray: ");
        for (int element : anotherArray) {
            System.out.print(element + " ");
        }
        System.out.println();




    }
}
