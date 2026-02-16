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


        // Print the elements of the priority queue.  Note: This does *not* remove elements.
        System.out.println("Elements of the priority queue: " + colorQueue);


        // To print and remove elements one by one, you would typically use a loop with poll():
        System.out.println("\nRemoving elements one by one using poll():");
        while (!colorQueue.isEmpty()) {
            String color = colorQueue.poll(); // Retrieves and removes the head (highest priority)
            System.out.println(color);
        }



    }
}
