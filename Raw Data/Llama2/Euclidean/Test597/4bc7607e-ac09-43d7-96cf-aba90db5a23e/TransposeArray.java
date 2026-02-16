public class TransposeArray {

    public static void main(String[] args) {
        int[][] originalArray = {{10, 20, 30}, {40, 50, 60}};

        System.out.println("Original Array:");
        print_array(originalArray);

        transpose(originalArray);

        System.out.println("After changing the rows and columns of the said array:");
        // Since transpose modifies in-place, we just print the modified original array.
        int[][] transposedArray = new int[originalArray[0].length][originalArray.length];
        int k=0;
         for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray[0].length; j++) {

                 transposedArray[j][i] = originalArray[i][j];
            }
        }
        
        // Flatten and print the transposed array as requested in the prompt's output format.
        int[] flattenedArray = new int[originalArray.length * originalArray[0].length];
        int index = 0;
        for (int i = 0; i < transposedArray.length; i++) {
            for (int j = 0; j < transposedArray[0].length; j++) {
                flattenedArray[index++] = transposedArray[i][j];
            }
        }


         for(int x=0;x<flattenedArray.length;x++)
            System.out.print(flattenedArray[x] + " ");
            System.out.println();


    }

    private static void transpose(int[][] array) {

         int rows = array.length;
         int cols= array[0].length;
        if(rows != cols){
            return;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = i+1; j < cols; j++) {

                 int temp = array[i][j];
                 array[i][j]= array[j][i];
                 array[j][i] = temp;
            }
        }



    }


    private static void print_array(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
