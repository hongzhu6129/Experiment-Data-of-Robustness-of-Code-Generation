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


        // Method 1: Using Sorting (Time complexity: O(n log n))
        int[] arrSorted = Arrays.copyOf(arr, arr.length); // Create a copy to avoid modifying the original
        Arrays.sort(arrSorted);
        System.out.print("K Largest elements (using sorting): ");
        for (int i = arrSorted.length - k; i < arrSorted.length; i++) {
            System.out.print(arrSorted[i] + " ");
        }
        System.out.println();


        // Method 2: Using a Min-Heap (Priority Queue) (Time complexity: O(n log k))
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the size exceeds k
            }
        }
        System.out.print("K Largest elements (using min-heap): ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " "); // Retrieve and remove elements in ascending order
        }
        System.out.println();



        //Method 3: Using QuickSelect (Average Time complexity: O(n), Worst case: O(n^2)): This one is more complex to implement within the constraints of only using a main method, so I've demonstrated the easier methods above.

    }
}
