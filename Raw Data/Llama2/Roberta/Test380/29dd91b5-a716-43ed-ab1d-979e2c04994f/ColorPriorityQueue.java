import java.util.PriorityQueue;

public class ColorPriorityQueue {

    public static void main(String[] args) {
        // Create a PriorityQueue of Strings (colors)
        PriorityQueue<String> colorQueue = new PriorityQueue<>();

        // Add some colors
        colorQueue.offer("Red");
        colorQueue.offer("Green");
        colorQueue.offer("Blue");
        colorQueue.offer("Yellow");
        colorQueue.offer("Orange");


        // Print the elements of the PriorityQueue
        System.out.println("Colors in the priority queue:");

        // Method 1: Iterate and remove (this will empty the queue)
        /*
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll()); // poll() retrieves and removes the head
        }
        */

        // Method 2: Iterate without removing (preserves the queue)
        for (String color : colorQueue) {  // Enhanced for loop (for-each)
            System.out.println(color);
        }


        // or, Iterate using iterator explicitly without removing:
         /*
        Iterator<String> iterator = colorQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
         */


    }
}
