import java.util.Arrays;

public class RetrieveElementFromArray {

    public static void main(String[] args) {
        // Example usage:
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        int indexToRetrieve = 2; // Retrieve element at index 2 (Charlie)

        // Check if the index is valid.
        if (indexToRetrieve >= 0 && indexToRetrieve < names.length) {
            String retrievedElement = names[indexToRetrieve];
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (names.length - 1));
        }

        //Another example with error handling using try-catch:
        indexToRetrieve = 5; // Trying to access an invalid index

        try {
            String retrievedElement = names[indexToRetrieve];
            System.out.println("Element at index " + indexToRetrieve + ": " + retrievedElement);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. " + e.getMessage());
        }


        // You can also use Arrays.copyOfRange() to get a sub-array,
        // although this is less efficient for retrieving a single element.
         indexToRetrieve = 1;
         if (indexToRetrieve >= 0 && indexToRetrieve < names.length) {
             String[] subArray = Arrays.copyOfRange(names, indexToRetrieve, indexToRetrieve + 1);
             System.out.println("Element at index " + indexToRetrieve + " using copyOfRange: " + subArray[0]);
         } else{
              System.out.println("Invalid index. Index should be between 0 and " + (names.length - 1));
         }



    }
}
