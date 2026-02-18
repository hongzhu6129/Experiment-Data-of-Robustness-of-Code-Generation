import java.util.Queue;
import java.util.LinkedList;

public class QueueSize {

    public static void main(String[] args) {
        // Create a queue (using LinkedList as an implementation)
        Queue<Integer> queue = new LinkedList<>();

        // Add some elements to the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);


        // Count the number of elements using queue.size()
        int size = queue.size();

        // Print the size
        System.out.println("The number of elements in the queue is: " + size); 
    }
}
