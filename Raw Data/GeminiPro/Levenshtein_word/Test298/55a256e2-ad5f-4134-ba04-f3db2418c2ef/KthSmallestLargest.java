import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        findKthSmallestLargest(arr, k);
    }

    public static void findKthSmallestLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            System.out.println("Invalid input");
            return;
        }


        Arrays.sort(arr);


        System.out.println("Kth smallest element is " + arr[k - 1]);
        System.out.println("Kth largest element is " + arr[arr.length - k]);

    }
}
