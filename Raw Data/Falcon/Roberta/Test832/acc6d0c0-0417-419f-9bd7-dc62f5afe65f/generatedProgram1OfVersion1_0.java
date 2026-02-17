import java.util.Arrays;

public class SplitSortingArray {

    public static int[] split_sorting_array(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Find a negative number from the right
            while (arr[right] >= 0 && left < right) {
                right--;
            }

            // Find a positive number from the left
            while (arr[left] < 0 && left < right) {
                left++;
            }

            // Swap if needed
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
        System.out.println("Result 1: " + Arrays.toString(result1));


        int[] arr2 = {-1, 2, -3, 4, -5, 6, -7, 8, -9, 10};
        int[] result2 = split_sorting_array(arr2);
        System.out.println("Result 2: " + Arrays.toString(result2));

         int[] arr3 = {0, 1, -2, -3, 4, 5};
        int[] result3 = split_sorting_array(arr3);
        System.out.println("Result 3: " + Arrays.toString(result3));


    }
}
