import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;

        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k");
            return;
        }


        // Method 1: Using Sorting (O(n log n)) -  Good for larger k or if sorted array is also needed.
        int[] arrCopy = Arrays.copyOf(arr, arr.length); // Avoid modifying original array
        Arrays.sort(arrCopy);
        System.out.print("K Largest elements (using sorting): ");
        for (int i = arrCopy.length - k; i < arrCopy.length; i++) {
            System.out.print(arrCopy[i] + " ");
        }
        System.out.println();



        // Method 2: Using a Min-Heap (Priority Queue) (O(n log k)) -  More efficient for smaller k.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();  // Remove the smallest element if heap size exceeds k
            }
        }

        System.out.print("K Largest elements (using min-heap): ");
        Integer[] kLargest = minHeap.toArray(new Integer[0]); // toArray method takes an array to store to, but if the supplied array is not big enough, it creates and returns a new one.
        for (int num : kLargest) { //Enhanced for loop avoids IndexOutOfBoundsException because it accesses elements only within the array's bounds.
            System.out.print(num + " ");
        }
        System.out.println();


         // Example Usage with User Input (inside main method)
        int[] arr2 = {7, 10, 4, 3, 20, 15};
        int k2 = 4;
        printKLargest(arr2, k2); // Call the method with user-provided array and k


    }


    // Helper method (if you want to reuse the Min-Heap logic)
    public static void printKLargest(int[] arr, int k) {
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of k");
            return;
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }

        System.out.print("K Largest elements: ");
        while (!minHeap.isEmpty()) { // Directly use the queue's iterator
            System.out.print(minHeap.poll() + " ");  // poll removes and returns
        }
        System.out.println();
    }
}

