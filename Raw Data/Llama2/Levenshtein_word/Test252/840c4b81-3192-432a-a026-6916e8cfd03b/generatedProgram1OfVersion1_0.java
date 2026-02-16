import java.util.PriorityQueue;

public class PriorityQueueFirstElement {

    public static void main(String[] args) {
        // Create a PriorityQueue of integers (you can change the data type as needed)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add some elements to the PriorityQueue
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(4);
        priorityQueue.offer(2);

        // Check if the PriorityQueue is empty before retrieving the first element
        if (!priorityQueue.isEmpty()) {
            // Retrieve the first element (smallest element in a min-heap)
            int firstElement = priorityQueue.peek(); 

            // Print the first element
            System.out.println("First element: " + firstElement); 
        } else {
            System.out.println("PriorityQueue is empty.");
        }
    }
}
