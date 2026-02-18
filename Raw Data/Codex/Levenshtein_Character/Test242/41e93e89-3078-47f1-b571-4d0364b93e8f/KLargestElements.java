import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        arr = new int[]{11, 5, 22, 1, 7, 15};
        k = 2;
        findKLargest(arr, k);

         arr = new int[]{1, 23, 12, 9, 30, 2, 50};
        k = 7; // Test case with k equal to array length
        findKLargest(arr, k);


         arr = new int[]{1, 23, 12, 9, 30, 2, 50};
        k = 0; // Test case with k equal to 0
        findKLargest(arr, k);

        arr = new int[]{5, 1, 8, 2};
        k = 4;
        findKLargest(arr, k);

    }


    public static void findKLargest(int[] arr, int k) {
        if (k <= 0) {
            System.out.println("k must be a positive integer.");
            return;
        }
        if (k > arr.length) {
            System.out.println("k cannot be greater than the array length.");
            return;
        }

        // Use a min-heap (PriorityQueue in Java) to store the k largest elements.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            if (minHeap.size() < k) {
                minHeap.offer(num); // Add to the heap if it's not full yet.
            } else if (num > minHeap.peek()) {
                minHeap.poll(); // Remove the smallest element from the heap
                minHeap.offer(num); // and add the current element if it's larger.
            }
        }

        // Convert the min-heap to an array (optional) and print the result.
        int[] result = new int[k];
        int i = 0;
        while (!minHeap.isEmpty()) {
            result[i++] = minHeap.poll();
        }
        Arrays.sort(result); //Sort the result array

        System.out.print("K Largest elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
