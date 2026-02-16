public class ArrayCombination {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] combinedArray = new int[2];

        combinedArray[0] = array1[0]; // First element of array1
        combinedArray[1] = array2[array2.length - 1]; // Last element of array2

        // Print the combined array
        System.out.print("[");
        for (int i = 0; i < combinedArray.length; i++) {
            System.out.print(combinedArray[i]);
            if (i < combinedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
