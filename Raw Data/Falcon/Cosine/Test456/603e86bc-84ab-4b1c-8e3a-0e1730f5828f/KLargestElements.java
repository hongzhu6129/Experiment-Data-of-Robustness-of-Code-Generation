import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {1, 23, 12, 9, 30, 2, 50};
        int k1 = 3;
        findKLargest(arr1, k1); // Output: 50 30 23

        int[] arr2 = {11, 5, 27, 8, 1, 19};
        int k2 = 2;
        findKLargest(arr2, k2); // Output: 27 19


        int[] arr3 = {7,4,6,3,9,1};
        int k3 = 2;
        findKLargest(arr3,k3); //Output: 9 7

        int[] emptyArr = {};
        int k4 = 2;
        findKLargest(emptyArr, k4); // Output: No largest elements found.

        int[] arr5 = {1, 2, 3};
        int k5 = 4; // k larger than array size.
        findKLargest(arr5, k5); // Handles this gracefully
    }


    public static void findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            System.out.println("No largest elements found.");
            return;
        }

        if(k <= 0) { //Handles invalid k values (should be positive)
            System.out.println("k must be a positive integer.");
            return;
        }

        k = Math.min(k, arr.length); // Ensures k doesn't exceed array length

        // Using a Min-Heap (PriorityQueue) is efficient for this problem.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);  // Add element to the heap

            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if heap size exceeds k
            }
        }

        // Print the k largest elements (which are now in the min-heap)
        Integer[] result = minHeap.toArray(new Integer[0]);
        Arrays.sort(result, (a, b) -> b - a); // Sort in descending order


        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(" ");
            }
        }

        System.out.println(); //Newline after each test case's output
    }
}
