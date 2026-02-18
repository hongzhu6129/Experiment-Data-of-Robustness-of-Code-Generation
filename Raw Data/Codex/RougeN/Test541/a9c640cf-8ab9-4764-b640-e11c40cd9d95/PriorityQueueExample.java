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
        System.out.println("Elements of the priority queue:");
        System.out.println(colorQueue); 

        // You can also iterate through the queue (but it won't be in priority order necessarily if you iterate directly)
        //  It's recommended to use poll() to retrieve elements in order.
        /*
        System.out.println("Iterating through the queue (may not be in priority order):");
        for (String color : colorQueue) {
            System.out.println(color);
        }
        */

        System.out.println("Retrieving elements in priority order using poll():");
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll());
        }
    }
}
