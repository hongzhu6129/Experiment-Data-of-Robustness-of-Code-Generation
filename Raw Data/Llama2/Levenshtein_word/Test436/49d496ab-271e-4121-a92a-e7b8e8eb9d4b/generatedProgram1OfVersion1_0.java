import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueToArray {

    public static void main(String[] args) {
        // Example PriorityQueue (you can replace this with your actual PriorityQueue)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(8);
        priorityQueue.add(3);
        priorityQueue.add(6);

        // Method 1: Using toArray() with a pre-allocated array
        Integer[] array1 = new Integer[priorityQueue.size()];
        priorityQueue.toArray(array1); 
        System.out.println("Method 1: " + Arrays.toString(array1)); // Output might not be sorted

        //Method 2: Using toArray() with a generic type parameter
        Integer[] array2 = priorityQueue.toArray(new Integer[0]);
        System.out.println("Method 2: " + Arrays.toString(array2)); // Output might not be sorted

        // Method 3: Iterating and adding to an ArrayList (preserves order if needed)
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Note:  This approach does *not* poll (remove) elements from the priority queue.
        for (Integer element : priorityQueue) {  
            arrayList.add(element);
        }
        Integer[] array3 = arrayList.toArray(new Integer[0]);
        System.out.println("Method 3 (preserves iteration order): " + Arrays.toString(array3)); 

         // Method 4: Polling elements into an array (removes elements from the queue)
         // If order doesn't matter, you could convert the priority queue to an array by
         // repeatedly calling poll(). This would empty the queue, though.

        Integer[] array4 = new Integer[priorityQueue.size()];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = priorityQueue.poll(); // Removes elements from the queue!
        }
        System.out.println("Method 4 (polling, queue is now empty): " + Arrays.toString(array4));  // Sorted ascending



        //Example for a different data type (String)
         PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>();
         stringPriorityQueue.add("apple");
         stringPriorityQueue.add("banana");
         stringPriorityQueue.add("orange");

         String[] stringArray = stringPriorityQueue.toArray(new String[0]);
         System.out.println("String PriorityQueue to Array: " + Arrays.toString(stringArray));

    }
}
