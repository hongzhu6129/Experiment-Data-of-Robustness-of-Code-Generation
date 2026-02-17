import java.util.PriorityQueue;

public class RetrieveFirstElementPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(3);
        pq.add(1);
        pq.add(4);
        pq.add(2);

        // Check if the PriorityQueue is empty
        if (pq.isEmpty()) {
            System.out.println("PriorityQueue is empty");
        } else {
            // Retrieve the first element (smallest element) without removing it
            Integer firstElement = pq.peek(); 

            if (firstElement != null) {
                System.out.println("First element: " + firstElement);
            }

            // You could also remove and retrieve the first element using poll()
            // Integer removedElement = pq.poll();
            // if (removedElement != null) {
            //    System.out.println("Removed first element: " + removedElement);
            // }
        }
    }
}
