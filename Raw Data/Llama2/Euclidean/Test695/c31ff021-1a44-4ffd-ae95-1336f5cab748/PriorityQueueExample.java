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


        // Print the elements of the priority queue (natural ordering - alphabetical)
        System.out.println("Elements of the priority queue:");

        // Method 1:  Iterating (this removes elements!)
        //while (!colorQueue.isEmpty()) {
        //    System.out.println(colorQueue.poll()); 
        //}

        // Method 2: Using enhanced for loop (iterator - doesn't remove)
        for (String color : colorQueue) {
            System.out.println(color);
        }

        // Method 3:  forEach (lambda expression - doesn't remove)
        // colorQueue.forEach(System.out::println);


        //If you want to see what the queue looks like *after* printing using method 1 (polling):
        //System.out.println("Queue after polling: " + colorQueue); // Will be empty!
    }
}
