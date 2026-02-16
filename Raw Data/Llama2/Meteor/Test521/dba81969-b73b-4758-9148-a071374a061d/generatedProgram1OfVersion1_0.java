import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {1, 23, 12, 9, 30, 2, 50};
        int k1 = 3;
        findKLargest(arr1, k1); // Output: 50 30 23

        int[] arr2 = {11, 5, 22, 1, 7, 15};
        int k2 = 2;
        findKLargest(arr2, k2); // Output: 22 15


        int[] arr3 = {1};  // Edge case: array with one element
        int k3 = 1;
        findKLargest(arr3, k3); // Output: 1

        int[] arr4 = {5, 4, 3, 2, 1}; // Edge case: k equal to array size
        int k4 = 5;
        findKLargest(arr4,k4); // Output 5 4 3 2 1

        int[] arr5 = {5, 4, 3, 2, 1}; // Edge case: k greater than array size (handled as k=arr.length)
        int k5 = 6; 
        findKLargest(arr5, k5); // Output: 5 4 3 2 1


    }

    public static void findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return; // Handle empty or null array
        }

        k = Math.min(k, arr.length); // Handle cases where k > array length

        // Use a min-heap (PriorityQueue) to store the k largest elements.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);

            // If the heap size exceeds k, remove the smallest element.
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Print the elements in the heap (k largest elements).
        Integer[] kLargestArray = minHeap.toArray(new Integer[0]);
        Arrays.sort(kLargestArray, (a, b) -> b - a); // Sort descending

        for (int num : kLargestArray) {
            System.out.print(num + " ");
        }
        System.out.println(); // Newline for cleaner output

    }
}
