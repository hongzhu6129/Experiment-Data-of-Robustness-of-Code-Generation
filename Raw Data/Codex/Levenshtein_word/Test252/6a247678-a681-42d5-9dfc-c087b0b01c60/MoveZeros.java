import java.util.Arrays;

public class MoveZeros {

    public static int[] move_zero(int[] arr) {
        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; // here count is incremented
            }
        }

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < arr.length) {
            arr[count++] = 0;
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 0, 1, 2, 5, 0};
        int[] result = move_zero(arr);
        System.out.println("Result: " + Arrays.toString(result));

        int[] arr2 = {1, 0, 2, 3, 0, 4, 0, 5};
        int[] result2 = move_zero(arr2);
        System.out.println("Result: " + Arrays.toString(result2));


        int[] arr3 = {1, 2, 3, 4, 5}; // Test with no zeros
        int[] result3 = move_zero(arr3);
        System.out.println("Result: " + Arrays.toString(result3));


        int[] arr4 = {0, 0, 0}; // Test with all zeros
        int[] result4 = move_zero(arr4);
        System.out.println("Result: " + Arrays.toString(result4));



    }
}
