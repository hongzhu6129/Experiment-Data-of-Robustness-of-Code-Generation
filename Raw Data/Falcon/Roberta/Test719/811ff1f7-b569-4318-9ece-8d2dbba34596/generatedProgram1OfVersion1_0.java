public class MoveZeros {

    public static int[] move_zero(int[] arr) {
        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is non-zero, then
        // replace the element at index 'count' with this element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; // here count is incremented
            }
        }

        // Now all non-zero elements have been shifted to front and 'count' is
        // set as index of first 0. Make all elements 0 from count to end.
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

        System.out.print("result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
