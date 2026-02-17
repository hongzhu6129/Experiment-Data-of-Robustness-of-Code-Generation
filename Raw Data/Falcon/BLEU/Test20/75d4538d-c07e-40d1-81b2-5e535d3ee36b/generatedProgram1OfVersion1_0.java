import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        arr = new int[]{11, 5, 2, 7, 1, 15, 8};
        k = 3;
        findKLargest(arr, k);


        arr = new int[]{1, 23};
        k = 3; // k larger than array size
        findKLargest(arr,k);

        arr = new int[]{1, 23, 12, 9, 30, 2, 50};
        k = 0; // k is 0
        findKLargest(arr,k);
    }


    public static void findKLargest(int[] arr, int k) {
        if (k <= 0) {
            System.out.println("k must be a positive integer.");
            return;
        }

        if (k > arr.length) {
            System.out.println("k cannot be larger than the array size.");
            return;
        }
        

        // Using a min-heap (PriorityQueue in Java)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num); //Add elements to the heap

            if (minHeap.size() > k) { 
                minHeap.poll();  // Remove the smallest element if heap size exceeds k
            }
        }

        // The remaining elements in the minHeap are the k largest
        Integer[] result = minHeap.toArray(new Integer[0]); // Convert to array for easy printing
        Arrays.sort(result); // Sort in ascending order (optional, if you need a specific order). Descending would be Arrays.sort(result, Collections.reverseOrder());
        System.out.print("K Largest Elements: ");
        for(int num : result){
            System.out.print(num + " ");
        }
        System.out.println();



    }
}
