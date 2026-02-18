import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {1, 23, 12, 9, 30, 2, 50};
        int k1 = 3;
        findKLargest(arr1, k1); // Output: 50 30 23

        int[] arr2 = {11, 5, 22, 17, 9, 1};
        int k2 = 4;
        findKLargest(arr2, k2); // Output: 22 17 11 9



        int[] arr3 = {5,1,10};
        int k3 = 1;
        findKLargest(arr3,k3);

        int[] arr4 = {5,5,5,5,5};
        int k4 = 3;
        findKLargest(arr4,k4);
    }

    public static void findKLargest(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k.");
            return;
        }


        // Method 1: Using a Min-Heap (Priority Queue) - Efficient for larger k values
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k
            }
        }

        // Print the k largest elements from the min-heap
        Integer[] kLargestArray = minHeap.toArray(new Integer[0]);  // Convert to array to print in descending order
        Arrays.sort(kLargestArray, Collections.reverseOrder()); // Sort in descending order
        for(int num : kLargestArray){
            System.out.print(num + " ");
        }
        System.out.println(); // Newline for cleaner output


    }
}
