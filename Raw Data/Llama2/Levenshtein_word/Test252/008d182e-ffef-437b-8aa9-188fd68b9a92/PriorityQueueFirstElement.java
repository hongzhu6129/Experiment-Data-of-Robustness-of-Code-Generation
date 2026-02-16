import java.util.PriorityQueue;

public class PriorityQueueFirstElement {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(3);
        pq.add(1);
        pq.add(4);
        pq.add(2);

        // Check if the PriorityQueue is empty
        if (!pq.isEmpty()) {
            // Retrieve the first element (smallest element in a min-heap)
            Integer firstElement = pq.peek(); // peek() retrieves without removing

            // Print the first element
            System.out.println("First element (smallest): " + firstElement);


            // Example of removing the first element (if needed)
            Integer removedElement = pq.poll(); // poll() retrieves and removes
            System.out.println("Removed element: " + removedElement);
            System.out.println("PriorityQueue after removal: " + pq);


        } else {
            System.out.println("PriorityQueue is empty.");
        }
    }
}
