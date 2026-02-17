import java.util.PriorityQueue;

public class PriorityQueueInsertion {

    public static void main(String[] args) {
        // Create a PriorityQueue of integers. By default, it's a min-heap.
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Insert elements into the priority queue
        pq.offer(5);
        pq.offer(2);
        pq.offer(8);
        pq.offer(1);
        pq.offer(10);

        // Insert a new element (e.g., 7)
        int newElement = 7;
        pq.offer(newElement);


        // Print the elements in the priority queue (it will be sorted according to the natural order of integers, i.e., ascending)
        System.out.println("Priority Queue after insertion: " + pq);


        // Example using a different data type (String) and a custom Comparator for max-heap
        PriorityQueue<String> stringPQ = new PriorityQueue<>((s1, s2) -> s2.compareTo(s1)); // Max-heap comparator

        stringPQ.offer("apple");
        stringPQ.offer("banana");
        stringPQ.offer("orange");
        stringPQ.offer("grape");


        stringPQ.offer("kiwi"); // Inserting "kiwi"

        System.out.println("String Priority Queue (max-heap) after insertion: " + stringPQ);




    }
}
