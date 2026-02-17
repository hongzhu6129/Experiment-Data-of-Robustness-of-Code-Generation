import java.util.ArrayList;
import java.util.List;

public class EmptyArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> myList = new ArrayList<>();

        // Add some elements to the list
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

        System.out.println("Original list: " + myList);

        // Empty the ArrayList using the clear() method
        myList.clear();

        System.out.println("List after clearing: " + myList);


        //Demonstrate another way to empty the list (create a new, empty list)
        List<String> anotherList = new ArrayList<>();

        anotherList.add("one");
        anotherList.add("two");

        System.out.println("Another list before reassignment: " + anotherList);


        anotherList = new ArrayList<>(); // Creates a brand new empty list and assigns it to anotherList

        System.out.println("Another List after reassigning a new empty list: " + anotherList);



    }
}
