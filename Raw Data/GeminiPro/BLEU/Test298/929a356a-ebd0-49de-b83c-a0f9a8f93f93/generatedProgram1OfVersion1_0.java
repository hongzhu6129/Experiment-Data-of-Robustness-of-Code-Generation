import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        findKthSmallestLargest(arr, k);

        arr = new int[]{7, 10, 4, 20, 15};
        k = 4;
         findKthSmallestLargest(arr,k);

          arr = new int[]{7, 10, 4, 3, 20, 15};
        k = 1; //Edge case: k=1
        findKthSmallestLargest(arr,k);


        arr = new int[]{7, 10, 4, 3, 20, 15};
        k = 6; //Edge case: k= array length
         findKthSmallestLargest(arr,k);

         arr = new int[]{7, 10, 4, 3, 20, 15};
        k = 7; //Edge case: k > array length
         findKthSmallestLargest(arr,k);
    }

    public static void findKthSmallestLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            System.out.println("Invalid input.");
            return;
        }
        int n = arr.length;
        Arrays.sort(arr);

        System.out.println("Kth smallest element (" + k + "): " + arr[k - 1]);
        System.out.println("Kth largest element (" + k + "): " + arr[n - k]);

    }
}
