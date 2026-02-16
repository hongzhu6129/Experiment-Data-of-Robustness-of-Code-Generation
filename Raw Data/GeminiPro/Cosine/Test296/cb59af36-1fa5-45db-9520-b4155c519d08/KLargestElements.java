import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        arr = new int[]{11, 5, 22, 1, 9, 15, 7};  // Example 2
        k = 2;
        findKLargest(arr, k);

        arr = new int[]{4, 4, 4, 4, 4}; // Example with duplicates
        k = 3;
        findKLargest(arr,k);


        arr = new int[]{}; // Example with an empty array
        k = 2;
        findKLargest(arr,k);


        arr = new int[]{1, 2, 3};
        k = 0; // Example with k = 0
        findKLargest(arr,k);

        arr = new int[]{1, 2, 3};
        k = 5;  // Example where k is larger than array size
        findKLargest(arr,k);
    }


    public static void findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty. Cannot find k largest elements.");
            return;
        }

        if (k <= 0) {
            System.out.println("k must be a positive integer.");
            return;
        }

        if (k > arr.length) {
             k = arr.length; // Adjust k if it's larger than the array size to avoid errors. And print all elements as the k largest.
        }


        // Use a min-heap (PriorityQueue in Java) to store the k largest elements seen so far.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);  // Add the number to the heap

            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k
            }
        }


        // Print the k largest elements (which are now in the min-heap)
        Integer[] kLargestArray = minHeap.toArray(new Integer[0]);
        Arrays.sort(kLargestArray); // Sort for consistent output
        System.out.print("The " + k + " largest elements are: ");
        for (int num : kLargestArray) {
            System.out.print(num + " ");
        }
        System.out.println();


    }
}
