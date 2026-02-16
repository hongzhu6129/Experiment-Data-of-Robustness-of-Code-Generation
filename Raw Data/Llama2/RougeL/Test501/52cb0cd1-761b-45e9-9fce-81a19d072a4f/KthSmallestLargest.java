import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        // Find kth smallest element
        int kthSmallest = findKthSmallest(arr, k);
        System.out.println("kth smallest element: " + kthSmallest);


        // Find kth largest element
        int kthLargest = findKthLargest(arr, k);
        System.out.println("kth largest element: " + kthLargest);

    }

    public static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr); // Sort the array in ascending order
        if (k > 0 && k <= arr.length) {
            return arr[k - 1];
        } else {
            return -1; // Return -1 if k is out of bounds
        }
    }

    public static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr); // Sort the array in ascending order
        if (k > 0 && k <= arr.length) {
            return arr[arr.length - k];
        } else {
            return -1; // Return -1 if k is out of bounds
        }
    }
}
