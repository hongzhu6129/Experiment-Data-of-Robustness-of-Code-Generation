import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a PriorityQueue of Strings. By default, it uses natural ordering (alphabetical).
        PriorityQueue<String> colorQueue = new PriorityQueue<>();

        // Add some colors
        colorQueue.add("Red");
        colorQueue.add("Green");
        colorQueue.add("Blue");
        colorQueue.add("Yellow");
        colorQueue.add("Orange");

        // Print the elements.  They will be in alphabetical order due to natural ordering.
        System.out.println("Elements of the Priority Queue:");
        System.out.println(colorQueue);


        // Another way to print, removing elements one by one (which also removes them from the queue)
        System.out.println("\nPrinting and removing elements one by one:");
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll()); // poll() retrieves and removes the head
        }
    }
}
