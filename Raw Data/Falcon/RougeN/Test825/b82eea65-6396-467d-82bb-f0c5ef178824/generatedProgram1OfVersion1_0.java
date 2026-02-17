import java.util.Arrays;

public class PartitionEvenOdd {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] partitionedArr1 = partitionArray2(arr1);
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArr1));


        int[] arr2 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10}; //Pre-sorted even/odd
        int[] partitionedArr2 = partitionArray2(arr2);
        System.out.println("Original array: " + Arrays.toString(arr2));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArr2));

        int[] arr3 = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9}; // Reverse pre-sorted
        int[] partitionedArr3 = partitionArray2(arr3);
        System.out.println("Original array: " + Arrays.toString(arr3));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArr3));


        int[] arr4 = {}; // Empty array
        int[] partitionedArr4 = partitionArray2(arr4);
        System.out.println("Original array: " + Arrays.toString(arr4));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArr4));


        int[] arr5 = null; // Null array
        int[] partitionedArr5 = partitionArray2(arr5);
        System.out.println("Original array: " + Arrays.toString(arr5));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArr5));

        int[] arr6 = {1, 1, 1, 1, 1}; // All odd
        int[] partitionedArr6 = partitionArray2(arr6);
        System.out.println("Original array: " + Arrays.toString(arr6));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArr6));


        int[] arr7 = {2, 2, 2, 2, 2}; // All even
        int[] partitionedArr7= partitionArray2(arr7);
        System.out.println("Original array: " + Arrays.toString(arr7));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArr7));

    }

    public static int[] partitionArray2(int[] arr) {
        if (arr == null) {
            return null; // Handle null input
        }
        int[] partitionedArr = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1;

        for (int num : arr) {
            if (num % 2 == 0) {
                partitionedArr[evenIndex++] = num;
            } else {
                partitionedArr[oddIndex--] = num;
            }
        }

        return partitionedArr;
    }
}
