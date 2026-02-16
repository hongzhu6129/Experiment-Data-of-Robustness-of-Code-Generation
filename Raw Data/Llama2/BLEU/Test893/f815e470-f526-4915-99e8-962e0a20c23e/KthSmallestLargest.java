import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        findKthSmallestLargest(arr, k);

        int[] arr2 = {7, 10, 4, 20, 15}; //Example with an even number of elements
        int k2 = 2;
        findKthSmallestLargest(arr2, k2);

        int[] arr3 = {1}; //Example with a single element
        int k3 = 1;

        findKthSmallestLargest(arr3,k3);



    }

    public static void findKthSmallestLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            System.out.println("Invalid input.");
            return;
        }

        //Sort the array to easily find the kth smallest and largest elements
        Arrays.sort(arr);

        System.out.println("Kth smallest element ("+ k + "): " + arr[k - 1]);
        System.out.println("Kth largest element (" + k + "): " + arr[arr.length - k]);

    }
}
