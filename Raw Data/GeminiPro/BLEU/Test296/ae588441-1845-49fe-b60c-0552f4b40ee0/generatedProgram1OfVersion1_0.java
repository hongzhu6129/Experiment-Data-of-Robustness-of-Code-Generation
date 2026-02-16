import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);


        int[] arr2 = {11, 5, 12, 7, 19, 2, 3, 21};
        int k2 = 4;
        findKLargest(arr2, k2);

        //Edge Cases
        int[] arr3 = {}; // Empty array
        int k3 = 2;
        findKLargest(arr3, k3);

        int[] arr4 = {1, 2, 3}; // k larger than array size
        int k4 = 5;
        findKLargest(arr4, k4);

    }

    public static void findKLargest(int[] arr, int k) {

        if(arr == null || arr.length == 0) {
            System.out.println("The array is empty. No largest elements can be found.");
            return;
        }


        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k. k should be between 1 and the array length.");
            return; // Or handle this case appropriately, e.g., throw an exception
        }

        // Use a min-heap (PriorityQueue) to store the k largest elements.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            if (minHeap.size() < k) {
                minHeap.offer(num); // Add element to the heap if it's not full
            } else if (num > minHeap.peek()) { // If the current element is larger than the smallest element in the heap
                minHeap.poll(); // Remove the smallest element
                minHeap.offer(num); // Add the current element
            }
        }

        // Convert the heap to an array and sort in descending order (optional, for a nicely ordered output)
        Integer[] kLargest = minHeap.toArray(new Integer[0]);
        Arrays.sort(kLargest, (a, b) -> b - a); // Sort in descending order

        System.out.print("The " + k + " largest elements are: ");
        for (int num : kLargest) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
