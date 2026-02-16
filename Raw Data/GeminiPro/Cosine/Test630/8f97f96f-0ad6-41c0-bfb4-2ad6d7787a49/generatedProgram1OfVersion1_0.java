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


        // Method 1: Print using enhanced for loop (recommended as it doesn't remove elements)
        System.out.println("Colors in the Priority Queue (using enhanced for):");
        for (String color : colorQueue) {
            System.out.println(color);
        }


        // Method 2: Print by polling (removes elements!)  Uncomment if you want to see this method.
        /*
        System.out.println("\nColors in the Priority Queue (using poll - removes elements):");
        while (!colorQueue.isEmpty()) {
            System.out.println(colorQueue.poll()); 
        }
        */
    }
}
