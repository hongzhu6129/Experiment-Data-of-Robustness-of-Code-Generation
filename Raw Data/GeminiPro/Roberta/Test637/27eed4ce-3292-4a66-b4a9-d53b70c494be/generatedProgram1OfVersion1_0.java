import java.util.PriorityQueue;

public class PriorityQueueFirstElement {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        pq.add(9);

        // Retrieve and print the first element (smallest)
        if (!pq.isEmpty()) {
            Integer firstElement = pq.peek(); // peek() retrieves without removing
            System.out.println("First element (smallest): " + firstElement);


            // Example of removing and retrieving:
             Integer removedElement = pq.poll(); // poll() retrieves and removes
             System.out.println("Removed element: " + removedElement);
             System.out.println("PriorityQueue after removal: " + pq);



        } else {
            System.out.println("PriorityQueue is empty.");
        }
    }
}
