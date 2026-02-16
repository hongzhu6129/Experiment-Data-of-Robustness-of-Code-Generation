public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 7, 8, 2};
        int elementToFind = 2;

        int firstOccurrence = -1;  // Initialize to -1, indicating not found

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind) {
                firstOccurrence = i;
                break; // Exit the loop once the first occurrence is found
            }
        }

        if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + elementToFind + " is at index: " + firstOccurrence);
        } else {
            System.out.println(elementToFind + " not found in the array.");
        }


         // Example 2: Element not present
        int[] array2 = {10, 20, 30, 40};
        int elementToFind2 = 50;
         firstOccurrence = -1;

         for (int i = 0; i < array2.length; i++) {
             if (array2[i] == elementToFind2) {
                 firstOccurrence = i;
                 break;
             }
         }
         if (firstOccurrence != -1) {
             System.out.println("First occurrence of " + elementToFind2 + " is at index: " + firstOccurrence);
         } else {
             System.out.println(elementToFind2 + " not found in the array.");
         }

    }
}
