import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] partitionedArr = partitionArray2(arr);

        // Outputting the even and odd arrays
        System.out.print("Even numbers: ");
        for (int i = 0; i < partitionedArr.length; i++) {
            if (partitionedArr[i] % 2 == 0 && partitionedArr[i] != -1) { // -1 is used as a placeholder
                System.out.print(partitionedArr[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i = 0; i < partitionedArr.length; i++) {
            if (partitionedArr[i] % 2 != 0 ) {
                System.out.print(partitionedArr[i] + " ");
            }
        }
        System.out.println();


    }

    public static int[] partitionArray2(int[] arr) {
        if (arr == null) {
            return null;  // Handle null input
        }

        int[] result = new int[arr.length];
        Arrays.fill(result, -1); // Initialize with a placeholder value

        int evenIndex = 0;
        int oddIndex = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                result[evenIndex++] = num; 
            } else {
                result[arr.length - 1 - oddIndex++] = num; // Place odds from the end
            }
        }


        return result;

    }
}
