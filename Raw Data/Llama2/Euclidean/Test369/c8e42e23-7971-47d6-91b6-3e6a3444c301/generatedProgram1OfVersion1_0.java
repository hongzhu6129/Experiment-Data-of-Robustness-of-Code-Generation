public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Example array

        // Rotate the array to the left
        int first = arr[0];
        arr[0] = arr[1];
        arr[1] = arr[2];
        arr[2] = first;


        // Print the rotated array
        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
