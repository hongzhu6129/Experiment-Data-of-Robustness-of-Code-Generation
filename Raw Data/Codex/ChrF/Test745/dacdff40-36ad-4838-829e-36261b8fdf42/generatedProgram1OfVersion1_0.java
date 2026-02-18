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

        System.out.println("Original PriorityQueue: " + pq);

        // Remove all elements using clear()
        pq.clear();

        System.out.println("PriorityQueue after clear(): " + pq);


        //Alternative method using removeAll() - less efficient but demonstrates the principle
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(10);
        pq2.add(20);
        pq2.add(15);
        pq2.add(5);

        System.out.println("Original PriorityQueue 2: " + pq2);

        pq2.removeAll(pq2); // Removes all elements present in itself

        System.out.println("PriorityQueue 2 after removeAll(): " + pq2);


    }
}
