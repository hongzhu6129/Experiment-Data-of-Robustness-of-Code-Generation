import java.util.ArrayList;
import java.util.List;

public class ArrayListSearch {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("mango");


        // Search for an element using contains()
        String searchElement = "orange";
        if (fruits.contains(searchElement)) {
            System.out.println(searchElement + " found in the ArrayList");
        } else {
            System.out.println(searchElement + " not found in the ArrayList");
        }


        // Search for an element using indexOf() (returns index or -1 if not found)
        String searchElement2 = "grapefruit";
        int index = fruits.indexOf(searchElement2);

        if (index != -1) {
            System.out.println(searchElement2 + " found at index " + index);
        } else {
            System.out.println(searchElement2 + " not found in the ArrayList");
        }



        // Search for an element using a loop (for demonstration, contains() or indexOf() are generally preferred)
        String searchElement3 = "mango";
        boolean found = false;
        for (String fruit : fruits) {
            if (fruit.equals(searchElement3)) {
                found = true;
                break; // Exit loop once found
            }
        }

        if (found) {
            System.out.println(searchElement3 + " found using loop");
        } else {
            System.out.println(searchElement3 + " not found using loop");
        }
    }
}
