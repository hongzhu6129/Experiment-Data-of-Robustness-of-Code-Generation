import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a PriorityQueue of Strings
        PriorityQueue<String> colorQueue = new PriorityQueue<>();

        // Add colors to the queue
        colorQueue.add("Red");
        colorQueue.add("Green");
        colorQueue.add("Blue");
        colorQueue.add("Yellow");
        colorQueue.add("Orange");


        // Print the elements of the priority queue
        System.out.println("Elements of the Priority Queue:");

        // Method 1: Iterating using a while loop and poll() (destructive)
        //  This removes elements from the queue
        /*
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll()); 
        }
        */

        // Method 2: Iterating using a for-each loop (non-destructive)
        for (String color : colorQueue) {
            System.out.println(color);
        }

         //Method 3: Using toString() method (non-destructive)
        // System.out.println(colorQueue.toString()); //Less readable format.
    }
}
