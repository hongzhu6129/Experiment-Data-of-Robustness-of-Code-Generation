import java.util.PriorityQueue;

public class PeekPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(5);
        pq.add(1);
        pq.add(10);
        pq.add(3);

        // Retrieve the top element (smallest in this case, as it's a min-heap by default)
        Integer topElement = pq.peek();

        // Check if the queue is empty before attempting to peek
        if (topElement != null) {
            System.out.println("Top element: " + topElement);
        } else {
            System.out.println("The priority queue is empty.");
        }

        // Example of how to specify a comparator for max-heap behavior
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a); // Reverse comparison for max-heap

        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(10);
        maxHeap.add(3);


        Integer topElementMaxHeap = maxHeap.peek();

        if (topElementMaxHeap != null) {
            System.out.println("Top element (max-heap): " + topElementMaxHeap);
        } else {
            System.out.println("The max-heap priority queue is empty.");

        }

        // Example with Strings (natural ordering)
        PriorityQueue<String> stringPQ = new PriorityQueue<>();
        stringPQ.add("apple");
        stringPQ.add("banana");
        stringPQ.add("orange");

        String topString = stringPQ.peek();

        if (topString != null) {
            System.out.println("Top string: " + topString);
        } else {
            System.out.println("The string priority queue is empty.");
        }
    }
}
