import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k. k should be between 1 and " + arr.length);
            return;
        }

        Arrays.sort(arr); // Sort the array in ascending order

        System.out.println("kth smallest element: " + arr[k - 1]);
        System.out.println("kth largest element: " + arr[arr.length - k]);


        // Example usage with different arrays and k values:
        int[] arr2 = {1};
        int k2 = 1;
        findKthElements(arr2, k2);


        int[] arr3 = {1,2,3,4,5,6};
        int k3 = 3; 
        findKthElements(arr3, k3);

         int[] arr4 = {1,2,3,4,5,6};
        int k4 = 7; // Invalid k (out of range)
        findKthElements(arr4, k4);

    }



    public static void findKthElements(int[] arr, int k){
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k for array " + Arrays.toString(arr) +". k should be between 1 and " + arr.length);
            return;
        }
        Arrays.sort(arr);
         System.out.println("kth smallest element for array " + Arrays.toString(arr) + ": " + arr[k - 1]);
        System.out.println("kth largest element for array " + Arrays.toString(arr)  + ": " + arr[arr.length - k]);
    }
}
