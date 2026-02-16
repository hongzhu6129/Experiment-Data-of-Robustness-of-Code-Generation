import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        arr = new int[]{11, 5, 2, 7, 15, 8}; // Example 2
        k = 4;
        findKLargest(arr, k);


        arr = new int[]{1}; // Edge Case: array with one element.
        k = 1;
        findKLargest(arr, k);


        arr = new int[]{5, 4, 3, 2, 1}; // Edge case: k is the size of the array.
        k = 5;
        findKLargest(arr, k);



        arr = new int[]{5, 4, 3, 2, 1}; // Edge case: k is larger than array size (invalid).
        k = 6;
        findKLargest(arr, k);
        
        // Edge case: empty array
        arr = new int[]{};
        k = 2;
        findKLargest(arr,k);


    }


    public static void findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            System.out.println("Invalid input: Empty array.");
            return;
        }

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid input: k should be between 1 and array length.");
            return;
        }

        // Use a min-heap (PriorityQueue in Java) to store the k largest elements.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k.
            }
        }

        // The elements remaining in the minHeap are the k largest elements.
        Integer[] kLargest = minHeap.toArray(new Integer[0]);
        Arrays.sort(kLargest); // Optional: Sort the result if required in ascending order
        System.out.print("The " + k + " largest elements are: [");
        for (int i = 0; i < kLargest.length; i++) {
            System.out.print(kLargest[i]);
            if (i < kLargest.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
