import java.util.ArrayList;
import java.util.List;

public class IterateArrayList {

    public static void main(String[] args) {

        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");

        // Method 1: Using a for loop with index
        System.out.println("Iterating using for loop with index:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Method 2: Using an enhanced for loop (for-each loop)
        System.out.println("\nIterating using enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Method 3: Using a while loop with iterator (less common but demonstrates iterator usage)
        System.out.println("\nIterating using while loop with iterator:");
        java.util.Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }


        // Method 4: Using Java 8 Stream API and forEach (more advanced)
        System.out.println("\nIterating using Java 8 Stream API:");
        fruits.stream().forEach(System.out::println);  // Using method reference
        // Or
        // fruits.stream().forEach(fruit -> System.out.println(fruit)); // Using lambda expression


    }
}
