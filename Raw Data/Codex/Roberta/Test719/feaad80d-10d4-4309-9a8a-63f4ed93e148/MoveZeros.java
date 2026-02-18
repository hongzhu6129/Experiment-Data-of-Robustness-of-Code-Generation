public class MoveZeros {

    public static int[] move_zero(int[] arr) {
        int j = 0; // Pointer for non-zero elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap the non-zero element with the element at the j-th position
                swap(arr, i, j);
                j++;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] originalArray = {0, 3, 4, 0, 1, 2, 5, 0};
        int[] result = move_zero(originalArray);

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
