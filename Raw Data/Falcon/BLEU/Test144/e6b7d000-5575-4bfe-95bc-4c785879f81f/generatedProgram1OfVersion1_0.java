import java.util.LinkedList;
import java.util.Queue;

public class InsertIntoQueue {

    public static void main(String[] args) {
        // Create a queue (using LinkedList for implementation)
        Queue<Integer> queue = new LinkedList<>();

        // Add some initial elements (optional)
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        // Element to insert
        int elementToInsert = 15;

        // Insert the element (at the rear of the queue)
        queue.offer(elementToInsert);

        // Print the updated queue
        System.out.println("Queue after insertion: " + queue);


        // Example of inserting at a specific position (more complex - not typically "queue" behavior)
        int insertPosition = 2; // Insert at index 2 (0-based)
        insertAtPosition(queue, 55, insertPosition); // Insert 55 at position 2
        System.out.println("Queue after targeted insertion: " + queue); // Show updated queue

    }

    // Helper function to insert at a specific position (not standard queue operation)
    public static <T> void insertAtPosition(Queue<T> queue, T element, int position) {
        if (position < 0 || position > queue.size()) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (position == queue.size()) {
            queue.offer(element); // Just add to the end (standard offer)
            return;
        }

        LinkedList<T> tempList = new LinkedList<>(queue);
        tempList.add(position, element);
        queue.clear();
        queue.addAll(tempList);

    }


}
