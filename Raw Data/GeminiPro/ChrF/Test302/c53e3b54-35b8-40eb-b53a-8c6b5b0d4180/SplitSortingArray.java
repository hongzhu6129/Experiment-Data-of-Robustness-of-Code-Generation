import java.util.Arrays;

public class SplitSortingArray {

    public static int[] split_sorting_array(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Find a negative number from the right
            while (left < right && arr[right] >= 0) {
                right--;
            }

            // Find a positive number from the left
            while (left < right && arr[left] < 0) {
                left++;
            }

            // Swap if necessary
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
        System.out.println(Arrays.toString(result1)); // Expected output (order may vary): [-6, -4, -2, 1, 3, 5]

        int[] arr2 = {-1, -2, -3, 4, 5, 6};
        int[] result2 = split_sorting_array(arr2);
        System.out.println(Arrays.toString(result2)); // Expected output (order may vary): [-3, -2, -1, 4, 5, 6]


        int[] arr3 = {1, 2, 3, 4, 5, 6};
        int[] result3 = split_sorting_array(arr3);
        System.out.println(Arrays.toString(result3)); // Expected output: [1, 2, 3, 4, 5, 6]

        int[] arr4 = {-1, -2, -3, -4, -5, -6};
        int[] result4= split_sorting_array(arr4);
        System.out.println(Arrays.toString(result4)); // Expected output: [-1, -2, -3, -4, -5, -6]


        int [] arr5 = {0, 1, -1};
        int[] result5= split_sorting_array(arr5);
        System.out.println(Arrays.toString(result5)); // Expected output (order may vary): [-1, 0, 1] or [-1, 1, 0] (0 can be on either side)

    }
}
