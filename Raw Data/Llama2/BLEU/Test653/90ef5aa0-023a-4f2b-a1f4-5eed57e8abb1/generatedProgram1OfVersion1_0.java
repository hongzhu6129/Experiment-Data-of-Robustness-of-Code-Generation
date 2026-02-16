import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a PriorityQueue of Strings (colors)
        PriorityQueue<String> colorQueue = new PriorityQueue<>();

        // Add some colors
        colorQueue.add("Red");
        colorQueue.add("Green");
        colorQueue.add("Blue");
        colorQueue.add("Yellow");
        colorQueue.add("Orange");

        // Print the elements of the priority queue
        System.out.println("Elements of the priority queue:");

        // Method 1: Iterate using enhanced for loop (preferred as it avoids ConcurrentModificationException if queue is modified during iteration)
        for (String color : colorQueue) {
            System.out.println(color);
        }


        // The following method is  less preferred as it involves removing elements
        // Method 2: Iterate and remove elements using while loop
        /*
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll()); // poll() retrieves and removes the head
        }
        */


        // Note: Priority Queue stores elements in natural order (alphabetical for Strings)
        // unless a custom Comparator is provided during queue creation.
    }
}
