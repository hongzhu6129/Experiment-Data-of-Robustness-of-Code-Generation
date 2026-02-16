import java.util.LinkedList;
import java.util.Queue;

public class CountQueueElements {

    public static void main(String[] args) {
        // Create a queue (using LinkedList as an implementation)
        Queue<Integer> queue = new LinkedList<>();

        // Add some elements to the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        // Get the size of the queue
        int size = queue.size();

        // Print the size
        System.out.println("The number of elements in the queue is: " + size);


        //Demonstrate what happens if we attempt to add a null element to the queue (LinkedList Implementation).
        try {
            queue.offer(null); // This will throw a NullPointerException in more recent Java versions.

        } catch (NullPointerException e) {
            System.out.println("Attempting to add null resulted in a NullPointerException.");
        }



        // Demonstrating counting elements with nulls allowed (using a specific queue implementation that allows nulls).
        Queue<Integer> nullAllowingQueue = new LinkedList<>(); // LinkedList allows nulls, but some other implementations may not.

        nullAllowingQueue.offer(1);
        nullAllowingQueue.offer(null); // Note: Some Queues may not allow null. Check the documentation.
        nullAllowingQueue.offer(3);

        System.out.println("Size of queue allowing nulls: " + nullAllowingQueue.size());  // This will correctly report the size, including null elements.

    }
}
