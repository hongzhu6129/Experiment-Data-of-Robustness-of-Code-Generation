import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] partitionedArray = partitionArray2(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Partitioned Array: " + Arrays.toString(partitionedArray));


        int[] arr2 = {1, 3, 5, 7, 2, 4, 6, 8}; // Example with odds first then evens
        int[] partitionedArray2 = partitionArray2(arr2);
        System.out.println("Original Array: " + Arrays.toString(arr2));
        System.out.println("Partitioned Array: " + Arrays.toString(partitionedArray2));

          int[] arr3 = {}; // Empty array example
        int[] partitionedArray3 = partitionArray2(arr3);
        System.out.println("Original Array: " + Arrays.toString(arr3));
        System.out.println("Partitioned Array: " + Arrays.toString(partitionedArray3));


    }

    public static int[] partitionArray2(int[] arr) {
        if (arr == null) {
            return null; // Or throw an exception, depending on requirements
        }

        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }

        int[] result = new int[arr.length];
        int index = 0;

        //Add odds first
        for (int odd : odds) {
            result[index++] = odd;
        }

        //Add evens next
        for (int even : evens) {
            result[index++] = even;
        }



        return result;
    }
}
