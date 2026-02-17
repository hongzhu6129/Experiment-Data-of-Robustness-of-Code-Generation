import java.util.PriorityQueue;

public class PriorityQueueInsertion {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers (you can change the type as needed)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Insert elements into the PriorityQueue
        pq.offer(5);
        pq.offer(1);
        pq.offer(10);
        pq.offer(3);


        // Insert a particular element (e.g., 7)
        int elementToInsert = 7;
        pq.offer(elementToInsert);


        // Print the PriorityQueue elements (order is not guaranteed for printing)
        System.out.println("PriorityQueue elements: " + pq);


        // Demonstrate retrieval (elements are retrieved in order of priority - smallest first for default Integer priority)
        System.out.print("Elements retrieved in priority order: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); 
        }
    }
}
