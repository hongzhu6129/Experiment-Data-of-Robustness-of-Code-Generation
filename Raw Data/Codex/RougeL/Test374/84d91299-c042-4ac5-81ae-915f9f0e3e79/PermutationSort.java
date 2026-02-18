import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
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
        return null; // Should not happen if the input is valid
    }

    private static void permute(int[] arr, int l, List<int[]> permutations) {
        int r = arr.length - 1;
        if (l == r) {
            permutations.add(arr.clone()); // Add a copy to avoid modification issues
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, permutations);
                swap(arr, l, i); // Backtrack
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
