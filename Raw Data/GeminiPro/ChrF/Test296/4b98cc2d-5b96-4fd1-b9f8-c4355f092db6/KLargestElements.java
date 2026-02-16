import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);

        arr = new int[]{11, 2, 7, 45, 3, 67, 1};
        k = 2;
        findKLargest(arr, k);


        arr = new int[]{5,10,2,15,20,1,30};
        k=4;
        findKLargest(arr,k);

         // Test case with k greater than array length
        arr = new int[]{1, 2, 3};
        k = 5;
        findKLargest(arr, k);

         // Test with empty array
        arr = new int[0];
        k = 2;
        findKLargest(arr, k);
        


    }



    public static void findKLargest(int[] arr, int k) {

        if (arr == null || arr.length == 0) {
            System.out.println("The array is empty. Cannot find k largest elements.");
            return; 
        }

        if (k <= 0) {
            System.out.println("k must be a positive integer.");
            return;
        }

        if (k > arr.length) {
           k = arr.length; // Adjust k to the maximum possible value (array length)
           System.out.println("k is larger than array length. Finding all elements in array.");
        }


        // Use a min-heap (PriorityQueue in Java) to store the k largest elements.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();


        for (int num : arr) {
            if (minHeap.size() < k) {
                minHeap.offer(num);  //Add element if heap size is less than k
            } else if (num > minHeap.peek()) { //If current element greater than the smallest element in the heap
                minHeap.poll();        //Remove the smallest 
                minHeap.offer(num);    // Add current 
            }
        }

        // Convert the min-heap to an array and sort it in descending order
        int[] kLargest = new int[minHeap.size()];
        for (int i = 0; i < kLargest.length; i++) {
            kLargest[i] = minHeap.poll();
        }

        // Print the k largest elements.
        System.out.print("The " + k + " largest elements are: [");
        for (int i = kLargest.length - 1; i >= 0; i--) {
            System.out.print(kLargest[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
