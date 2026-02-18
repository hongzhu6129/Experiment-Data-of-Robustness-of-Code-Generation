import java.util.PriorityQueue;
import java.util.Arrays;

public class PriorityQueueToArray {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(8);
        priorityQueue.add(3);
        priorityQueue.add(6);

        // Method 1: Using toArray() with a pre-allocated array
        Integer[] array1 = new Integer[priorityQueue.size()];
        priorityQueue.toArray(array1);
        System.out.println("Array 1 (pre-allocated): " + Arrays.toString(array1));


        // Method 2: Using toArray() without a pre-allocated array (less efficient)
        Object[] array2 = priorityQueue.toArray(); // Returns an Object[]
        Integer[] array2Int = Arrays.copyOf(array2, array2.length, Integer[].class); // Convert to Integer[]
        System.out.println("Array 2 (not pre-allocated): " + Arrays.toString(array2Int));

        // Method 3: Iterating through the PriorityQueue (preserves order if needed but modifies queue)
        Integer[] array3 = new Integer[priorityQueue.size()];
        for (int i = 0; i < array3.length; i++) {
             array3[i] = priorityQueue.poll(); // poll() retrieves and removes the head
        }
        System.out.println("Array 3 (iterating - queue now empty): " + Arrays.toString(array3));


         // Repopulate the queue for demonstration of toList()
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(8);
        priorityQueue.add(3);
        priorityQueue.add(6);

    }
}
