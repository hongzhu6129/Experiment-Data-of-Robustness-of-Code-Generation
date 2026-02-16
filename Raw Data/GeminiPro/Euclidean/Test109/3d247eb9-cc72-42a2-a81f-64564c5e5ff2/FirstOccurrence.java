public class FirstOccurrence {

    public static void main(String[] args) {
        // Example usage:
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element1 = 5;
        int index1 = getFirstOccurrence(array1, element1);
        System.out.println("First occurrence of " + element1 + " in array1: " + index1); // Output: 4


        int[] array2 = {1, 2, 3, 4, 5, 5, 7, 8, 9, 10};
        int element2 = 5;
        int index2 = getFirstOccurrence(array2, element2);
        System.out.println("First occurrence of " + element2 + " in array2: " + index2); // Output: 4

        int[] array3 = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int element3 = 5;
        int index3 = getFirstOccurrence(array3, element3);
        System.out.println("First occurrence of " + element3 + " in array3: " + index3); // Output: -1


        int[] emptyArray = {};
        int element4 = 5;
        int index4 = getFirstOccurrence(emptyArray, element4);
        System.out.println("First occurrence of " + element4 + " in emptyArray: " + index4); // Output: -1

        int[] nullArray = null;
        int element5 = 5;
        int index5 = getFirstOccurrence(nullArray, element5);
        System.out.println("First occurrence of " + element5 + " in nullArray: " + index5); // Output: -1

    }

    public static int getFirstOccurrence(int[] arr, int element) {
        if (arr == null) {
            return -1; 
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; // Element not found
    }
}
