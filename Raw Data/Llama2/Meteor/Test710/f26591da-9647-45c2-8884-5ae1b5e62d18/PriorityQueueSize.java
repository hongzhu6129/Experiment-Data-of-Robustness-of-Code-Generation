import java.util.PriorityQueue;

public class PriorityQueueSize {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add some elements
        pq.offer(5);
        pq.offer(1);
        pq.offer(10);
        pq.offer(3);
        pq.offer(7);

        // Get the number of elements (forms) in the PriorityQueue
        int size = pq.size();

        // Print the size
        System.out.println("The number of forms in the priority queue is: " + size);


        //Example with Strings (forms could be represented as strings)
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.add("Form A");
        stringPQ.add("Form C");
        stringPQ.add("Form B");

        System.out.println("Number of string forms: " + stringPQ.size());

    }
}
