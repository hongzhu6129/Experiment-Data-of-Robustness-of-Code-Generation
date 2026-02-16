import java.util.ArrayList;
import java.util.List;

public class EmptyArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");

        // Print the initial ArrayList
        System.out.println("Initial ArrayList: " + arrayList);

        // Empty the ArrayList using the clear() method
        arrayList.clear();

        // Print the ArrayList after clearing
        System.out.println("ArrayList after clearing: " + arrayList);


        //Alternative method demonstrating creating a new empty list (less efficient)
        List<String> anotherList = new ArrayList<>();

        anotherList.add("one");
        anotherList.add("two");

        System.out.println("Another list before emptying: " + anotherList);

        anotherList = new ArrayList<>(); // Assign a new empty ArrayList

        System.out.println("Another List after emptying by creating new list: " + anotherList);



    }
}
