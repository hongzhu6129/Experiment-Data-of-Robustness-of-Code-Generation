import java.util.ArrayList;
import java.util.List;

public class IterateArrayList {

    public static void main(String[] args) {

        // Create an ArrayList of Strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");


        System.out.println("Iterating using a for loop (index-based):");
        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }

        System.out.println("\nIterating using an enhanced for loop (for-each loop):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        System.out.println("\nIterating using a while loop (index-based):");
        int i = 0;
        while (i < fruits.size()) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
            i++;
        }

        System.out.println("\nIterating using Java 8 streams and forEach:");
        fruits.stream().forEach(System.out::println);


        System.out.println("\nIterating using an Iterator:");
        java.util.Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }


        System.out.println("\nIterating using a ListIterator (allows forward and backward traversal):");

        java.util.ListIterator<String> listIterator = fruits.listIterator();
        System.out.println("Forward traversal:");
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }

        System.out.println("\nBackward traversal:");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }


    }
}
