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


        // Print the elements using a while loop (recommended for PriorityQueues)
        System.out.println("Elements of the Priority Queue:");
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll()); // poll() retrieves and removes the head
        }


    }
}
