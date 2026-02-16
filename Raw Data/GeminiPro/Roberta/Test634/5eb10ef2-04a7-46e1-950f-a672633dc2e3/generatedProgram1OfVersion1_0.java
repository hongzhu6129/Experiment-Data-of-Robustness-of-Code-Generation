import java.util.PriorityQueue;

public class ClearPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue of integers
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add some elements to the PriorityQueue
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(10);
        priorityQueue.add(3);

        // Print the initial PriorityQueue
        System.out.println("Initial PriorityQueue: " + priorityQueue);

        // Remove all elements from the PriorityQueue using clear()
        priorityQueue.clear();

        // Print the PriorityQueue after clearing
        System.out.println("PriorityQueue after clearing: " + priorityQueue);


        // Demonstrating another way to effectively clear (by creating a new, empty queue)
        priorityQueue = new PriorityQueue<>(); // This also clears the queue effectively.  The old queue will be garbage collected.
        System.out.println("PriorityQueue after re-initialization: " + priorityQueue);


        // Add elements again for further demonstration if needed
        priorityQueue.add(20);
        priorityQueue.add(15);
        System.out.println("PriorityQueue after adding new elements: " + priorityQueue);
    }
}
