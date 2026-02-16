public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Example array

        // Rotate the array to the left (opposite direction)
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;


        // Print the rotated array
        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
