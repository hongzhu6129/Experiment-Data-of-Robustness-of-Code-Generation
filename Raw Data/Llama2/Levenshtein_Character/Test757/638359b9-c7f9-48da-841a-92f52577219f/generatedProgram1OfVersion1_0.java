import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15}; // Example array
        int k = 3; // Example k value

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k. k should be between 1 and " + arr.length);
            return;
        }

        // Find kth smallest
        Arrays.sort(arr);
        int kthSmallest = arr[k - 1];


        // Find kth largest
        int kthLargest = arr[arr.length - k];

        System.out.println("Kth smallest element: " + kthSmallest);
        System.out.println("Kth largest element: " + kthLargest);



        // Example usage with a different array and k
         int[] arr2 = {7, 10, 4, 3, 20, 15};
         int k2 = 4;
        if (k2 <= 0 || k2 > arr2.length) {
             System.out.println("Invalid value of k. k should be between 1 and " + arr2.length);
             return;
         }
         Arrays.sort(arr2);
         System.out.println("Kth smallest element (example 2): " + arr2[k2-1]);
         System.out.println("Kth largest element (example 2): " + arr2[arr2.length - k2]);



    }
}
