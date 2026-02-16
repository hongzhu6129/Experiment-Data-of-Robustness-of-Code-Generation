import java.util.PriorityQueue;

public class RemoveAllPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add some elements
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);
        pq.add(25);

        System.out.println("Original PriorityQueue: " + pq);

        // Remove all elements from the PriorityQueue
        pq.clear(); 

        System.out.println("PriorityQueue after removing all elements: " + pq);
    }
}
