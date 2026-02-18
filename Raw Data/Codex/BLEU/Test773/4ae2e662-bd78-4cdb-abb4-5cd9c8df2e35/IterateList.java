import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateList {

    public static void main(String[] args) {

        // Create a list of strings (you can use any type)
        List<String> involvedList = new ArrayList<>();
        involvedList.add("element1");
        involvedList.add("element2");
        involvedList.add("element3");
        involvedList.add("element4");


        // 1. Using an enhanced for loop (for-each loop):  Simplest and most common
        System.out.println("Using enhanced for loop:");
        for (String element : involvedList) {
            System.out.println(element);
        }

        // 2. Using a basic for loop with an index:  More control over the iteration
        System.out.println("\nUsing basic for loop:");
        for (int i = 0; i < involvedList.size(); i++) {
            String element = involvedList.get(i);
            System.out.println(element);
        }

        // 3. Using an Iterator:  Flexible and allows removal of elements during iteration
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = involvedList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }



        // 4. Using Java 8 streams and forEach: Functional approach
        System.out.println("\nUsing Java 8 Stream forEach:");
        involvedList.stream().forEach(System.out::println); // Method reference
        // or
        //involvedList.stream().forEach(element -> System.out.println(element)); // Lambda expression


        //5. Using a ListIterator: Allows bidirectional traversal
        System.out.println("\nUsing ListIterator (forward):");
        ListIterator<String> listIterator = involvedList.listIterator();
        while(listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println(element);
        }

        System.out.println("\nUsing ListIterator (backward):");  // Demonstrating backward traversal
         while(listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
        }



    }
}
