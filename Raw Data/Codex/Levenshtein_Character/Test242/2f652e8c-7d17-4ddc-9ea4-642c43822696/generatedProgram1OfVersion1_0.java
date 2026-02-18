import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        arr = new int[]{11, 5, 22, 1, 9, 15};
        k = 2;
        findKLargest(arr, k);
        
        //Test case with duplicates
        arr = new int[]{11, 5, 22, 1, 9, 15, 22};
        k=3;
        findKLargest(arr,k);

         //Test case with negative numbers
        arr = new int[]{-11, 5, -22, 1, -9, 15, -22};
        k=3;
        findKLargest(arr,k);

         // Test case where k is larger than array length (should return whole array)
        arr = new int[]{1, 2, 3};
        k = 5;
        findKLargest(arr, k);

         // Test case with empty array
        arr = new int[]{};
        k = 2;
        findKLargest(arr, k);
    }

    public static void findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        if (k <= 0) {
             System.out.println("k must be a positive integer.");
             return;       
        }
        

        // Using a min-heap (PriorityQueue in Java) to efficiently find the k largest elements.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num); // Add the element to the heap

            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k
            }
        }

        // Print the k largest elements (which are now in the min-heap)
        Integer[] result = minHeap.toArray(new Integer[0]);
        Arrays.sort(result);  // Sort before output for predictable order
        Arrays.stream(result).forEach(i -> System.out.print(i + " "));
        System.out.println(); //New line for next output


    }
}
