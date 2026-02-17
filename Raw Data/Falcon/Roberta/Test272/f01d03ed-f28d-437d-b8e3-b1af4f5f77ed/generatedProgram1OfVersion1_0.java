import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a PriorityQueue of Strings
        PriorityQueue<String> colorQueue = new PriorityQueue<>();

        // Add some colors
        colorQueue.add("Red");
        colorQueue.add("Green");
        colorQueue.add("Blue");
        colorQueue.add("Yellow");
        colorQueue.add("Orange");


        // Print the elements of the PriorityQueue.  Note: they will be in natural order (alphabetical)
        System.out.println("Elements of the priority queue:");

        // Method 1:  Iterate while removing elements (this empties the queue)
        /*
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll());  // poll() retrieves and removes the head
        }
        */

        // Method 2: Iterate without removing elements (preferred if you want to keep the queue intact).
        for (String color : colorQueue) {
            System.out.println(color);
        }


       // Method 3:  Using a Java 8 Stream (also keeps queue intact)
        // colorQueue.stream().forEach(System.out::println);



    }
}
