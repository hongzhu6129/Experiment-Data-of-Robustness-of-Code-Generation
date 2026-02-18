import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3; // Example: Find the 3rd smallest and largest

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k. k should be between 1 and " + arr.length);
            return;
        }

        findKthSmallestLargest(arr, k);
    }

    public static void findKthSmallestLargest(int[] arr, int k) {
        Arrays.sort(arr); // Sort the array

        int kthSmallest = arr[k - 1];
        int kthLargest = arr[arr.length - k];

        System.out.println("Kth smallest element (" + k + "th): " + kthSmallest);
        System.out.println("Kth largest element (" + k + "th): " + kthLargest);
    }
}
