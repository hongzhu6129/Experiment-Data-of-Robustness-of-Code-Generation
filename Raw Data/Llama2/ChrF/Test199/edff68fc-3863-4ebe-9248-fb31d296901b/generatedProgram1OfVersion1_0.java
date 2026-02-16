import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k. k should be between 1 and " + arr.length);
            return;
        }

        // Find kth smallest
        Arrays.sort(arr); // Sort the array in ascending order
        int kthSmallest = arr[k - 1];


        // Find kth largest
        int kthLargest = arr[arr.length - k];

        System.out.println("Kth smallest element: " + kthSmallest);
        System.out.println("Kth largest element: " + kthLargest);



        //Example Usage with error handling (for k out of bounds):
         int[] arr2 = {7, 10, 4, 3, 20, 15};
         int k2 = 7;  //invalid k

        findKthSmallestLargest(arr2, k2);


    }


    // Separate method for better organization and reusability (although not required by the prompt):
    public static void findKthSmallestLargest(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k. k should be between 1 and " + arr.length);
            return;
        }

        Arrays.sort(arr);
        System.out.println("Kth smallest element: " + arr[k - 1]);
        System.out.println("Kth largest element: " + arr[arr.length - k]);

    }

}
