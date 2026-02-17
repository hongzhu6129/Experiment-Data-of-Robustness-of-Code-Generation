import java.util.PriorityQueue;

public class PriorityQueueFirstElement {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers (you can change the type as needed)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.offer(5);
        pq.offer(1);
        pq.offer(10);
        pq.offer(3);

        // Retrieve the first element (smallest element in a min-heap)
        if (!pq.isEmpty()) {  // Check if the queue is empty before peeking
            Integer firstElement = pq.peek();
            System.out.println("First element (without removing): " + firstElement);


            Integer removedFirst = pq.poll(); // Removes and returns the first element
            System.out.println("First element (removed): " + removedFirst);

            System.out.println("Remaining elements in the queue: " + pq);
        } else {
            System.out.println("The priority queue is empty.");
        }

        // Example with Strings (natural ordering)
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.offer("apple");
        stringPQ.offer("banana");
        stringPQ.offer("cherry");

        if (!stringPQ.isEmpty()) {
            String firstString = stringPQ.peek();
            System.out.println("First string (without removing): " + firstString);

            String removedFirstString = stringPQ.poll();
            System.out.println("First String (removed): " + removedFirstString);


            System.out.println("Remaining strings in the queue: " + stringPQ);
        } else {
             System.out.println("The string priority queue is empty.");
        }


    }
}
