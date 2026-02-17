public class MultiplyArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Check if arrays have the same length. If not, print an error message.
        if (array1.length != array2.length) {
            System.out.println("Error: Arrays must have the same length.");
            return; // Exit the program
        }


        int[] result = new int[array1.length];


        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] * array2[i];
        }


        System.out.print("Resultant array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
