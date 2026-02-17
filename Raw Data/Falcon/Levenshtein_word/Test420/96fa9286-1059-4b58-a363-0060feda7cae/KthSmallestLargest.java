import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        // Find kth smallest and largest
        findKthSmallestLargest(arr, k);

        arr = new int[]{7, 10, 4, 20, 15};  // Example with different size array
        k = 2;
        findKthSmallestLargest(arr, k);


        arr = new int[]{12, 3, 5, 7, 19};
        k = 2;
        findKthSmallestLargest(arr, k); // Example from prompt text
    }

    public static void findKthSmallestLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            System.out.println("Invalid input.");
            return;
        }

        Arrays.sort(arr);

        int kthSmallest = arr[k - 1];
        int kthLargest = arr[arr.length - k];


        System.out.println("Kth smallest element (" + k + "th): " + kthSmallest);
        System.out.println("Kth largest element (" + k + "th): " + kthLargest);
    }
}
