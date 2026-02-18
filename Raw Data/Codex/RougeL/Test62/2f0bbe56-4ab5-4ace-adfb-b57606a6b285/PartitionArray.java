import java.util.Arrays;

public class PartitionArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] partitionedArr = partitionArray2(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Partitioned Array: " + Arrays.toString(partitionedArr));


        int[] arr2 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10}; // Already somewhat partitioned
        int[] partitionedArr2 = partitionArray2(arr2);
        System.out.println("Original Array 2: " + Arrays.toString(arr2));
        System.out.println("Partitioned Array 2: " + Arrays.toString(partitionedArr2));


        int[] arr3 = {2, 4, 6, 8, 1, 3, 5, 7};
         int[] partitionedArr3 = partitionArray2(arr3);
        System.out.println("Original Array 3: " + Arrays.toString(arr3));
        System.out.println("Partitioned Array 3: " + Arrays.toString(partitionedArr3));

        int[] emptyArr = {};
        int[] partitionedEmptyArr = partitionArray2(emptyArr);
        System.out.println("Original Empty Array: " + Arrays.toString(emptyArr));
        System.out.println("Partitioned Empty Array: " + Arrays.toString(partitionedEmptyArr));


    }


    public static int[] partitionArray2(int[] arr) {
        if (arr == null) {
            return null; // Or throw an exception, depending on requirements.
        }

        int[] partitionedArr = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1; // Start from the end for odds

        for (int num : arr) {
            if (num % 2 == 0) {
                partitionedArr[evenIndex++] = num; // Place evens at the beginning
            } else {
                partitionedArr[oddIndex--] = num; // Place odds at the end
            }
        }
        return partitionedArr;
    }

}
