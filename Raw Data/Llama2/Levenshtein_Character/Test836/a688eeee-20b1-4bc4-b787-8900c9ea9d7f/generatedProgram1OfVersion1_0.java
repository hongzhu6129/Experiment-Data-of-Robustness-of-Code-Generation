public class FirstOccurrence {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element1 = 5;
        int result1 = findFirstOccurrence(arr1, element1);
        System.out.println("First occurrence of " + element1 + ": " + result1); // Output: 4

        int[] arr2 = {1, 2, 3, 4, 5, 5, 7, 8, 9, 10};
        int element2 = 5;
        int result2 = findFirstOccurrence(arr2, element2);
        System.out.println("First occurrence of " + element2 + ": " + result2); // Output: 4

        int[] arr3 = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int element3 = 5;
        int result3 = findFirstOccurrence(arr3, element3);
        System.out.println("First occurrence of " + element3 + ": " + result3); // Output: -1


        int[] arr4 = {}; // Empty array
        int element4 = 5;
        int result4 = findFirstOccurrence(arr4, element4);
        System.out.println("First occurrence of " + element4 + ": " + result4); // Output: -1


         int[] arr5 = null; // Null array
        int element5 = 5;
        int result5 = findFirstOccurrence(arr5, element5);
        System.out.println("First occurrence of " + element5 + ": " + result5); // Output: -1


    }

    public static int findFirstOccurrence(int[] arr, int element) {
        if (arr == null || arr.length == 0) {  //handle null and empty array cases
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i; // Return the index of the first occurrence
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
