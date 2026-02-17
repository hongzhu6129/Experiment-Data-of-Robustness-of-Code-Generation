import java.util.Arrays;

public class KSmallestElements {

    public static void main(String[] args) {
        int[] originalArray = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;

        System.out.print("Original Array: ");
        printArray(originalArray);

        int[] kSmallest = findKSmallest(originalArray, k);

        System.out.print(k + " smallest elements of the said array are: ");
        printArray(kSmallest);


        // Example for k largest (adjusting the output message):
        int[] kLargest = findKLargest(originalArray,k);
        System.out.print(k + " largest elements of the said array are: ");
        printArray(kLargest);

    }

    public static int[] findKSmallest(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            return new int[0]; // Return an empty array for invalid k
        }

        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, 0, k);
    }

        public static int[] findKLargest(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            return new int[0]; // Return an empty array for invalid k
        }

        Arrays.sort(arr);  // Sort in ascending order
        int[] largest = new int[k];
        for (int i = 0; i < k; i++) {
            largest[i] = arr[arr.length - 1 - i]; // Copy from the end
        }
        return largest;
    }



    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
