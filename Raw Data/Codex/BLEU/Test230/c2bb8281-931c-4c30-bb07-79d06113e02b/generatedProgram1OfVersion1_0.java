import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueIteration {

    public static void main(String[] args) {

        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(3);
        pq.add(7);


        System.out.println("Iterating through PriorityQueue using Iterator:");

        // Method 1: Using an Iterator (Recommended - Doesn't modify original queue)
        Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); 
        }
        System.out.println();  // Newline


        System.out.println("\nIterating through PriorityQueue by repeatedly removing the head (poll()):");

        // Method 2: Repeatedly removing the head (poll()).  Destructive! Changes the queue
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(pq); // Create a copy to avoid modifying the original
        while (!pq2.isEmpty()) {
            System.out.print(pq2.poll() + " ");
        }
        System.out.println(); // Newline


        System.out.println("\nIterating through PriorityQueue using toArray() and enhanced for loop:");

        // Method 3: Convert to Array & Enhanced For Loop
        // Useful if you need indexed access or want to process elements multiple times without modifying the queue.

        Integer[] arr = pq.toArray(new Integer[0]); // toArray(new Integer[0]) is the preferred way for type safety.
        for (Integer element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();


        System.out.println("\nOriginal PriorityQueue (unchanged by iterator and toArray()): " + pq);


        System.out.println("\npq2 (modified by poll()): " + pq2); // pq2 will be empty because we polled all elements



    }
}
