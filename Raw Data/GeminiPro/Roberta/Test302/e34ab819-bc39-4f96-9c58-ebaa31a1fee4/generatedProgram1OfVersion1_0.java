import java.util.Arrays;

public class SplitSortingArray {

    public static int[] split_sorting_array(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] < 0 && left < right) {
                left++;
            }
            while (arr[right] >= 0 && left < right) {
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
        int[] arr1 = {-1, 2, -3, 4, 5, -6};
        int[] result1 = split_sorting_array(arr1);
        System.out.println(Arrays.toString(result1)); // Output: [-1, -3, -6, 4, 5, 2] (or similar rearrangement)

        int[] arr2 = {1, 2, -3, -4, 5, -6};
        int[] result2 = split_sorting_array(arr2);
        System.out.println(Arrays.toString(result2)); // Output: [-3, -4, -6, 1, 5, 2] (or similar rearrangement)


        int[] arr3 = {-1, -2, -3, -4, -5, -6};
        int[] result3 = split_sorting_array(arr3);
        System.out.println(Arrays.toString(result3)); // Output: [-1, -2, -3, -4, -5, -6]

        int[] arr4 = {1, 2, 3, 4, 5, 6};
        int[] result4 = split_sorting_array(arr4);
        System.out.println(Arrays.toString(result4)); // Output: [1, 2, 3, 4, 5, 6]

         int[] arr5 = {};
        int[] result5 = split_sorting_array(arr5);
        System.out.println(Arrays.toString(result5)); // Output: []
    }
}
