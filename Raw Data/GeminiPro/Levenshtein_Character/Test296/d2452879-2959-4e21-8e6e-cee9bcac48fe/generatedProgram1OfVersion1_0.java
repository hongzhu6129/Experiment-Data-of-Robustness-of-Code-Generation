import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);


        // Another example:
        int[] arr2 = {11, 5, 22, 1, 77, 4, 9, 53};
        int k2 = 4;
        findKLargest(arr2, k2);


         // Edge case: k is larger than the array size
        int[] arr3 = {1, 2, 3};
        int k3 = 5;
        findKLargest(arr3, k3);


         // Edge case: Empty array
        int[] arr4 = {};
        int k4 = 2;
        findKLargest(arr4, k4);
    }

    public static void findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty. No largest elements to find.");
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


        // Method 1: Using a Min-Heap (Priority Queue)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element if the heap size exceeds k
            }
        }

        Integer[] kLargestArray = minHeap.toArray(new Integer[0]);  // Convert to array for easy printing


        System.out.print("The " + k + " largest elements using Min-Heap are: ");
        for (int num : kLargestArray) {
            System.out.print(num + " ");
        }
        System.out.println();


       // Method 2: Sorting (Less Efficient) For Demonstration
        Arrays.sort(arr);
        System.out.print("The " + k + " largest elements using Sorting are: ");

        for(int i = arr.length - 1; i >= arr.length-k ;i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();




    }
}
