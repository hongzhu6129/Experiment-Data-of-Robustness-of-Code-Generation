import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a PriorityQueue of Strings
        PriorityQueue<String> colorQueue = new PriorityQueue<>();

        // Add some colors
        colorQueue.offer("Red");
        colorQueue.offer("Green");
        colorQueue.offer("Blue");
        colorQueue.offer("Yellow");
        colorQueue.offer("Orange");


        // Print the elements of the priority queue
        System.out.println("Elements of the priority queue:");

        // Method 1: Iterate using iterator (preserves queue)
        System.out.println("Using iterator:");
        for (String color : colorQueue) { // Enhanced for loop uses iterator implicitly
            System.out.println(color);
        }

        // Method 2: Iterate using poll() which removes elements (empties queue after printing)
        System.out.println("\nUsing poll():");
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll());
        }


        //Repopulate the queue to demonstrate toString()
        colorQueue.offer("Red");
        colorQueue.offer("Green");
        colorQueue.offer("Blue");
        colorQueue.offer("Yellow");
        colorQueue.offer("Orange");


        // Method 3: using toString()  (preserves queue)
        System.out.println("\nUsing toString():");
        System.out.println(colorQueue.toString()); // Note: The order might not be strictly alphabetical

         // Important Note: A PriorityQueue does not guarantee a fully sorted order when iterating.
        // It only guarantees that the head (element retrieved by peek() or poll()) is the smallest element according to natural ordering (or a provided Comparator).

    }
}

