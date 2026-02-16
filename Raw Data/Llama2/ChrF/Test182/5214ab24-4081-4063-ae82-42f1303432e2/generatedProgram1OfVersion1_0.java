public class MultiplyArrays {

    public static void main(String[] args) {
        // Initialize seven integer arrays (example values used)
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] array3 = {11, 12, 13, 14, 15};
        int[] array4 = {16, 17, 18, 19, 20};
        int[] array5 = {21, 22, 23, 24, 25};
        int[] array6 = {26, 27, 28, 29, 30};
        int[] array7 = {31, 32, 33, 34, 35};

        // Check if all arrays have the same length
        int length = array1.length;
        if (array2.length != length || array3.length != length || array4.length != length ||
            array5.length != length || array6.length != length || array7.length != length) {
            System.out.println("Arrays must have the same length.");
            return;
        }


        // Multiply corresponding elements and store the result in a new array
        int[] resultArray = new int[length];
        for (int i = 0; i < length; i++) {
            resultArray[i] = array1[i] * array2[i] * array3[i] * array4[i] * array5[i] * array6[i] * array7[i];
        }

        // Print the resulting array
        System.out.print("Result Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(resultArray[i] + " ");
        }
        System.out.println(); 
    }
}
