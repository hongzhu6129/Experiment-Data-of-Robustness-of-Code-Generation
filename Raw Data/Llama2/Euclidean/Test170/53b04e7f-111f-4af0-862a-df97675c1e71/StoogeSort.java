import java.util.Arrays;

public class StoogeSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 4, 7, 3, 6};
        stoogeSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {10, 30, 20, 50, 40};
        stoogeSort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {}; // Empty array
        stoogeSort(arr3);
        System.out.println(Arrays.toString(arr3));

         int[] arr4 = {5}; // Single element array
        stoogeSort(arr4);
        System.out.println(Arrays.toString(arr4));


    }

    public static void stoogeSort(int[] arr) {
        if (arr != null && arr.length > 0) {
            stoogeSort(arr, 0, arr.length - 1);
        }
    }

    public static void stoogeSort(int[] arr, int low, int high) {
        if (low < high) {
            if (arr[low] > arr[high]) {
                // Swap arr[low] and arr[high]
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }

            int n = high - low + 1;
            if (n > 2) {
                int t = n / 3;
                stoogeSort(arr, low, high - t);
                stoogeSort(arr, low + t, high);
                stoogeSort(arr, low, high - t); 
            }
        }
    }
}
