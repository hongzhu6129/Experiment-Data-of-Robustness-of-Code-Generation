import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k.  k must be between 1 and " + arr.length);
            return; 
        }

        Arrays.sort(arr);

        System.out.println("Kth smallest element (" + k + "th smallest): " + arr[k - 1]);
        System.out.println("Kth largest element (" + k + "th largest): " + arr[arr.length - k]);


        // Example usage with different inputs:
        int[] arr2 = {1, 2, 3, 4, 5};
        int k2 = 1;
        findKthSmallestLargest(arr2, k2); // Output: 1 and 5

        int[] arr3 = {7, 10, 4, 3, 20, 15};
        int k3 = 4;
        findKthSmallestLargest(arr3, k3); // Output: 10 and 7


    }


    // Helper function to encapsulate the logic and make it reusable
    //  (Even though the problem specifically asked for using only main)
    public static void findKthSmallestLargest(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k.  k must be between 1 and " + arr.length);
            return;
        }

        Arrays.sort(arr);

        System.out.println("Kth smallest element (" + k + "th smallest): " + arr[k - 1]);
        System.out.println("Kth largest element (" + k + "th largest): " + arr[arr.length - k]);

    }
}
