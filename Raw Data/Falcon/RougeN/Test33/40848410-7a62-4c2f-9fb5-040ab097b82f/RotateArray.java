public class RotateArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3}; // Example array

        // Rotate the array to the left
        int temp = array[0];
        array[0] = array[1];
        array[1] = array[2];
        array[2] = temp;


        // Print the rotated array
        System.out.print("Rotated array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Add a newline for better formatting
    }
}
