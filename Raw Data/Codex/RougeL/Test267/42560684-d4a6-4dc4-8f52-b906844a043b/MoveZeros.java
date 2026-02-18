import java.util.Arrays;

public class MoveZeros {

    public static int[] move_zero(int[] arr) {
        int count = 0; // Count of non-zero elements

        // Traverse the array. If element encountered is non-zero, then
        // replace the element at index 'count' with this element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, count++, i); // Optimized swap to avoid temporary variable
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int a, int b) {
        if (a != b) { // Only swap if indices are different
            arr[a] = arr[a] + arr[b];
            arr[b] = arr[a] - arr[b];
            arr[a] = arr[a] - arr[b];  // Avoids temporary variable
        }
    }


    public static void main(String[] args) {
        int[] arr = {0, 3, 4, 0, 1, 2, 5, 0};
        int[] result = move_zero(arr);
        System.out.println("result: " + Arrays.toString(result));


        // Additional test cases:
        int[] arr2 = {1, 0, 2, 0, 3, 0};
        int[] result2 = move_zero(arr2);
        System.out.println("result2: " + Arrays.toString(result2));


        int[] arr3 = {0, 0, 0, 1, 2, 3};
        int[] result3 = move_zero(arr3);
        System.out.println("result3: " + Arrays.toString(result3));


        int[] arr4 = {1, 2, 3, 4, 5};  // No zeros
        int[] result4 = move_zero(arr4);
        System.out.println("result4: " + Arrays.toString(result4));

        int[] arr5 = {0,0,0}; // All zeros
        int[] result5 = move_zero(arr5);
        System.out.println("result5: " + Arrays.toString(result5));


    }
}
