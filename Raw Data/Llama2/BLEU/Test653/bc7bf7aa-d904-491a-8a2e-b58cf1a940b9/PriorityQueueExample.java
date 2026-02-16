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

        // Print the elements of the priority queue
        System.out.println("Elements of the priority queue:");

        // Iterate and remove elements using poll() to maintain order.  
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll()); 
        }


        // Demonstrating offer() which is equivalent to add()
        colorQueue.offer("Purple");
        colorQueue.offer("Indigo");

        System.out.println("\nElements after adding more colors:");
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll());
        }




        // Demonstrating peek() (getting the head without removal)
        colorQueue.offer("Cyan");
        colorQueue.offer("Magenta");

        System.out.println("\nPeeking at the head:");
        System.out.println(colorQueue.peek()); // Shows the head without removing it
         System.out.println(colorQueue.peek()); // Still shows the same head


        System.out.println("\nRemaining elements after peeking:");
         while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll());
        }


    }
}
