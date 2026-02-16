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

        // Method 1:  Iterate using a while loop and remove elements
        /*  while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll()); // poll() retrieves and removes the head
         }
         */


        // Method 2: Enhanced for loop (This won't modify the queue)
        for (String color : colorQueue) {
            System.out.println(color);
        }



        //Method 3:  Using Java 8 Stream API (This also won't modify the queue)
        /* colorQueue.forEach(System.out::println); */




    }
}
