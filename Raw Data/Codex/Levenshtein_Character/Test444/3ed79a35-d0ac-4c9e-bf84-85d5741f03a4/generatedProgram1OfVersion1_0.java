import java.util.Arrays;
import java.util.PriorityQueue;

public class KSmallestElements {

    public static void main(String[] args) {
        int[] originalArray = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;

        System.out.println("Original array: " + Arrays.toString(originalArray));

        // Using a max-heap (PriorityQueue in reverse order) to find the k smallest elements efficiently
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int num : originalArray) {
            maxHeap.offer(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // Remove the largest element if the heap size exceeds k
            }
        }

        // Convert the heap to an array for printing (optional)
        int[] kSmallest = new int[k];
        for (int i = k - 1; i >= 0; i--) { // Fill from the end to maintain order
            kSmallest[i] = maxHeap.poll(); 
        }

        System.out.print(k + " smallest elements of the said array are: ");
        for (int num : kSmallest) {
            System.out.print(num + " ");
        }
        System.out.println();



        // Example to find k Largest elements (as in problem description output example).  Just reverse comparison in PriorityQueue.
        k = 3; // Reset k if needed
        System.out.println("Original array: " + Arrays.toString(originalArray));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Default is min-heap

        for (int num : originalArray) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove smallest if size exceeds k
            }
        }


        System.out.print(k + " largest elements of the said array are: ");
        Integer[] kLargest = minHeap.toArray(new Integer[0]); // Efficiently get elements
        Arrays.sort(kLargest, (a,b) -> b - a); // Sort in descending order (largest first)


        for(int num: kLargest){
            System.out.print(num + " ");
        }
        System.out.println();


    }
}
