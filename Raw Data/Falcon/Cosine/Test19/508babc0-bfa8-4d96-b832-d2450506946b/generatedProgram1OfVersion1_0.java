public class ArrayElementOccurrence {

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 2, 9, 2, 1, 7};
        int elementToFind = 2;

        System.out.print("Occurrences of " + elementToFind + ": ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Add a newline for cleaner output


        // Example demonstrating when the element is not found:
        int elementNotFound = 10; 
        System.out.print("Occurrences of " + elementNotFound + ": ");
         boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementNotFound) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Element not found in the array.");
        }
        System.out.println(); // Add a newline


    }
}
