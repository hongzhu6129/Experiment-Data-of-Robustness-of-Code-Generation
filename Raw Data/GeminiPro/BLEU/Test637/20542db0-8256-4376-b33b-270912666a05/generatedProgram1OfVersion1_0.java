import java.util.PriorityQueue;

public class PriorityQueuePeek {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(40);

        // Retrieve the first element (head) of the PriorityQueue using peek()
        Integer firstElement = pq.peek();


        if (firstElement != null) {
            System.out.println("First element of the PriorityQueue: " + firstElement);
        } else {
            System.out.println("The PriorityQueue is empty.");
        }
    }
}
