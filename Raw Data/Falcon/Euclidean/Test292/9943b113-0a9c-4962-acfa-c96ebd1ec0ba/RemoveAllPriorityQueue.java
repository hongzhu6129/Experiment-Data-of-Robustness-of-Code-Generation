import java.util.PriorityQueue;

public class RemoveAllPriorityQueue {

    public static void main(String[] args) {
        // Create a Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the Priority Queue
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);

        System.out.println("Original Priority Queue: " + pq);

        // Remove all elements from the Priority Queue
        pq.clear();

        System.out.println("Priority Queue after removing all elements: " + pq);


        // Demonstrating another way to remove all elements (by repeatedly removing the head)
        // Recreate the queue for this demonstration:
        pq.add(10);
        pq.add(20);
        pq.add(30);


        System.out.println("Recreated Priority Queue: " + pq);
        while (!pq.isEmpty()) {
            pq.poll(); //Removes the head of the queue
        }
        System.out.println("Priority Queue after removing elements using poll(): " + pq);

    }
}
