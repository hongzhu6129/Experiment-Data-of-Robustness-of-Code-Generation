import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayList {

    public static void main(String[] args) {

        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add some elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");


        // 1. Using a for loop with index:
        System.out.println("Using for loop with index:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        System.out.println();


        // 2. Using an enhanced for loop (for-each loop):
        System.out.println("Using enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println();



        // 3. Using an Iterator:
        System.out.println("Using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
        System.out.println();


        // 4. Using a ListIterator (allows forward and backward iteration):
        System.out.println("Using ListIterator (forward):");
        ListIterator<String> listIterator = fruits.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);

        }
        System.out.println();

        System.out.println("Using ListIterator (backward):");       
        while (listIterator.hasPrevious()) {  // Iterate backward
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }
        System.out.println();



        // 5. Using a while loop (similar to Iterator):
        System.out.println("Using while loop:");
        int i = 0;
        while (i < fruits.size()) {
            System.out.println(fruits.get(i));
            i++;
        }
        System.out.println();


        // 6. Using Java 8 Streams and forEach:  (More advanced)
        System.out.println("Using Java 8 Streams and forEach:");
        fruits.stream().forEach(System.out::println); // Method reference

    }
}
