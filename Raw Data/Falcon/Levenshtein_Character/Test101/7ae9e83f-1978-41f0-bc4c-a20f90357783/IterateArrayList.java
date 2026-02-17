import java.util.ArrayList;
import java.util.List;

public class IterateArrayList {

    public static void main(String[] args) {

        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();

        // Add some elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");

        System.out.println("Iterating using a for loop:");
        // Iterate using a basic for loop
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println("\nIterating using an enhanced for loop (for-each loop):");
        // Iterate using an enhanced for loop (for-each loop)
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        System.out.println("\nIterating using a while loop:");
        // Iterate using a while loop
        int i = 0;
        while (i < fruits.size()) {
            System.out.println(fruits.get(i));
            i++;
        }


        System.out.println("\nIterating using a Java 8 Stream and forEach:");
        //Iterate using a Java 8 stream (requires Java 8 or later).
        fruits.stream().forEach(System.out::println);

        System.out.println("\nIterating using an Iterator:");
        // Iterate using an Iterator
        java.util.Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);

        }


        System.out.println("\nIterating using a ListIterator:");
        // Iterate using a ListIterator (allows backward traversal too)
        java.util.ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }



    }
}
