import java.util.ArrayList;
import java.util.List;

public class SearchArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");

        // Search for a specific item (e.g., "Orange")
        String searchItem = "Orange"; 

        // Method 1: Using contains()
        if (fruits.contains(searchItem)) {
            System.out.println(searchItem + " found in the ArrayList.");
        } else {
            System.out.println(searchItem + " not found in the ArrayList.");
        }


        // Method 2: Using indexOf()  (also gets the index)
        int index = fruits.indexOf(searchItem);

        if (index != -1) { // indexOf returns -1 if not found
            System.out.println(searchItem + " found at index " + index);
        } else {
            System.out.println(searchItem + " not found in the ArrayList.");
        }



        // Example with an integer ArrayList:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(15);

        int searchNumber = 25;
        if (numbers.contains(searchNumber)) {  // contains() works with other types too
            System.out.println(searchNumber + " found in the number list.");
        } else {
            System.out.println(searchNumber + " not found in the number list.");
        }



        // Searching for an item that's not present:
        String notPresentItem = "Pineapple";
        if (fruits.contains(notPresentItem)) {
            System.out.println(notPresentItem + " found in the ArrayList.");
        } else {
            System.out.println(notPresentItem + " not found in the ArrayList.");
        }

    }
}
