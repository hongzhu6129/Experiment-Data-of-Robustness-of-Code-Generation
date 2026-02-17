import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        findKLargest(arr, k);  // Output: 50 30 23

        arr = new int[]{11, 5, 22, 17, 8};
        k = 2;
        findKLargest(arr, k); // Output: 22 17

        arr = new int[]{1,1,1,1}; // Handling duplicates
        k = 2;
        findKLargest(arr,k); // Output: 1 1

        arr = new int[0]; // Handling empty array
        k = 2;
        findKLargest(arr, k); // Output: No largest elements found.

        arr = new int[] {1, 2, 3};
        k = 4;  // Handling k larger than array size
        findKLargest(arr, k); // Output: 3 2 1

        arr = new int[] {5, 1, 8, 2, 9};
        k = 0; // Handling k=0
        findKLargest(arr,k); // Output: No largest elements found.


    }

    public static void findKLargest(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            System.out.println("No largest elements found.");
            return;
        }

        if (k > arr.length) { // If k is larger than array size, print all elements in descending order
            k = arr.length;
        }


        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove smallest element if heap size exceeds k
            }
        }

        // Print the k largest elements (which are now in the minHeap)
        Integer[] kLargestArray = minHeap.toArray(new Integer[0]);
        Arrays.sort(kLargestArray, (a, b) -> b - a); // Sort in descending order

        for(int i = 0; i < kLargestArray.length; i++){
            System.out.print(kLargestArray[i]);
            if(i < kLargestArray.length - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}



