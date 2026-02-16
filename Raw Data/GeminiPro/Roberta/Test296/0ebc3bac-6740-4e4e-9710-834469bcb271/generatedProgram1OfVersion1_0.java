import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k.");
            return;
        }


        // Method 1: Sorting (Time complexity: O(n log n))
        int[] sortedArr = Arrays.copyOf(arr, arr.length); // Avoid modifying original array
        Arrays.sort(sortedArr);
        System.out.print("K Largest elements (using sorting): ");
        for (int i = sortedArr.length - 1; i >= sortedArr.length - k; i--) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();



        // Method 2: Min-Heap (Priority Queue)  (Time complexity: O(n log k))
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num); // Add element to the heap
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove smallest if heap size exceeds k
            }
        }

        System.out.print("K Largest elements (using min-heap): ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " "); // Elements will be retrieved in ascending order
        }
        System.out.println();




        // Method 3: QuickSelect (Average time complexity: O(n))  Not implemented here directly 
        // because it is typically recursive and modifying the array in place.
        //  The recursive nature makes it difficult to implement cleanly within main 
        // without helper functions or a different structure.
        // You can find QuickSelect implementations online if you need the O(n) solution.
    }
}
