public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 6};
        int elementToFind = 2;

        int firstOccurrence = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind) {
                firstOccurrence = i;
                break; // Exit loop after finding the first occurrence
            }
        }

        if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + elementToFind + " is at index: " + firstOccurrence);
        } else {
            System.out.println(elementToFind + " not found in the array.");
        }

         //Example 2: No matching element
        int[] array2 = {7,8,9,10};
        int elementToFind2 = 5;
        firstOccurrence = -1; //Reset for next example

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
