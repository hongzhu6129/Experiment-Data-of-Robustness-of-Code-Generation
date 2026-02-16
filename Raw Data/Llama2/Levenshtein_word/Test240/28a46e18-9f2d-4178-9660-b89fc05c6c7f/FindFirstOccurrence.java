public class FindFirstOccurrence {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element1 = 5;
        findFirstOccurrence(arr1, element1); // Output: 4

        int[] arr2 = {1, 2, 3, 4, 5, 6, 5, 8, 9, 10};
        int element2 = 5;
        findFirstOccurrence(arr2, element2); // Output: 4

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element3 = 12;  // Element not present
        findFirstOccurrence(arr3, element3); // Output: -1


        int[] arr4 = {}; // Empty array
        int element4 = 5;
        findFirstOccurrence(arr4, element4); // Output: -1

         int[] arr5 = null; // Null array 
        int element5 = 5;
        findFirstOccurrence(arr5, element5); // Output: -1



    }


    public static void findFirstOccurrence(int[] arr, int element) {
        if (arr == null || arr.length == 0) {
            System.out.println("-1");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println(i);
                return; // Exit the loop after the first occurrence is found
            }
        }

        // If the element is not found
        System.out.println("-1");

    }
}
