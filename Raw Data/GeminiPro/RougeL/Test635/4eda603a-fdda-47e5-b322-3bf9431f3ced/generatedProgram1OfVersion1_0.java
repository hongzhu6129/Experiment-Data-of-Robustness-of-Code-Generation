import java.util.PriorityQueue;

public class PriorityQueueSize {

    public static void main(String[] args) {

        // Create a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add some elements
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        // Get the size of the priority queue
        int size = pq.size();

        // Print the size
        System.out.println("The size of the priority queue is: " + size);
    }
}
