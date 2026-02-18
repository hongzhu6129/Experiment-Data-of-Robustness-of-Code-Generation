import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a PriorityQueue of Strings
        PriorityQueue<String> colorQueue = new PriorityQueue<>();

        // Add some colors to the queue
        colorQueue.add("Red");
        colorQueue.add("Green");
        colorQueue.add("Blue");
        colorQueue.add("Yellow");
        colorQueue.add("Orange");

        // Print the elements of the priority queue
        System.out.println("Elements of the Priority Queue:");
        //  Iterating directly over a PriorityQueue doesn't guarantee ordered retrieval. 
        //  We use .poll() in a loop to get elements in their natural order (alphabetical in this case for Strings).
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll()); 
        }

         // Demonstrating adding after initial printing (if needed)
        colorQueue.add("Purple");  // Adding after the queue was emptied
        colorQueue.add("Indigo");


        System.out.println("\nElements after adding more colors:");
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll());
        }

    }
}
