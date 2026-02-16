import java.util.Arrays;

public class PartitionArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] partitionedArray = partitionArray2(arr);

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArray));


        int[] arr2 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10}; // Already somewhat partitioned
        int[] partitionedArray2 = partitionArray2(arr2);
        System.out.println("Original array 2: " + Arrays.toString(arr2));
        System.out.println("Partitioned array 2: " + Arrays.toString(partitionedArray2));


        int[] arr3 = {2, 4, 6, 8, 10}; // All even
        int[] partitionedArray3 = partitionArray2(arr3);
        System.out.println("Original array 3: " + Arrays.toString(arr3));
        System.out.println("Partitioned array 3: " + Arrays.toString(partitionedArray3));


        int[] arr4 = {1, 3, 5, 7, 9}; //All odd
        int[] partitionedArray4 = partitionArray2(arr4);
        System.out.println("Original array 4: " + Arrays.toString(arr4));
        System.out.println("Partitioned array 4: " + Arrays.toString(partitionedArray4));

         int[] arr5 = {}; // Empty array
        int[] partitionedArray5 = partitionArray2(arr5);
        System.out.println("Original array 5: " + Arrays.toString(arr5));
        System.out.println("Partitioned array 5: " + Arrays.toString(partitionedArray5));
    }

    public static int[] partitionArray2(int[] arr) {
        if (arr == null) {
            return null; // Or throw an exception - depends on desired behavior
        }

        int[] partitionedArray = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1;


        for (int num : arr) {
            if (num % 2 == 0) {
                partitionedArray[evenIndex++] = num;
            } else {
                partitionedArray[oddIndex--] = num;
            }
        }
        return partitionedArray;
    }
}
