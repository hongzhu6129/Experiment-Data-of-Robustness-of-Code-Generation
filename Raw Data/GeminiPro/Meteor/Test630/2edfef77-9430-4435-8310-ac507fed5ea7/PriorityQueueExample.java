import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a PriorityQueue of Strings (colors)
        PriorityQueue<String> colorQueue = new PriorityQueue<>();

        // Add some colors to the queue
        colorQueue.add("Red");
        colorQueue.add("Green");
        colorQueue.add("Blue");
        colorQueue.add("Yellow");
        colorQueue.add("Orange");


        // Print the elements of the priority queue
        System.out.println("Elements of the priority queue:");

        // Method 1: Iterate and remove (this removes elements from the queue)
        // while (!colorQueue.isEmpty()) {
        //     System.out.println(colorQueue.poll()); // poll() retrieves and removes the head
        // }


        // Method 2: Iterate without removing (preferred to keep the queue intact)
        for (String color : colorQueue) {
            System.out.println(color);
        }


        // Method 3: Using Java 8 Stream API (also doesn't remove elements)
        // colorQueue.stream().forEach(System.out::println);


         // Method 4:  Using a simple for loop with toArray (doesn't remove elements)
         // Object[] colorsArray = colorQueue.toArray();
         // for (int i = 0; i < colorsArray.length; i++) {
         //   System.out.println(colorsArray[i]);
         // }

    }
}
