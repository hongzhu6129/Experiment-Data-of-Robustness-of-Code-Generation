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


        // Print the elements of the PriorityQueue
        System.out.println("Elements of the Priority Queue:");

        // Method 1: Iterating through the queue (this removes elements)
        // while (!colorQueue.isEmpty()) {
        //     System.out.println(colorQueue.poll()); 
        // }

        // Method 2: Using enhanced for loop (also removes elements)
        //for (String color : colorQueue) {  
        //    System.out.println(color);
        //}


        // Method 3: Using toString() (non-destructive - keeps elements in queue)
        System.out.println(colorQueue);  // PriorityQueue uses natural ordering (alphabetical for Strings)


        // Method 4: Iterate without removing elements (Java 8+):
        // colorQueue.forEach(System.out::println);


        // Note about ordering:  Strings are sorted lexicographically (alphabetical order) by default. 
        // For custom objects, you would need to implement the Comparable interface or provide a Comparator to define the ordering.
    }
}
