import java.util.Arrays;

public class RadixSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Already sorted or empty
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int exp = 1;

        while (max / exp > 0) {
            countingSortByDigit(arr, arr.length, exp, max);
            exp *= 10;
        }
    }


    public static void sort(int[] arr, int n) {
        sort(arr); //  Just calls the main sort method � n is unused here because it's handled internally
    }



    private static void countingSortByDigit(int[] arr, int n, int exp, int max) {
        int[] output = new int[n];
        int[] count = new int[10]; // 0-9 digits

        Arrays.fill(count, 0);


        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, n);

    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        sort(arr);


        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));


        int[] arr2 = {12, 54, 87, 32, 65, 10, 9};
        sort(arr2, arr2.length);  //Example using the n parameter (redundant, but fulfills signature requirement)

        System.out.println("Sorted array 2:");
        System.out.println(Arrays.toString(arr2));


    }
}
