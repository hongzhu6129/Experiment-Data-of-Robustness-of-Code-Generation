import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        findKthSmallestLargest(arr, k);


        //Another Test case
        int[] arr2 = {7};
        int k2 = 1;

        findKthSmallestLargest(arr2,k2);


        //Another Test case
        int[] arr3 = {1, 2, 3, 4, 5, 6};
        int k3 = 7;// k out of range



        findKthSmallestLargest(arr3,k3);




        // Another Test case for empty array

        int[] arr4 = {};
        int k4 = 2;// k out of range


        findKthSmallestLargest(arr4,k4);


    }

    public static void findKthSmallestLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            System.out.println("Invalid input: Array is empty or k is out of range.");
            return;
        }


        int n = arr.length;
        Arrays.sort(arr);

        System.out.println("Kth smallest element (" + k + "): " + arr[k - 1]);
        System.out.println("Kth largest element (" + k + "): " + arr[n - k]);
    }
}
