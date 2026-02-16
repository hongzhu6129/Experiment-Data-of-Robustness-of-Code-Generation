import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        // Example 2 with duplicates
        int[] arr2 = {5, 5, 3, 1, 7, 7, 9, 2, 2};
        int k2 = 4;
        findKLargest(arr2, k2);

        //Example 3 with k larger than array size.
        int[] arr3 = {1, 2, 3};
        int k3 = 5;
        findKLargest(arr3,k3);

        // Example 4 with an empty array
        int[] arr4 = {};
        int k4 = 2;
        findKLargest(arr4, k4);

        // Example 5 with a negative k
        int[] arr5 = {1,2,3,4,5};
        int k5 = -1;
        findKLargest(arr5,k5);

    }


    public static void findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            System.out.println("Input array is empty. No largest elements to find.");
            return;
        }

        if (k <= 0) {
            System.out.println("k must be a positive integer.");
            return;
        }


        int n = arr.length;
        if(k > n){
            k = n;  //Handle cases where k is larger than array size.  Just return all elements.
            System.out.println("k is larger than the array size. Returning all elements as the largest.");
        }

        // Method 1: Using a Min-Heap (Priority Queue) - Most Efficient for large datasets
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove smallest element if heap size exceeds k
            }
        }
        Integer[] result = minHeap.toArray(new Integer[0]);  // Convert to array for easier printing

        System.out.print("The " + k + " largest elements are (using Min-Heap): ");
        Arrays.stream(result).forEach(i -> System.out.print(i + " "));
        System.out.println();


        // Method 2: Using Sorting - Simpler to understand but less efficient for very large arrays

        Arrays.sort(arr);  // Sort in ascending order

        System.out.print("The " + k + " largest elements are (using sorting): ");
        for (int i = n - 1; i >= n - k; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");



    }

}
