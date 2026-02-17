import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {1, 23, 12, 9, 30, 2, 50};
        int k1 = 3;
        findKLargest(arr1, k1); // Output: 50 30 23

        int[] arr2 = {11, 5, 27, 8, 17, 1, 0, 4};
        int k2 = 5;
        findKLargest(arr2, k2); // Output: 27 17 11 8 5


        int[] arr3 = {5,5,5,5,5};
        int k3 = 3;
        findKLargest(arr3, k3); // Output: 5 5 5

        int[] arr4 = {5,5,5,5,5};
        int k4 = 6; // k larger than array size
        findKLargest(arr4, k4); // Handles this case gracefully (prints all elements)

        // Example with negative numbers:
        int[] arr5 = {-2, -5, -1, -8, -3};
        int k5 = 2;
        findKLargest(arr5, k5); // Output: -1 -2
        
        // Example with an empty array:
        int[] arr6 = {};
        int k6 = 2;
        findKLargest(arr6, k6); // Handles empty array gracefully

    }



    public static void findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty."); // Or handle it as needed
            return;
        }


        if (k > arr.length) {
            k = arr.length; // or indicate an error, depending on requirements
        }

        // Method 1: Using a Min-Heap (Priority Queue) - Efficient for large arrays
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if heap size exceeds k
            }
        }

        // Print the k largest elements from the min-heap
        Integer[] result = minHeap.toArray(new Integer[0]);
        Arrays.sort(result, Collections.reverseOrder()); // Sort in descending order
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println(); // Add a newline for cleaner output

    }
}
