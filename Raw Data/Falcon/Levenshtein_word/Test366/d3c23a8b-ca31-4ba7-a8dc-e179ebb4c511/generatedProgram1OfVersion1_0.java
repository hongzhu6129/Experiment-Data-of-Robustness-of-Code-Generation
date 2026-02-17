import java.util.Arrays;
import java.util.PriorityQueue;

public class KSmallestElements {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 4;

        // Method 1: Sorting and printing first k elements
        findKSmallestSorting(arr, k);


        // Method 2: Using a Max Heap (Priority Queue)
        findKSmallestHeap(arr, k);
    }


    public static void findKSmallestSorting(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k");
            return;
        }
        Arrays.sort(arr);
        System.out.print("K smallest elements (using sorting): ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findKSmallestHeap(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k");
            return;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a); // Max Heap

        for (int num : arr) {
            maxHeap.offer(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();  // Remove the largest element if the size exceeds k
            }
        }

        System.out.print("K smallest elements (using heap): ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " "); // Elements will come out in descending order (largest to smallest)
        }
        System.out.println();

    }
}

