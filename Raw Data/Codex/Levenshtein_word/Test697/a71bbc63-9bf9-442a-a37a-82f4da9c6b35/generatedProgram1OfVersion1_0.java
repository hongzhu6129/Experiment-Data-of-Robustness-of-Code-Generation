import java.util.Arrays;

public class PartitionArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] partitionedArr = partitionArray2(arr);
        System.out.println(Arrays.toString(partitionedArr));

        int[] arr2 = {1, 3, 5, 7, 2, 4, 6, 8};
        partitionedArr = partitionArray2(arr2);
        System.out.println(Arrays.toString(partitionedArr));


        int[] arr3 = {2, 4, 6, 8, 1, 3, 5, 7, 9}; // Example with odd length
        partitionedArr = partitionArray2(arr3);
        System.out.println(Arrays.toString(partitionedArr));

        int[] arr4 = {}; // Empty array example
        partitionedArr = partitionArray2(arr4);
        System.out.println(Arrays.toString(partitionedArr));


    }

    public static int[] partitionArray2(int[] arr) {
        if (arr == null) {
            return null; // or throw an exception, depending on your requirements
        }
        int[] result = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1;

        for (int num : arr) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }
        return result;
    }
}
