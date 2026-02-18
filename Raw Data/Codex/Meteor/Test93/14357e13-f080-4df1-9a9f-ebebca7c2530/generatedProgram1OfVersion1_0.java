import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        arr = new int[]{11, 5, 23, 1, 7, 9, 4, 2, 6};
        k = 4;
        findKLargest(arr, k);

        arr = new int[]{5, 10, 15, 2, 8, 20}; //Example with duplicates
        k=3;
        findKLargest(arr, k);


        arr = new int[]{1,2};
        k = 3; //k larger than array size
        findKLargest(arr, k);


        arr = new int[]{};
        k = 2; //Empty array
        findKLargest(arr, k);

    }

    public static void findKLargest(int[] arr, int k) {

        if (arr == null || arr.length == 0) {
            System.out.println("The array is empty. No largest elements can be found.");
            return;
        }
        
        if (k <= 0) {
            System.out.println("k must be a positive integer.");
            return;
        }


        if (k > arr.length) {
            System.out.println("k cannot be larger than the size of the array.");
            return;
        }


        // Use a min-heap (PriorityQueue in Java) to keep track of the k largest elements seen so far.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num); // Add the element to the heap

            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k
            }
        }

        // Print the k largest elements (which are now in the min-heap)
        Integer[] kLargest = minHeap.toArray(new Integer[0]); // Convert to array for easy printing
        Arrays.sort(kLargest); //Optional: Sort for output in ascending order
        System.out.print("The " + k + " largest elements are: ");
        for (int num : kLargest) {

            System.out.print(num + " ");
        }
        System.out.println();
    }


}
