import java.util.PriorityQueue;

public class PriorityQueuePeek {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        // Retrieve the first element (the smallest) without removing it
        if (!pq.isEmpty()) { // Check if the queue is empty to avoid exceptions
            Integer firstElement = pq.peek();
            System.out.println("First element (smallest): " + firstElement); 
        } else {
            System.out.println("PriorityQueue is empty.");
        }


        // Demonstrate that peek() does not remove the element
        System.out.println("PriorityQueue after peek(): " + pq);

        // Remove and retrieve the first element
        if (!pq.isEmpty()) {
            Integer removedElement = pq.poll();
            System.out.println("Removed first element: " + removedElement);
        } else {
            System.out.println("PriorityQueue is empty."); // Handle the case where the queue is already empty
        }
        
        System.out.println("PriorityQueue after poll(): " + pq); 


    }
}
