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
        int[] arr1 = {1, -2, 3, -4, 5, -6};
        int[] result1 = split_sorting_array(arr1);
        System.out.println(Arrays.toString(result1)); // Output: [-6, -4, -2, 5, 3, 1] (or similar ordering of negatives and positives)


        int[] arr2 = {-1, -2, -3, 4, 5, 6};
        int[] result2 = split_sorting_array(arr2);
        System.out.println(Arrays.toString(result2)); // Output: [-3, -2, -1, 6, 5, 4] (or similar ordering)


        int[] arr3 = {1, 2, 3, -4, -5, -6};
        int[] result3 = split_sorting_array(arr3);
        System.out.println(Arrays.toString(result3));  // Output: [-4, -6, -5, 3, 2, 1] (or similar ordering)



        int[] arr4 = {-1, -2, -3, -4, -5, -6};
        int[] result4 = split_sorting_array(arr4);
        System.out.println(Arrays.toString(result4)); // Output: [-1, -2, -3, -4, -5, -6]


        int[] arr5 = {1, 2, 3, 4, 5, 6};
        int[] result5= split_sorting_array(arr5);
        System.out.println(Arrays.toString(result5));  // Output: [1, 2, 3, 4, 5, 6]

    }
}
