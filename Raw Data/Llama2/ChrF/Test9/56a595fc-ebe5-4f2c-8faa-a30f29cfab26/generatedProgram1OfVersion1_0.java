import java.util.PriorityQueue;

public class RemoveAllFromPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add some elements
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        System.out.println("Original PriorityQueue: " + pq);

        // Remove all elements from the PriorityQueue
        pq.clear(); //  Or while (!pq.isEmpty()) { pq.poll(); }

        System.out.println("PriorityQueue after removing all elements: " + pq);


        // Demonstrating with strings
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.add("apple");
        stringPQ.add("banana");
        stringPQ.add("orange");


        System.out.println("Original String PriorityQueue: " + stringPQ);
        stringPQ.clear(); // Or while (!stringPQ.isEmpty()) { stringPQ.poll(); }
        System.out.println("String PriorityQueue after removing all elements: " + stringPQ);


    }
}
