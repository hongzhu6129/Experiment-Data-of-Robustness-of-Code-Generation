import java.util.Arrays;

public class KthSmallestLargest {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        System.out.println("Original array: " + Arrays.toString(arr));

        findKthSmallestLargest(arr, k);
    }

    public static void findKthSmallestLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            System.out.println("Invalid input.");
            return;
        }

        Arrays.sort(arr);  // Sort the array in ascending order

        int kthSmallest = arr[k - 1];
        int kthLargest = arr[arr.length - k];

        System.out.println(k + "th smallest element: " + kthSmallest);
        System.out.println(k + "th largest element: " + kthLargest);



        // Demonstration of how to manually find kth smallest/largest (without sorting the whole array which is less efficient):
        //  This approach uses a min-heap for kth largest and a max-heap for kth smallest
         // (using priority queues), but since this exercise requests only main method:

        System.out.println("\nDemonstrating (without full implementation) manual calculation (more efficient than fully sorting):");
        System.out.println("For Kth Smallest (using a Max Heap - only showing concept):");
        System.out.println("1. Build a Max Heap of the first k elements of the array.");
        System.out.println("2. Iterate through the rest of the array. For each element:");
        System.out.println("   - If the element is smaller than the root of the heap (largest in heap so far):");
        System.out.println("     - Replace the root with the element and heapify.");
        System.out.println("3. After iterating through the whole array, the root of the heap is the kth smallest element.");

        System.out.println("\nFor Kth Largest (using a Min Heap - only showing concept):");
        System.out.println("1. Build a Min Heap of the first k elements of the array."); // Similar logic but reversed!
        System.out.println("2. Iterate through the rest of the array. For each element:");
        System.out.println("   - If the element is larger than the root of the heap (smallest in heap so far):");
        System.out.println("     - Replace the root with the element and heapify.");
        System.out.println("3. After iterating through the whole array, the root of the heap is the kth largest element.");


    }
}
