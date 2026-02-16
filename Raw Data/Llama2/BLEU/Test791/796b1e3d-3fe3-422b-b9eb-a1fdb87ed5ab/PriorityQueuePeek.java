import java.util.PriorityQueue;

public class PriorityQueuePeek {

    public static void main(String[] args) {

        // Create a PriorityQueue of Integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        pq.add(10);

        // Retrieve the first element (smallest) without removing it using peek()
        Integer firstElement = pq.peek();

        // Print the first element
        if (firstElement != null) {
            System.out.println("The first element (smallest) of the PriorityQueue is: " + firstElement);
        } else {
            System.out.println("The PriorityQueue is empty.");
        }


        //Demonstrate the difference between peek() and poll()

        System.out.println("PriorityQueue before poll(): " + pq); // Output: [1, 2, 8, 5, 10] (or similar, order not guaranteed except for head)
        Integer polledElement = pq.poll(); // Removes and returns the head
        System.out.println("Polled element: " + polledElement); // Output: 1
        System.out.println("PriorityQueue after poll(): " + pq);  // Output: [2, 5, 8, 10] (or similar)

        // Show peek() again after the poll() operation:
        firstElement = pq.peek();
        if (firstElement != null) {
            System.out.println("The first element after poll() is: " + firstElement);
        } else {
            System.out.println("The PriorityQueue is now empty."); // This would only be the case if the queue was empty initially or contained only one element.
        }

         //Example with an empty PriorityQueue
        PriorityQueue<Integer> emptyPq = new PriorityQueue<>();
        Integer peekEmpty = emptyPq.peek();
        if(peekEmpty == null) {
            System.out.println("Peeking into an empty PriorityQueue returns null.");
        }

    }
}
