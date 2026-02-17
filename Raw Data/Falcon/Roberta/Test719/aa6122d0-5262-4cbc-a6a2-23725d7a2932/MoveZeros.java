public class MoveZeros {

    public static int[] move_zero(int[] arr) {
        int count = 0; // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, count++, i); // Efficiently swap without temp variable
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i != j) { // Avoid unnecessary self-swap
            arr[i] ^= arr[j];  // XOR swap
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];
        }

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
