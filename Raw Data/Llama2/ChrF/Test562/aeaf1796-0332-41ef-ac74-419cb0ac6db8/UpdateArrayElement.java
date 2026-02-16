public class UpdateArrayElement {

    public static void main(String[] args) {
        // Example usage:
        int[] myArray = {1, 2, 3, 4, 5};
        int indexToUpdate = 2; // Update the element at index 2 (which is currently 3)
        int newValue = 99;

        if (indexToUpdate >= 0 && indexToUpdate < myArray.length) {
            myArray[indexToUpdate] = newValue;

            System.out.print("Updated array: ");
            for (int element : myArray) {
                System.out.print(element + " ");
            }
            System.out.println();

        } else {
            System.out.println("Invalid index. Index must be between 0 and " + (myArray.length - 1));
        }


        // Another Example: You can get the index and new value from command-line arguments
        // Be careful with exception handling (try-catch) if using command-line input


         if (args.length == 2) { // Check if two arguments are provided
            try {
                int index = Integer.parseInt(args[0]);
                int value = Integer.parseInt(args[1]);

                if (index >= 0 && index < myArray.length) {
                   myArray[index] = value;
                    System.out.print("Updated array (using command-line arguments): ");
                    for (int element : myArray) {
                        System.out.print(element + " ");
                   }
                    System.out.println();
                } else {
                    System.out.println("Invalid index. Index must be between 0 and " + (myArray.length - 1));
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide integer values for index and value.");
            }

        } else {
            System.out.println("To update using command-line arguments, provide index and value.");
        }
    }
}
