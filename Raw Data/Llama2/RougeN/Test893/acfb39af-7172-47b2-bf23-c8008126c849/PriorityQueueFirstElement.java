import java.util.PriorityQueue;

public class PriorityQueueFirstElement {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers (you can use any comparable type)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add some elements to the PriorityQueue
        pq.offer(3);
        pq.offer(1);
        pq.offer(4);
        pq.offer(2);

        // Retrieve and print the first element (smallest in this case, as it's a min-heap by default)
        if (!pq.isEmpty()) {
            Integer firstElement = pq.peek();  // peek() retrieves without removing
            System.out.println("First element (smallest): " + firstElement);

            // Alternatively, use poll() to retrieve and remove the first element
            // firstElement = pq.poll(); 
            // System.out.println("First element (removed): " + firstElement);


        } else {
            System.out.println("PriorityQueue is empty.");
        }

      
    }
}
