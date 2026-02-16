import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of integers (you can change the type as needed)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        numbers.add(4);

        System.out.println("Unsorted ArrayList: " + numbers);

        // Sort the ArrayList using Collections.sort()
        Collections.sort(numbers); 

        System.out.println("Sorted ArrayList: " + numbers);


        // Example with Strings:
        ArrayList<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");
        names.add("David");


        System.out.println("Unsorted ArrayList of Strings: " + names);
        Collections.sort(names);
        System.out.println("Sorted ArrayList of Strings: " + names);



        // Example sorting in reverse order (descending)
        ArrayList<Integer> moreNumbers = new ArrayList<>();
        moreNumbers.add(12);
        moreNumbers.add(3);
        moreNumbers.add(78);
        moreNumbers.add(2);

        System.out.println("Unsorted ArrayList: " + moreNumbers);

        Collections.sort(moreNumbers, Collections.reverseOrder()); // Reverse sort

        System.out.println("Sorted in reverse (descending) order: " + moreNumbers);



    }
}
