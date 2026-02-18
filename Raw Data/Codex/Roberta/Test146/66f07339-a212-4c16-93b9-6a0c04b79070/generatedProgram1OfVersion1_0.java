import java.util.PriorityQueue;

public class CountPriorityQueueElements {

    public static void main(String[] args) {

        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.offer(5);
        pq.offer(2);
        pq.offer(8);
        pq.offer(1);
        pq.offer(9);
        pq.offer(4);


        // Count the number of elements using the size() method
        int count = pq.size();

        // Print the count
        System.out.println("Number of elements in the PriorityQueue: " + count); 
    }
}
