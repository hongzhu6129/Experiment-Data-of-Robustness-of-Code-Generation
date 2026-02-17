import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);  // Output: 50 30 23

        int[] arr2 = {11, 5, 22, 1, 15, 7};
        int k2 = 2;
        findKLargest(arr2, k2); // Output: 22 15


        //Edge cases:
        int[] arr3 = {1};
        int k3 = 2; // k > array size
        findKLargest(arr3, k3); // Output: 1


        int[] arr4 = {}; //Empty Array
        int k4 = 2;
        findKLargest(arr4, k4); //Output: No elements in the array

        int[] arr5 = {5, 2, 8, 1, 9};
        int k5 = 0; //k = 0
        findKLargest(arr5, k5); // Output: No elements to display as K=0



    }

    public static void findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            System.out.println("No elements in the array");
            return;
        }


        if (k <= 0) {
            System.out.println("No elements to display as K=0");
            return;
        }



        if(k > arr.length){
            k = arr.length; //Handle cases where k is larger than the array size. 
        }

        // Using a min-heap (PriorityQueue) to efficiently find the k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k
            }
        }

        // Convert the min-heap to an array and sort in descending order
        Integer[] kLargest = minHeap.toArray(new Integer[0]);
        Arrays.sort(kLargest, Collections.reverseOrder());


        // Print the k largest elements
        for (int i = 0; i < kLargest.length; i++) {
            System.out.print(kLargest[i] + " ");
        }
        System.out.println(); //New line after each test case output
    }
}
