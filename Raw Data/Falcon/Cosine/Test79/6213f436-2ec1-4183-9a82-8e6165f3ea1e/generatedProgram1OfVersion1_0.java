import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k. k should be between 1 and " + arr.length);
            return;
        }

        findKthSmallestLargest(arr, k);
    }

    public static void findKthSmallestLargest(int[] arr, int k) {
        // Create a copy of the array to avoid modifying the original
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        int kthSmallest = sortedArr[k - 1];
        int kthLargest = sortedArr[sortedArr.length - k];

        System.out.println("Kth smallest element: " + kthSmallest);
        System.out.println("Kth largest element: " + kthLargest);
    }
}
