import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        findKthSmallestLargest(arr, k);

        arr = new int[]{7, 10, 4, 20, 15};  //Example with even length
        k=2;
        findKthSmallestLargest(arr, k);

        arr = new int[]{12, 3, 5, 7, 19}; // Example with k at the ends
        k=1;
        findKthSmallestLargest(arr, k); // k=1

        k = 5;
        findKthSmallestLargest(arr, k); // k=5 (last element)

        arr = new int[]{1};
        k = 1;
        findKthSmallestLargest(arr, k); //Single element array.
        
        //Error handling example:
        arr = new int[]{1, 2, 3};
        k = 4;
        findKthSmallestLargest(arr, k); //k out of bounds
    }


    public static void findKthSmallestLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            System.out.println("Invalid input. Check array length or value of k.");
            return;
        }


        int n = arr.length;
        Arrays.sort(arr); // Sort the array in ascending order

        int kthSmallest = arr[k - 1];
        int kthLargest = arr[n - k];


        System.out.println("Kth smallest element (" + k + "): " + kthSmallest);
        System.out.println("Kth largest element (" + k + "): " + kthLargest);
        System.out.println("----");
    }
}


