import java.util.PriorityQueue;

public class PriorityQueueSize {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(30);
        pq.add(5);

        // Get the number of elements using size()
        int size = pq.size();

        // Print the size
        System.out.println("The size of the priority queue is: " + size); 
    }
}
