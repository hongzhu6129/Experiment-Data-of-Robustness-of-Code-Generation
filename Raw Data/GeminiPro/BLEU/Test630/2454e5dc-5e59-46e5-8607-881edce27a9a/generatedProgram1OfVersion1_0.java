import java.util.PriorityQueue;

public class PriorityQueueColors {

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
        System.out.println("Colors in the priority queue:");

        // Method 1: Iterate using enhanced for loop (recommended)
        for (String color : colorQueue) {
            System.out.println(color);
        }

        //Method 2: Iterate while removing elements (be careful as it modifies the queue)
        // PriorityQueue<String> tempQueue = new PriorityQueue<>(colorQueue); // Create a copy if you want to preserve the original queue.
       /* while (!tempQueue.isEmpty()) {
            System.out.println(tempQueue.poll()); 
        }*/



    }
}
