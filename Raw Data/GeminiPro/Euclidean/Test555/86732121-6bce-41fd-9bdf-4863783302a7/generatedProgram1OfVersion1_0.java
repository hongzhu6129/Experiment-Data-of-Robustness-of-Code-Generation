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


        // 1. Using a for loop with index:
        System.out.println("Iterating using for loop with index:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println("\n"); // Add a newline for clarity


        // 2. Using an enhanced for loop (for-each loop):
        System.out.println("Iterating using enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        System.out.println("\n"); // Add a newline for clarity


        // 3. Using a while loop:
        System.out.println("Iterating using while loop:");
        int i = 0;
        while (i < fruits.size()) {
            System.out.println(fruits.get(i));
            i++;
        }

        System.out.println("\n"); // Add a newline for clarity

        // 4. Using Java 8 Streams and forEach:  (More advanced, but concise)
        System.out.println("Iterating using Java 8 streams:");
        fruits.stream().forEach(System.out::println);



        System.out.println("\n"); // Add a newline for clarity


        // 5. Using an Iterator:
        System.out.println("Iterating using an Iterator:");
        java.util.Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
