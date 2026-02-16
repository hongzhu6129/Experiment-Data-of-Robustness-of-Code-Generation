import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {1, 23, 12, 9, 30, 2, 50};
        int k1 = 3;
        findKLargest(arr1, k1); // Output: 50 30 23

        int[] arr2 = {11, 5, 22, 1, 15, 7};
        int k2 = 2;
        findKLargest(arr2, k2); // Output: 22 15


        int[] arr3 = {1, 2, 3, 4, 5, 6}; // Sorted array example
        int k3 = 3;
        findKLargest(arr3, k3);  // Output: 6 5 4

        int[] arr4 = {6, 5, 4, 3, 2, 1}; // Reverse sorted array
        int k4 = 2;
        findKLargest(arr4, k4); // Output: 6 5


        // Example with duplicates
        int[] arr5 = {5, 5, 4, 4, 2, 1};
        int k5 = 3;
        findKLargest(arr5, k5); // Output: 5 5 4
    }


    public static void findKLargest(int[] arr, int k) {
        if (k <= 0 || arr == null || arr.length == 0) {
            System.out.println("Invalid input."); // Handle edge cases
            return;
        }

        if (k > arr.length) {
            k = arr.length; // If k is larger than the array length, find all elements. 
        }

        // Method 1: Using a Min-Heap (Priority Queue) - Efficient for large datasets
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element to keep the heap size at k
            }
        }

        // Print the elements from the min-heap (they will be the k largest)
        Integer[] kLargest = minHeap.toArray(new Integer[0]); // Convert to array to maintain order during printing. 
        Arrays.sort(kLargest, (a, b) -> b - a); // Optional: Sort in descending order for cleaner output

        for (int num : kLargest) {
            System.out.print(num + " ");
        }
        System.out.println();



        // Method 2: Using Sorting (Simpler, but less efficient for very large datasets)
        /*
        Arrays.sort(arr); // Sort the array in ascending order

        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        */
    }
}
