import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListExample {

    public static void main(String[] args) {

        // 1. Creating an ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        numbers.add(4);


        System.out.println("Unsorted ArrayList: " + numbers);


        // 2. Sorting using Collections.sort() - Natural Ordering (Ascending)
        Collections.sort(numbers); 

        System.out.println("Sorted ArrayList (Ascending): " + numbers);



        // 3. Sorting using Collections.sort() with a Comparator (Descending)
        Collections.sort(numbers, Collections.reverseOrder()); // For descending order

        System.out.println("Sorted ArrayList (Descending): " + numbers);



        // Example with Strings:
        List<String> names = new ArrayList<>();
        names.add("Zebra");
        names.add("Apple");
        names.add("Banana");
        names.add("Cat");

        System.out.println("\nUnsorted String ArrayList: " + names);

        Collections.sort(names); // Sorts strings alphabetically (lexicographically)
        System.out.println("Sorted String ArrayList: " + names);



        // 4. Sorting using a custom Comparator (Example: Sorting by string length)

        // We'll demonstrate using a lambda expression for a concise Comparator
        Collections.sort(names, (s1, s2) -> Integer.compare(s1.length(), s2.length()));


        System.out.println("Sorted String ArrayList by length: " + names);

         // Using a more traditional approach (anonymous inner class) for a custom Comparator:
        /*
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length()); // Compare by length
            }
        });
         */

    }
}
