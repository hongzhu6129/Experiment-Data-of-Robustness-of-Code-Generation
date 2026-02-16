import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;

        // Method 1: Sorting (Simple, but O(n log n) time complexity)
        findKLargestSorting(arr, k);


        // Method 2: Using a Min-Heap (More efficient for large arrays - O(n log k))
        findKLargestMinHeap(arr,k);

        // Method 3: Using Arrays.stream and sorted (Java 8+)
        findKLargestStreams(arr,k);
    }


    public static void findKLargestSorting(int[] arr, int k) {
        Arrays.sort(arr); // Sort the array in ascending order

        System.out.print("K Largest elements (using sorting): ");
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findKLargestMinHeap(int[] arr, int k) {
        // Use a min-heap (PriorityQueue in Java) to store the k largest elements seen so far.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num); // Add the element to the heap

            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k
            }
        }

        System.out.print("K Largest elements (using min-heap): ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " "); // Print the elements in ascending order (as it's a min-heap)
        }        
        System.out.println();
    }



    public static void findKLargestStreams(int[] arr, int k) {
        System.out.print("K Largest elements (using streams): ");
        Arrays.stream(arr)
              .boxed() // Convert int[] to Stream<Integer>
              .sorted(java.util.Collections.reverseOrder()) // Sort in descending order
              .limit(k) // Take the first k elements
              .forEach(System.out::print); // Print each element
        System.out.println();
    }

}



