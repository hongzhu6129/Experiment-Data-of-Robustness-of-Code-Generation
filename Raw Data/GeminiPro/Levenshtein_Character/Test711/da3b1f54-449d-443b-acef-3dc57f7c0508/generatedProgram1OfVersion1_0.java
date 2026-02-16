import java.util.Arrays;

public class RadixSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int exp = 1;
        while (max / exp > 0) {
            countingSortByDigit(arr, arr.length, exp, 10); // Assuming base 10
            exp *= 10;
        }
    }


    public static void sort(int[] arr, int base) { // For different bases
        if (arr == null || arr.length == 0) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int exp = 1;
        while (max / exp > 0) {
            countingSortByDigit(arr, arr.length, exp, base);
            exp *= base;
        }
    }


    private static void countingSortByDigit(int[] arr, int n, int exp, int base) {
        int[] output = new int[n];
        int[] count = new int[base];


        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % base]++;
        }

        for (int i = 1; i < base; i++) {
            count[i] += count[i - 1];
        }


        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % base] - 1] = arr[i];
            count[(arr[i] / exp) % base]--;
        }


        System.arraycopy(output, 0, arr, 0, n);

    }


    public static void main(String[] args) {
        try {
            //Example usage (demonstrating correct integer parsing)
            String numStr = "12345"; // Replace with your input string

            int num = Integer.parseInt(numStr); // This line might throw NumberFormatException

            int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
            sort(arr);

            System.out.println("Sorted array (base 10): " + Arrays.toString(arr));


            int[] arr2 = {170, 45, 75, 90, 802, 24, 2, 66};
            sort(arr2, 8); // Example with base 8
            System.out.println("Sorted array (base 8): " + Arrays.toString(arr2));



        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Please enter a valid integer."); // Handle the exception
        }
    }
}
