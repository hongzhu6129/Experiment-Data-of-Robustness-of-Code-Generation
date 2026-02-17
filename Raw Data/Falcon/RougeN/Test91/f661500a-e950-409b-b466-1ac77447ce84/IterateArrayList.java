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


        // Method 1: Using a for loop with an index
        System.out.println("Using for loop with index:");
        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }

        // Method 2: Using an enhanced for loop (for-each loop)
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        // Method 3: Using a while loop with an index
        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < fruits.size()) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
            i++;
        }
         //Method 4: Using the forEach method with a lambda expression (Java 8 and later)
        System.out.println("\nUsing forEach with lambda:");
        fruits.forEach(fruit -> System.out.println(fruit));


        // Method 5: Using an Iterator
        System.out.println("\nUsing Iterator:");
        java.util.Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }


        // Example with an ArrayList of Integers:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("\nIterating through an ArrayList of Integers:");
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
