import java.util.PriorityQueue;

public class KthLargestPriorityQueue {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k");
            return;
        }

       int kthLargest = findKthLargest(arr, k);
       System.out.println("Kth largest element: " + kthLargest);
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k
            }
        }
        return minHeap.peek(); // The top element is the kth largest
    }
}
