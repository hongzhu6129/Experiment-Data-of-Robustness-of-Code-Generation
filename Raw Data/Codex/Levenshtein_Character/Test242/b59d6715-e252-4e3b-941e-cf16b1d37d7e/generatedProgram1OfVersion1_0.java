import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        arr = new int[]{11, 5, 12, 9, 13, 2, 5, 10};
        k = 4;
        findKLargest(arr, k);


        // Test cases demonstrating edge conditions
        arr = new int[]{1, 2, 3, 4, 5};
        k = 0;  // k = 0
        findKLargest(arr, k);

        arr = new int[]{5, 4, 3, 2, 1};
        k = 6; // k > array length
        findKLargest(arr, k);

        arr = new int[]{}; // Empty array
        k = 2;
        findKLargest(arr, k);

        arr = new int[]{1, 1, 1, 1, 1}; // Array with duplicate elements
        k = 3;
        findKLargest(arr, k);


    }


    public static void findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            System.out.println("Invalid input.  Please provide a non-null, non-empty array and a positive k value.");
            return;
        }

        if (k > arr.length) {
             System.out.println("k cannot be larger than the array size.");
            return;
        }

        // Use a min-heap (PriorityQueue in Java) to store the k largest elements.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num); // Add the element to the heap

            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k
            }
        }


        // Convert the minHeap to an array (if needed) and print the result
        Integer[] kLargestArray = minHeap.toArray(new Integer[0]);
        Arrays.sort(kLargestArray); //Sort ascending 
         
        System.out.print("K Largest Elements: [");
        for (int i = 0; i < kLargestArray.length; i++) {
             System.out.print(kLargestArray[i]);
             if (i < kLargestArray.length -1) {
                  System.out.print(", ");
             }
         }
         System.out.println("]");


    }
}
