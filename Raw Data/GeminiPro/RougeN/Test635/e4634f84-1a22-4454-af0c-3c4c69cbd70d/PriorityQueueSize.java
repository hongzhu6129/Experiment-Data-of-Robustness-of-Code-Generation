import java.util.PriorityQueue;

public class PriorityQueueSize {

    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        // Get the number of elements using the size() method
        int size = pq.size();

        // Print the size
        System.out.println("The size of the priority queue is: " + size); 
    }
}
