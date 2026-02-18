public class TwoArraysCombined {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] combinedArray = new int[2 * 2]; // Array of length 4 (2 elements from each)


        combinedArray[0] = array1[0];
        combinedArray[1] = array1[array1.length - 1];
        combinedArray[2] = array2[0];
        combinedArray[3] = array2[array2.length - 1];



        System.out.print("Combined array: ");
        for (int i = 0; i < combinedArray.length; i++) {
            System.out.print(combinedArray[i] + " ");
        }
    }
}
