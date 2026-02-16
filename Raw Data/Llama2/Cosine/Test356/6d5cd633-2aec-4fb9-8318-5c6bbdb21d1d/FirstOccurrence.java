public class FirstOccurrence {

    public static void main(String[] args) {
        // Example usage:
        int[] array = {1, 2, 3, 4, 5, 2, 6, 2};
        int element = 2;
        int firstOccurrence = findFirstOccurrence(array, element);

        if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + element + " is at index: " + firstOccurrence);
        } else {
            System.out.println(element + " is not found in the array.");
        }


        int[] emptyArray = {};
        element = 7;
        firstOccurrence = findFirstOccurrence(emptyArray, element);
         if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + element + " is at index: " + firstOccurrence);
        } else {
            System.out.println(element + " is not found in the array.");
        }


        int[] arrayWithNoOccurrence = {1, 3, 5, 7};
        element = 9;
         firstOccurrence = findFirstOccurrence(arrayWithNoOccurrence, element);
         if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + element + " is at index: " + firstOccurrence);
        } else {
            System.out.println(element + " is not found in the array.");
        }


        int[] arrayWithSingleElement = {5};
        element = 5;
        firstOccurrence = findFirstOccurrence(arrayWithSingleElement, element);
         if (firstOccurrence != -1) {
            System.out.println("First occurrence of " + element + " is at index: " + firstOccurrence);
        } else {
            System.out.println(element + " is not found in the array.");
        }


    }

    public static int findFirstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index immediately upon finding the first occurrence
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
