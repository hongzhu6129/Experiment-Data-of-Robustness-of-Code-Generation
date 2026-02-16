import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] partitionedArray = partitionArray2(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Partitioned Array: " + Arrays.toString(partitionedArray));

        // Example with an empty array
        int[] emptyArr = {};
        int[] partitionedEmptyArray = partitionArray2(emptyArr);
        System.out.println("Partitioned Empty Array: " + Arrays.toString(partitionedEmptyArray));
        
         // Example with an array containing only even numbers
        int[] evenArr = {2, 4, 6, 8, 10};
        int[] partitionedEvenArray = partitionArray2(evenArr);
        System.out.println("Partitioned Even Array: " + Arrays.toString(partitionedEvenArray));
        
        // Example with an array containing only odd numbers
        int[] oddArr = {1, 3, 5, 7, 9};
        int[] partitionedOddArray = partitionArray2(oddArr);
        System.out.println("Partitioned Odd Array: " + Arrays.toString(partitionedOddArray));
    }

    public static int[] partitionArray2(int[] arr) {
        if (arr == null) {
            return null; // Or throw an exception, depending on requirements
        }

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }

        // Combine even and odd lists into a single array
        int[] partitionedArray = new int[arr.length];
        int index = 0;
        for (int evenNum : evenList) {
            partitionedArray[index++] = evenNum;
        }
        for (int oddNum : oddList) {
            partitionedArray[index++] = oddNum;
        }

        return partitionedArray;
    }
}
