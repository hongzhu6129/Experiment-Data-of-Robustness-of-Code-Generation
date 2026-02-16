import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        arr = new int[]{11, 5, 22, 1, 9, 0, 44, 3, 7};
        k = 4;
        findKLargest(arr, k);
    }

    public static void findKLargest(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k.");
            return;
        }

        // Method 1: Using a Min-Heap (Priority Queue) - Efficient for large datasets

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k
            }
        }

        Integer[] kLargest = minHeap.toArray(new Integer[0]);  // Get the elements from the heap
        System.out.println("K Largest elements (using Min-Heap): " + Arrays.toString(kLargest));


        // Method 2: Sorting and then printing last K elements - Simpler but less efficient for huge datasets
        //  Only use this if k is relatively large compared to the array size or if simplicity is prioritized.
        Arrays.sort(arr);
        int[] kLargestSorted = Arrays.copyOfRange(arr, arr.length - k, arr.length);
        System.out.println("K Largest elements (using Sorting): " + Arrays.toString(kLargestSorted));

    }
}
