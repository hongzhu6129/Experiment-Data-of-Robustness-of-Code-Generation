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

        // Print the elements. They will be in alphabetical order.
        System.out.println("Elements in the priority queue:");

        // Method 1: Iterate using enhanced for loop (preferred as it doesn't remove elements)
        for (String color : colorQueue) {
            System.out.println(color);
        }


        // Method 2: Using poll() to remove and print elements (modifies the queue)
        /*
        System.out.println("Elements (using poll()):"); 
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll());
        }
        */



        //Method 3: Using toString() (less readable for large queues)
        //System.out.println("Elements (using toString()): " + colorQueue);





    }
}
