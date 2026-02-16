import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        findKthSmallestLargest(arr, k);


        // Another example with duplicates to demonstrate handling:
         int[] arr2 = {7, 10, 4, 3, 20, 15, 3, 4};
         int k2 = 4;
         findKthSmallestLargest(arr2, k2); 

    }


    public static void findKthSmallestLargest(int[] arr, int k) {

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k.  k must be between 1 and array length (inclusive)");
            return; 
        }

        Arrays.sort(arr); // Sort the array in ascending order


        System.out.println("kth smallest element (" + k + "th smallest): " + arr[k - 1]);
        System.out.println("kth largest element (" + k + "th largest): " + arr[arr.length - k]);

    }
}
