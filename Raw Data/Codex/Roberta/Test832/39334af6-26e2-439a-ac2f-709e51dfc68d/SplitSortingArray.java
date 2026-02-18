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
        Arrays.sort(arr); // Sort the rearranged array
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 3, 4, -1, -3, 1, 2, -4, 0};
        System.out.println("Original array: " + Arrays.toString(arr));
        int[] result = split_sorting_array(arr);
        System.out.println("Result: " + Arrays.toString(result));


        // Additional test cases
         int[] arr2 = {1, 2, -3, -4, 0, 5, -6};
         System.out.println("Original array: " + Arrays.toString(arr2));
         int[] result2 = split_sorting_array(arr2);
         System.out.println("Result: " + Arrays.toString(result2));

         int[] arr3 = {-1, -2, -3, -4};
         System.out.println("Original array: " + Arrays.toString(arr3));
         int[] result3 = split_sorting_array(arr3);
         System.out.println("Result: " + Arrays.toString(result3));

         int[] arr4 = {1, 2, 3, 4};
         System.out.println("Original array: " + Arrays.toString(arr4));
         int[] result4 = split_sorting_array(arr4);
         System.out.println("Result: " + Arrays.toString(result4));

    }
}
