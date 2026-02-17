import java.util.Arrays;

public class PartitionArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] partitionedArr = partitionArray2(arr);

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArr));


        int[] arr2 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10}; // Already partitioned
        int[] partitionedArr2 = partitionArray2(arr2);

        System.out.println("Original array: " + Arrays.toString(arr2));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArr2));


        int[] arr3 = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9}; // Reverse partitioned
        int[] partitionedArr3 = partitionArray2(arr3);

        System.out.println("Original array: " + Arrays.toString(arr3));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArr3));


        int[] arr4 = {};  //Empty array
        int[] partitionedArr4 = partitionArray2(arr4);

        System.out.println("Original array: " + Arrays.toString(arr4));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArr4));



    }

    public static int[] partitionArray2(int[] arr) {
        if (arr == null) {
            return null; // Or throw an exception, depending on requirements
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
