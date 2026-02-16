import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k. k should be between 1 and " + arr.length);
            return;
        }

        Arrays.sort(arr);


        System.out.println("Kth smallest element: " + arr[k - 1]);
        System.out.println("Kth largest element: " + arr[arr.length - k]);


        // Example usage with different k values and arrays:
        int[] arr2 = {1, 2, 3, 4, 5};
        int k2 = 1;
        kthSmallestLargest(arr2, k2);  // Output: 1, 5

        int[] arr3 = {7, 10, 4, 20, 15};
        int k3 = 2;
        kthSmallestLargest(arr3, k3); // Output: 7, 15

         int[] arr4 = {7, 10, 4, 20, 15};
        int k4 = 4;
        kthSmallestLargest(arr4, k4); // Output: 15, 4
        
         // Demonstrating error handling
        int[] arr5 = {1, 2, 3};
        int k5 = 4;  // Out of bounds
        kthSmallestLargest(arr5, k5); // Output: Invalid value of k...

        int[] arr6 = {1, 2, 3};
        int k6 = 0; // Invalid k value
        kthSmallestLargest(arr6, k6); // Output: Invalid value of k...
    }


    //Helper function to encapsulate logic, but still called from main
     public static void kthSmallestLargest(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k. k should be between 1 and " + arr.length);
            return;
        }

        Arrays.sort(arr);

        System.out.println("Kth smallest element: " + arr[k - 1] + ", Kth largest element: " + arr[arr.length - k]);
    }
}
