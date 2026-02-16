public class MultiplyArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Check if arrays have the same length
        if (array1.length != array2.length) {
            System.out.println("Arrays must have the same length for element-wise multiplication.");
            return; // Exit if lengths are different
        }

        int[] result = new int[array1.length]; // Array to store the results

        // Multiply corresponding elements
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] * array2[i];
        }

        // Print the resulting array
        System.out.print("Resulting array: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
