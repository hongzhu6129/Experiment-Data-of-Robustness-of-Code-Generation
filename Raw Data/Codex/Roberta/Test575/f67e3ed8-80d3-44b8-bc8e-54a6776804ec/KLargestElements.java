import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        arr = new int[]{11, 5, 2, 77, 22, 33, 55, 99, 100, 66};
        k = 5;
        findKLargest(arr, k);


        arr = new int[]{7, 4, 6, 3, 9, 1};  // Example with duplicates
        k = 2;
        findKLargest(arr,k);


        // Edge case: k larger than array size
        arr = new int[]{1, 2, 3};
        k = 5;
        findKLargest(arr, k);

        // Edge case: Empty Array
        arr = new int[]{};
        k=2;
        findKLargest(arr,k);


    }

    public static void findKLargest(int[] arr, int k) {

        if (arr == null || arr.length == 0) {
            System.out.println("Invalid input: Empty or null array.");
            return;
        }

        if (k <= 0) {
            System.out.println("Invalid input: k must be a positive integer.");
            return;
        }
        
        if (k > arr.length){
            System.out.println("Invalid Input: k cannot be larger than the array size.");
            return;
        }




        // Using a min-heap (PriorityQueue) to efficiently track the k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k
            }
        }

        // Convert the min-heap to an array and print the k largest elements
        Integer[] kLargest = minHeap.toArray(new Integer[0]);
        System.out.println("The " + k + " largest elements are: " + Arrays.toString(kLargest));

    }
}
