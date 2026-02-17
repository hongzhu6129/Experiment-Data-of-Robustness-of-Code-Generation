import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a PriorityQueue of Strings
        PriorityQueue<String> colorQueue = new PriorityQueue<>();

        // Add some colors
        colorQueue.add("Red");
        colorQueue.add("Green");
        colorQueue.add("Blue");
        colorQueue.add("Yellow");
        colorQueue.add("Orange");

        // Print the elements of the priority queue
        System.out.println("Elements of the priority queue:");
        
        // Method 1: Iterate and remove (destructive)
        // While this approach clears the queue, it demonstrates how to retrieve elements
        // in their natural order (for Strings, lexicographical).
        // If preserving the queue is needed, use method 2.

        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll());  // poll() retrieves and removes the head
        }

        // Method 2: Iterate without removing (non-destructive). Requires Java 8+
        // This preserves the queue. If you need ordered retrieval *and* to keep the queue intact,
        // this is the preferred way.  Requires adding elements again as method 1 empties the queue.
        // Re-add elements:
        colorQueue.add("Red");
        colorQueue.add("Green");
        colorQueue.add("Blue");
        colorQueue.add("Yellow");
        colorQueue.add("Orange");


        System.out.println("\nElements without removing (Java 8+):");
        colorQueue.forEach(System.out::println);



    }
}
