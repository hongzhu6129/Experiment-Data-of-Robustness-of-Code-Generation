import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        arr = new int[]{11, 5, 22, 17, 100, 1, 56, 34, 2, 89, 4};
        k = 5;
        findKLargest(arr, k);
    }

    public static void findKLargest(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k.");
            return;
        }

        // Method 1: Using a Min-Heap (Priority Queue)  -  O(N log k) time and O(k) space

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the size exceeds k
            }
        }

        // Print the k largest elements from the min-heap
        System.out.print("K Largest Elements (Using Min-Heap): ");
        Integer[] kLargestArray = minHeap.toArray(new Integer[0]); // Convert to array for easy printing
        Arrays.sort(kLargestArray); // Optional: Sort for ordered output. If not needed you can iterate over minHeap directly but order won't be guaranteed.
        for(int num:kLargestArray) System.out.print(num + " ");

        System.out.println(); // Newline for better output formatting



        // Method 2: Sorting and then printing the last k elements - O(n log n)
        Arrays.sort(arr);  // Sorts in ascending order

        System.out.print("K Largest Elements (Using Sorting): ");
        for (int i = arr.length - k; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


    }
}
