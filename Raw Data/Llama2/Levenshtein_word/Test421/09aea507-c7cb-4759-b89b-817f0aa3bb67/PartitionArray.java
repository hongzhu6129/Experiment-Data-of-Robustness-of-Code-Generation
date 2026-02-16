import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] partitionedArr = partitionArray2(arr);

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArr));


        int[] arr2 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10}; // Already somewhat partitioned
        int[] partitionedArr2 = partitionArray2(arr2);
         System.out.println("Original array: " + Arrays.toString(arr2));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedArr2));



        int[] emptyArr = {};
        int[] partitionedEmptyArr = partitionArray2(emptyArr);
        System.out.println("Original array: " + Arrays.toString(emptyArr));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedEmptyArr));



        int[] allEven = {2, 4, 6, 8};
        int[] partitionedAllEven = partitionArray2(allEven);
        System.out.println("Original array: " + Arrays.toString(allEven));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedAllEven));



        int[] allOdd = {1, 3, 5, 7};
        int[] partitionedAllOdd = partitionArray2(allOdd);
        System.out.println("Original array: " + Arrays.toString(allOdd));
        System.out.println("Partitioned array: " + Arrays.toString(partitionedAllOdd));

    }

    public static int[] partitionArray2(int[] arr) {
        if (arr == null) {
            return null; // Or throw an exception - depends on requirements
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
