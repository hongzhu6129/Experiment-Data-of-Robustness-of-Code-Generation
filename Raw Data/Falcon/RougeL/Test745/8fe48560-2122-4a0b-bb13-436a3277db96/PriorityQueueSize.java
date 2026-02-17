import java.util.PriorityQueue;

public class PriorityQueueSize {

    public static void main(String[] args) {

        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(5);
        pq.offer(15);

        // Get the number of elements (size) of the PriorityQueue
        int size = pq.size();

        // Print the size
        System.out.println("The size of the PriorityQueue is: " + size); 
    }
}
