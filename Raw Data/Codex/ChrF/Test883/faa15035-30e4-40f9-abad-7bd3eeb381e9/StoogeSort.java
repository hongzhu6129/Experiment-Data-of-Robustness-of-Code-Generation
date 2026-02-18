public class StoogeSort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 4, 7, 3, 6};
        stoogeSort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void stoogeSort(int[] arr) {
        stoogeSort(arr, 0, arr.length - 1);
    }

    public static void stoogeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        if (arr[low] > arr[high]) {
            // Swap elements if they are in the wrong order
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
        }

        if (high - low + 1 > 2) {
            int t = (high - low + 1) / 3;

            // Recursively sort the first 2/3 of the array
            stoogeSort(arr, low, high - t);

            // Recursively sort the last 2/3 of the array
            stoogeSort(arr, low + t, high);

            // Recursively sort the first 2/3 of the array again
            stoogeSort(arr, low, high - t);
        }
    }
}
