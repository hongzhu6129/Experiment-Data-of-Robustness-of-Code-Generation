import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        arr = new int[]{11, 5, 20, 7, 15};
        k = 2;
        findKLargest(arr, k);


        arr = new int[]{1,1,1,2,2,3};
        k=2;
        findKLargest(arr,k);

         arr = new int[]{3,2,3,1,2,4,5,5,6};
         k=4;
         findKLargest(arr,k);

    }

    public static void findKLargest(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid k value.");
            return;
        }

        // Use a min-heap (PriorityQueue in Java) to efficiently track the k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num); // Add the element to the heap

            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k
            }
        }

        // Print the k largest elements (which are now in the min-heap)
        Integer[] kLargestArray = minHeap.toArray(new Integer[0]);
        Arrays.sort(kLargestArray, (a,b)->b-a); //Sort in Descending order
        System.out.print("K Largest Elements: ");
        for (int num : kLargestArray) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
