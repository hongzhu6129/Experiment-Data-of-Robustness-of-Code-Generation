import java.util.ArrayList;

public class TrimArrayList {

    public static void main(String[] args) {
        // Create an ArrayList with an initial capacity
        ArrayList<String> fruits = new ArrayList<>(20);

        // Add some elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        // Print initial capacity and size
        System.out.println("Initial Capacity: " + fruits.size());
        System.out.println("Initial Size: " + fruits.size());


        // Trim the capacity to the current size
        fruits.trimToSize();


        // Print capacity and size after trimming
        System.out.println("Capacity after trimToSize(): " + fruits.size()); // Note: There's no direct way to get capacity in Java ArrayList after Java 7. This will show the size, which will equal the capacity after trimToSize().
        System.out.println("Size after trimToSize(): " + fruits.size());


         //Adding more elements after trimming
        fruits.add("Mango");
        fruits.add("Pineapple");


        System.out.println("Capacity after adding more elements : " + fruits.size()); //size reflects the new, increased capacity as it's dynamically grown.
        System.out.println("Size after adding more elements: " + fruits.size());


    }
}
