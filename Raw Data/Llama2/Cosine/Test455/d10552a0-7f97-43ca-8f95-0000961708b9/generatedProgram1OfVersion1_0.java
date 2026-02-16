import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        findKthSmallestLargest(arr, k);


        //More examples
        int[] arr2 = {7};
        int k2 = 1;
        findKthSmallestLargest(arr2,k2);


        int[] arr3 = {7, 10, 4, 3, 20, 15};
        int k3 = 7;
        findKthSmallestLargest(arr3,k3); //Handles k out of bounds

        int [] arr4 = {};
        int k4 = 1;
        findKthSmallestLargest(arr4, k4); //Handles empty array

    }

    public static void findKthSmallestLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            System.out.println("Invalid input: Array is empty or null.");
            return;
        }


        int n = arr.length;

        if (k <= 0 || k > n) {
            System.out.println("Invalid input: k is out of bounds.");
            return;
        }

        Arrays.sort(arr);


        System.out.println("Kth smallest element (" + k + "): " + arr[k - 1]);
        System.out.println("Kth largest element (" + k + "): " + arr[n - k]);


    }
}
