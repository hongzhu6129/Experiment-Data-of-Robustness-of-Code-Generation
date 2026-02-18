import java.util.Arrays;
import java.util.Collections;

public class KLargestElements {

    public static void main(String[] args) {
        Integer[] arr = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;

        System.out.print("Original Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Sort the array in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.print(k + " largest elements of the said array are: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
