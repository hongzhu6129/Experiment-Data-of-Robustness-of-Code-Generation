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


        // Print out the elements of the priority queue (natural ordering - alphabetical)
        System.out.println("Elements of the priority queue:");
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll()); // poll() retrieves and removes the head
        }

       
    }
}
