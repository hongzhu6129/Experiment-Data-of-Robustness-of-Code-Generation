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

        // Method 1: Iterate using enhanced for loop (recommended)
        for (String color : colorQueue) {
            System.out.println(color);
        }

        // Method 2:  Iterate using iterator (less common for PriorityQueues)
        // While this works, keep in mind that using an iterator with a PriorityQueue 
        // does *not* guarantee the elements are retrieved in priority order.
        /*
        Iterator<String> iterator = colorQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        */

        // Method 3:  Continuously poll (removes elements!)
        /*
        System.out.println("Polling elements (removes them):");
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll());
        } 
        */
    }
}
