import java.util.Arrays;

public class SplitSortingArray {

    public static int[] split_sorting_array(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (left < right && arr[left] < 0) {
                left++;
            }
            while (left < right && arr[right] >= 0) {
                right--;
            }
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        int[] result1 = split_sorting_array(arr1);
        System.out.println("Result 1: " + Arrays.toString(result1));  // Example output: [-10, -8, -6, -4, -2, 5, 7, 9, 1, 3] (order of negatives/positives may vary)

        int[] arr2 = {-1, 2, -3, 4, -5, 6};
        int[] result2 = split_sorting_array(arr2);
        System.out.println("Result 2: " + Arrays.toString(result2)); // Example output: [-5, -3, -1, 4, 2, 6] (order of negatives/positives may vary)

         int[] arr3 = {1, 2, 3, 4, 5};
        int[] result3 = split_sorting_array(arr3);
        System.out.println("Result 3: " + Arrays.toString(result3)); // Example output: [1, 2, 3, 4, 5]

        int[] arr4 = {-1, -2, -3, -4, -5};
        int[] result4= split_sorting_array(arr4);
        System.out.println("Result 4: " + Arrays.toString(result4)); // Example output: [-1, -2, -3, -4, -5]



    }
}
