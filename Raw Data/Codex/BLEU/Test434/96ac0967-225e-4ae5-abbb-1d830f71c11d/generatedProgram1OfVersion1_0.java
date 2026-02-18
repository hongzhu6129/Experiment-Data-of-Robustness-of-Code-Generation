import java.util.Arrays;
import java.util.PriorityQueue;

public class KSmallestElements {

    public static void main(String[] args) {
        int[] arr = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;

        System.out.println("Original array: " + Arrays.toString(arr));
        int[] kSmallest = findKSmallest(arr, k);
        System.out.print(k + " smallest elements of the said array are: ");
        for (int num : kSmallest) {
            System.out.print(num + " ");
        }
        System.out.println(); // Add a newline for cleaner output


        // Example for k largest (as requested in the prompt's example output)
        int[] kLargest = findKLargest(arr,k);
        System.out.print(k + " largest elements of the said array are: ");
        for (int num : kLargest) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to find k smallest elements
    public static int[] findKSmallest(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            return new int[0]; // Return an empty array for invalid k
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a); // Max Heap

        for (int num : arr) {
            maxHeap.offer(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }
        // For smallest elements, you'd ideally return them in ascending order
        Arrays.sort(result); // Sort to maintain correct order for smallest
        return result;

    }


    // Method to find k largest elements (added based on the example output in the prompt)
        public static int[] findKLargest(int[] arr, int k) {
            if (k <= 0 || k > arr.length) {
                return new int[0]; // Return an empty array for invalid k
            }
    
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min Heap
    
            for (int num : arr) {
                minHeap.offer(num);
                if (minHeap.size() > k) {
                    minHeap.poll();
                }
            }
    
            int[] result = new int[k];
            for (int i = k-1; i>=0; i--) {
                result[i] = minHeap.poll();
            }
          
            return result;
    
        }
}
