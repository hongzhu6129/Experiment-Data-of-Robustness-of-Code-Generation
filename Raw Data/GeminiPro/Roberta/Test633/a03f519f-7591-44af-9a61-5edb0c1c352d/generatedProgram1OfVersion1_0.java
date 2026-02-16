import java.util.PriorityQueue;

public class PriorityQueueInsertion {

    public static void main(String[] args) {
        // Create a PriorityQueue of Integers (you can use other data types as well)
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // By default, this creates a min-heap

        // Add elements to the priority queue
        pq.offer(5);  // offer() is the preferred way to add elements
        pq.add(2);  // add() can also be used, but throws an exception if the queue is full (capacity restricted queues)
        pq.offer(8);
        pq.offer(1);
        pq.offer(10);


        System.out.println("Initial Priority Queue: " + pq); // Output: [1, 2, 8, 5, 10] (Order may vary slightly due to heap implementation)

        // Insert a new element (e.g., 7)
        int newElement = 7;
        pq.offer(newElement);


        System.out.println("Priority Queue after inserting " + newElement + ": " + pq); // Output: [1, 2, 7, 5, 10, 8] (Order may vary slightly)


        // Example with a max-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a); // Comparator for max-heap

        maxHeap.offer(5);
        maxHeap.offer(2);
        maxHeap.offer(8);
        maxHeap.offer(1);
        maxHeap.offer(10);

        System.out.println("Initial Max-Heap: " + maxHeap);

        int newElementMaxHeap = 7;
        maxHeap.offer(newElementMaxHeap);

        System.out.println("Max-Heap after inserting " + newElementMaxHeap + ": " + maxHeap);


        // Important Note:  Elements are stored based on their natural ordering (for Integers, smaller values have higher priority) or using a custom Comparator (as shown with the max-heap). The `peek()` method retrieves the highest priority element (without removing it), and `poll()` retrieves and removes the highest priority element.
        System.out.println("Highest priority element (min-heap): " + pq.peek()); // Output: 1
        System.out.println("Highest priority element (max-heap): " + maxHeap.peek()); // Output 10

    }
}
