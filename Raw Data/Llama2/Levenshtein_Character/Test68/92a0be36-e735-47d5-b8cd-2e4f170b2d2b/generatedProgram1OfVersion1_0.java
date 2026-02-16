import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k); 

        arr = new int[]{11, 2, 7, 9, 3, 5, 50, 6};
        k = 4;
        findKLargest(arr, k);

        arr = new int[]{1, 23};
        k=3; //k larger than array size
        findKLargest(arr, k);
    }

    public static void findKLargest(int[] arr, int k) {
        if (k <= 0) {
            System.out.println("k must be a positive integer.");
            return;
        }
        
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }


        if (k > arr.length) {
           k = arr.length; //Handle cases where k is larger than the array size.  Print all elements as the largest
            System.out.println("k is larger than the array size. Returning all elements.");
        }


        // Using a min-heap (PriorityQueue in Java) to efficiently find k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num); //Add element to heap
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove smallest if heap size exceeds k
            }
        }

        // Convert heap to array for sorted output (optional):
        Integer[] kLargestArray = minHeap.toArray(new Integer[0]);
        Arrays.sort(kLargestArray, (a, b) -> b - a); //Sort in descending

        System.out.print("The " + k + " largest elements are: ");
        for (int num : kLargestArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
