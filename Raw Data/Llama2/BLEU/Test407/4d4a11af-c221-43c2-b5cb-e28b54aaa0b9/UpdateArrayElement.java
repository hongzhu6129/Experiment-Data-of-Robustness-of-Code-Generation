public class UpdateArrayElement {

    public static void main(String[] args) {
        // 1. Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array:");
        printArray(numbers);

        // 2. Update an element at a specific index
        int indexToUpdate = 2; // Update the element at index 2 (which is currently 3)
        int newValue = 10;

        if (indexToUpdate >= 0 && indexToUpdate < numbers.length) {
            numbers[indexToUpdate] = newValue;
            System.out.println("\nArray after updating element at index " + indexToUpdate + ":");
            printArray(numbers);
        } else {
            System.out.println("\nInvalid index.  Index must be between 0 and " + (numbers.length - 1));
        }



        // Example of updating multiple elements using a loop:
         int[] moreNumbers = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("\nOriginal array (moreNumbers):");
        printArray(moreNumbers);

        // Update all even-indexed elements to 99
        for (int i = 0; i < moreNumbers.length; i += 2) {  // Increment by 2 for even indices
             moreNumbers[i] = 99; 
        }

        System.out.println("\nArray after updating even-indexed elements:");
        printArray(moreNumbers);


       //Example Demonstrating Edge Cases
        int[] edgeCaseArray = {5};

        System.out.println("\nEdge Case Array (original):");
        printArray(edgeCaseArray);


        //Updating the only element
        edgeCaseArray[0] = 15;
        System.out.println("\nEdge Case Array (updated):");
        printArray(edgeCaseArray);


        //Trying to access an out-of-bounds index (will cause an error if uncommented):
        //edgeCaseArray[1] = 20; // This would be an error because index 1 doesn't exist


        //Empty array
        int[] emptyArray = new int[0]; //Declaring but not initializing


        System.out.println("\nEmpty Array (no elements):");

         //The following line would throw an ArrayIndexOutOfBoundsException if not handled.
         // printArray(emptyArray); //Comment this out if you don't want to see an exception



        //Trying to update an empty array will cause an error.
        //emptyArray[0] = 5; // This would also throw an exception (ArrayIndexOutOfBoundsException).


    }

    // Helper function to print an array
    public static void printArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty."); //Handle the empty array case here.
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
