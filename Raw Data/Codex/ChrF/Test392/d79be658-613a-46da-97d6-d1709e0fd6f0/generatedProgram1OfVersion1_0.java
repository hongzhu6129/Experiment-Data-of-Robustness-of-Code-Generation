import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateArrayList {

    public static void main(String[] args) {

        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grape");


        // Method 1: Using a for loop with get() method
        System.out.println("Using for loop with get():");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Method 2: Using an enhanced for loop (for-each loop)
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Method 3: Using an Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Method 4: Using Java 8 Streams and forEach
        System.out.println("\nUsing Java 8 Streams and forEach:");
        fruits.stream().forEach(System.out::println);


        //Method 5:  Using a while loop (less common but valid)
        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < fruits.size()) {
            System.out.println(fruits.get(i));
            i++;
        }



    }
}
