import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k. k should be between 1 and array length.");
            return;
        }

        findKthSmallestLargest(arr, k);
    }

    public static void findKthSmallestLargest(int[] arr, int k) {
        Arrays.sort(arr);

        System.out.println("Kth smallest element: " + arr[k - 1]);
        System.out.println("Kth largest element: " + arr[arr.length - k]);
    }
}
