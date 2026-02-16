import java.util.Arrays;

public class SwapFirstLast {

    public static void main(String[] args) {
        // Example usage:
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};


        // Swap elements in array1
        if (array1.length >= 1) {
            int temp = array1[0];
            array1[0] = array1[array1.length - 1];
            array1[array1.length - 1] = temp;
        }

        // Swap elements in array2
        if (array2.length >= 1) {
            int temp = array2[0];
            array2[0] = array2[array2.length - 1];
            array2[array2.length - 1] = temp;
        }

        // Print the modified arrays
        System.out.println("Modified array1: " + Arrays.toString(array1));
        System.out.println("Modified array2: " + Arrays.toString(array2));


         // Example with an edge case (array of length 1)
        int[] array3 = {15};
        if (array3.length >= 1) {  // Condition still applies, even for length 1
            int temp = array3[0];
            array3[0] = array3[array3.length - 1]; // Swapping with itself (no actual change)
            array3[array3.length - 1] = temp;
        }
        System.out.println("Modified array3: " + Arrays.toString(array3)); // Output: [15]

    }
}
