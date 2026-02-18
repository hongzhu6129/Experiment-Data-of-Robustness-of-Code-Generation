public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        // Rotate right (clockwise)
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        // Print the rotated array
        System.out.print("Rotated array (right): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        // Reset the array (for left rotation demonstration)
        arr = new int[]{1, 2, 3};


        // Rotate left (counter-clockwise)
        temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

        // Print the rotated array
        System.out.print("Rotated array (left): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
