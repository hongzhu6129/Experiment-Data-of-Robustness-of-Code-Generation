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


        System.out.println("Kth smallest element (" + k + "th smallest): " + arr[k - 1]);
        System.out.println("Kth largest element (" + k + "th largest): " + arr[arr.length - k]);


        // Example usage with error handling:
        int[] arr2 = {1, 2, 3};
        int k2 = 4;  // Invalid k

        if (k2 <= 0 || k2 > arr2.length) {
            System.out.println("Invalid value of k. k should be between 1 and " + arr2.length);

        } else { // Only proceed if k is valid
            Arrays.sort(arr2);
            System.out.println("Kth smallest element (" + k2 + "th smallest): " + arr2[k2 - 1]);
            System.out.println("Kth largest element (" + k2 + "th largest): " + arr2[arr2.length - k2]);
        }



        // Example with an empty array
        int[] arr3 = {};
        int k3 = 1;

        if (k3 <= 0 || k3 > arr3.length) { // This will catch the error because k3 > arr3.length (1 > 0)
            System.out.println("Invalid value of k or empty array.");
        }


    }
}
