public class MetastasizeArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Check if arrays are of the same length.  If not, we can't metastasize.
        if (array1.length != array2.length) {
            System.out.println("Arrays must be of the same length for metastasization.");
            return; 
        }

        int[] result = new int[array1.length * 2];

        // Interleave elements
        for (int i = 0; i < array1.length; i++) {
            result[2 * i] = array1[i];
            result[2 * i + 1] = array2[i];
        }

        // Print the resulting array
        System.out.print("Metastasized Array: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
