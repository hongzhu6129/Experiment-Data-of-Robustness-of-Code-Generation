import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 4};
        int[] sortedArr = pSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }

    public static int[] pSort(int[] arr) {
        List<int[]> permutations = new ArrayList<>();
        permute(arr, 0, permutations);

        for (int[] permutation : permutations) {
            if (isSorted(permutation)) {
                return permutation;
            }
        }
        return null; // Should never reach here if the array contains sortable elements
    }


    private static void permute(int[] arr, int l, List<int[]> permutations) {
        if (l == arr.length) {
            permutations.add(arr.clone()); // Important: Add a copy, not the original array
        } else {
            for (int i = l; i < arr.length; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, permutations);
                swap(arr, l, i); // Backtrack to maintain original order for next iteration
            }
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
