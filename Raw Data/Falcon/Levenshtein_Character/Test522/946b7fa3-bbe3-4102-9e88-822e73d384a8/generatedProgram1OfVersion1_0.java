import java.util.ArrayList;
import java.util.List;

public class EmptyArrayList {

    public static void main(String[] args) {
        // Create an ArrayList
        List<String> myList = new ArrayList<>();

        // Add some elements (optional, just to demonstrate emptying)
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        System.out.println("Original List: " + myList);

        // Method 1: Using clear()
        myList.clear(); 

        System.out.println("List after clearing: " + myList);


        // Method 2:  Re-initialize the list (creates a new empty list)
        myList = new ArrayList<>(); //  If you don't want to modify the original reference, you can reassign it.

        System.out.println("List after re-initialization: " + myList);


        // Example if you have multiple references to the same list
        List<String> anotherReference = myList;

        // Clearing myList will also affect anotherReference (because they point to the same object)
        myList.clear();  
        System.out.println("anotherReference after clearing myList: " + anotherReference); 

        // Re-initializing myList will NOT affect anotherReference
        myList = new ArrayList<>();
        System.out.println("anotherReference after re-initializing myList: " + anotherReference);
        System.out.println("myList after re-initialization: " + myList);




    }
}
