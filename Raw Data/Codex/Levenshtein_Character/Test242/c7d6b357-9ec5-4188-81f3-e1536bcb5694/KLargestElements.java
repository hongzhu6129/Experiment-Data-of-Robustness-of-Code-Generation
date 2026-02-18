import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k); // Output: 50 30 23


        int[] arr2 = {11, 5, 1, 77, 32, 8, 4, 55};
        int k2 = 4;
        findKLargest(arr2, k2); // Output: 77 55 32 11


        //Edge Case: k greater than array length
        int[] arr3 = {1,2,3};
        int k3 = 4;
        findKLargest(arr3, k3); // Output: 3 2 1

         //Edge Case: empty array
        int[] arr4 = {};
        int k4 = 2;
        findKLargest(arr4, k4);  // Output: No elements in the array.

         //Edge Case: k is 0
        int[] arr5 = {1,2,3};
        int k5 = 0;
        findKLargest(arr5, k5); // Output: No largest elements requested


    }

    public static void findKLargest(int[] arr, int k) {
        if(arr == null || arr.length == 0) {
            System.out.println("No elements in the array.");
            return;
        }

        if (k <= 0) {
            System.out.println("No largest elements requested");
            return;
        }

        if (k > arr.length) {
            k = arr.length; // Handle cases where k is larger than array size
        }

        // Use a min-heap (PriorityQueue) to efficiently find the k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num); //Add element to the heap
            if (minHeap.size() > k) { 
                minHeap.poll();    //Remove the smallest element if heap size exceeds k
            }
        }

        // The remaining elements in the minHeap are the k largest
        Integer[] kLargestArray = minHeap.toArray(new Integer[0]); // Convert to array for easier printing
        Arrays.sort(kLargestArray, (a, b) -> b - a);             //Sort in descending order.


        for(int i = 0; i < kLargestArray.length; i++){
            System.out.print(kLargestArray[i] + " ");
        }

        System.out.println(); //Newline for next output
    }
}
