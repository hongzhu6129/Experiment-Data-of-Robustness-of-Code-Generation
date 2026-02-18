import java.util.Arrays;

class LinearSearch {

    public static void main(String[] args) {
        int[] array = {2, 4, 7, 9, 11, 13, 17, 19};
        int target = 11;

        int index = Linear_Search(array, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }


        // Test cases demonstrating different scenarios
        int[] array2 = {2, 4, 7, 9, 11, 13, 17, 19};  // Target at the end
        int target2 = 19;
        testLinearSearch(array2, target2);

        int[] array3 = {2, 4, 7, 9, 11, 13, 17, 19};  // Target not present
        int target3 = 20;
        testLinearSearch(array3, target3);

         int[] emptyArray = {}; // Empty array
        int emptyTarget = 5;
        testLinearSearch(emptyArray, emptyTarget);

        int[] singleElementArray = {5};  // Array with one element
        int singleElementTarget = 5;
        testLinearSearch(singleElementArray, singleElementTarget);

         int[] singleElementArray2 = {5};  // Array with one element, target not present
        int singleElementTarget2 = 6;
        testLinearSearch(singleElementArray2, singleElementTarget2);

    }

    private static void testLinearSearch(int[] arr, int target) {
        int index = Linear_Search(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index + " in array " + Arrays.toString(arr));
        } else {
            System.out.println("Element " + target + " not found in the array " + Arrays.toString(arr));
        }
    }

    private static int Linear_Search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }
}
