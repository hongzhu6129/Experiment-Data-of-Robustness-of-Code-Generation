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


         // Example with hardcoded arrays from the prompt (if needed)
        int[] array3 = {1, 3, -5, 4};
        int[] array4 = {1, 4, -5, -2};


        if (array3.length != array4.length) {
            System.out.println("Arrays must have the same length for element-wise multiplication.");
            return; 
        }


        int[] result2 = new int[array3.length]; 

        for (int i = 0; i < array3.length; i++) {
            result2[i] = array3[i] * array4[i];
        }

        System.out.print("Resulting array (example 2): [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
