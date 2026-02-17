import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] partitionedArr = partitionArray2(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Partitioned Array: " + Arrays.toString(partitionedArr));


        // Example demonstrating handling of empty or null input
        int[] emptyArr = {};
        int[] partitionedEmptyArr = partitionArray2(emptyArr);
        System.out.println("Partitioned Empty Array: " + Arrays.toString(partitionedEmptyArr));

        int[] nullArr = null;
        int[] partitionedNullArr = partitionArray2(nullArr);
        System.out.println("Partitioned Null Array: " + Arrays.toString(partitionedNullArr)); // Output: null



    }

    public static int[] partitionArray2(int[] arr) {
        if (arr == null) {  // Handle null input
            return null;
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

        int[] result = new int[arr.length];
        int index = 0;

        for (int even : evenList) {
            result[index++] = even;
        }
        for (int odd : oddList) {
            result[index++] = odd;
        }

        return result;

    }
}
