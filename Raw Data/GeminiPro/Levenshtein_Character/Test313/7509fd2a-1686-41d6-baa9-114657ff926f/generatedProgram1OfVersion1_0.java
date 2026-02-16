import java.util.Arrays;

public class PartitionArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] partitionedArray = partitionArray2(arr);

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArray));

        // Example with an empty array
        int[] emptyArr = {};
        int[] partitionedEmptyArray = partitionArray2(emptyArr);
        System.out.println("Partitioned empty array: " + Arrays.toString(partitionedEmptyArray));

        // Example with an array containing only even numbers
        int[] evenArr = {2, 4, 6, 8};
        int[] partitionedEvenArray = partitionArray2(evenArr);
        System.out.println("Partitioned even array: " + Arrays.toString(partitionedEvenArray));


        // Example with an array containing only odd numbers
        int[] oddArr = {1, 3, 5, 7};
        int[] partitionedOddArray = partitionArray2(oddArr);
        System.out.println("Partitioned odd array: " + Arrays.toString(partitionedOddArray));
    }

    public static int[] partitionArray2(int[] arr) {
        if (arr == null) {
            return null; // Or throw an exception, depending on the requirements
        }

        int evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        int[] partitionedArray = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = evenCount;

        for (int num : arr) {
            if (num % 2 == 0) {
                partitionedArray[evenIndex++] = num;
            } else {
                partitionedArray[oddIndex++] = num;
            }
        }

        return partitionedArray;
    }
}
