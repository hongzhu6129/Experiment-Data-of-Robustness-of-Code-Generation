import java.util.LinkedList;
import java.util.Queue;

public class RetrieveFirstElementQueue {

    public static void main(String[] args) {
        // Create a queue (LinkedList implements the Queue interface)
        Queue<String> improveQueue = new LinkedList<>();

        // Add elements to the queue
        improveQueue.offer("element1");
        improveQueue.offer("element2");
        improveQueue.offer("element3");

        // Retrieve and print the first element (head) of the queue
        if (!improveQueue.isEmpty()) {  // Check if the queue is empty to avoid exceptions
            String firstElement = improveQueue.peek(); // peek() retrieves without removing
            System.out.println("First element: " + firstElement);


            // Alternatively, you can use poll() to retrieve and remove the first element:
           // String firstElementRemoved = improveQueue.poll(); 
           // System.out.println("First element (removed): " + firstElementRemoved);
           // System.out.println("Queue after removal: " + improveQueue);



        } else {
            System.out.println("The queue is empty.");
        }


    }
}
