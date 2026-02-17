import java.util.PriorityQueue;

public class PriorityQueueFirstElement {

    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(3);

        // Check if the PriorityQueue is empty
        if (!pq.isEmpty()) {
            // Retrieve the first element (smallest element) without removing it
            int firstElement = pq.peek();

            // Print the first element
            System.out.println("First element (smallest): " + firstElement);


             // Example of removing the first element:
             int removedElement = pq.poll(); 
             System.out.println("Removed element: " + removedElement); // Output: 1
             System.out.println("PriorityQueue after removal: " + pq); // Output: [3, 5, 10]



        } else {
            System.out.println("PriorityQueue is empty.");
        }
    }
}
