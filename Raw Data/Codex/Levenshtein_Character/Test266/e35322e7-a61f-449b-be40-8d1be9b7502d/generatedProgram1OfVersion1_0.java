import java.util.PriorityQueue;
import java.util.Arrays;

public class PriorityQueueToArray {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(3);
        pq.add(7);

        // Method 1: Using toArray() with a pre-allocated array
        Integer[] arr1 = new Integer[pq.size()];
        pq.toArray(arr1); 
        System.out.println("Array 1 (pre-allocated): " + Arrays.toString(arr1));

        // Method 2: Using toArray() without a pre-allocated array
        Object[] arr2 = pq.toArray(); // Returns an Object array

        // Convert Object[] to Integer[] (if needed)
        Integer[] arr3 = Arrays.copyOf(arr2, arr2.length, Integer[].class);
        System.out.println("Array 2 (converted from Object array): " + Arrays.toString(arr3));


        // Method 3: Manual conversion using a loop and poll()  (Preserves priority order during conversion)
        Integer[] arr4 = new Integer[pq.size()];
        PriorityQueue<Integer> pqCopy = new PriorityQueue<>(pq); // Create a copy to avoid modifying the original queue

        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = pqCopy.poll(); // poll() retrieves and removes the head (smallest element)
        }
        System.out.println("Array 3 (using poll() - preserves priority order): " + Arrays.toString(arr4));


        // Note: Directly printing pq.toArray() will not give a meaningful representation of the elements.  You need to convert it to a specific type array or iterate as shown.
    }
}
