public class LeftShiftArray {

    public static void main(String[] args) {
        // Example usage:
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] leftShiftedArray = leftShift(originalArray);

        // Print the left-shifted array
        System.out.print("Left-shifted array: ");
        for (int num : leftShiftedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] leftShift(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr; // Handle empty or null input
        }

        int n = arr.length;
        int[] shiftedArray = new int[n];

        for (int i = 0; i < n - 1; i++) {
            shiftedArray[i] = arr[i + 1];
        }
        shiftedArray[n - 1] = arr[0]; // Wrap the first element to the end

        return shiftedArray;
    }
}
