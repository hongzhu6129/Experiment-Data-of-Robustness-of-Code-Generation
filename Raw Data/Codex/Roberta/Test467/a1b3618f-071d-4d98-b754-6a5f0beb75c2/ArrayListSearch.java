import java.util.ArrayList;
import java.util.List;

public class ArrayListSearch {

    public static void main(String[] args) {

        // 1. Creating an ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("kiwi");

        // 2. Searching using contains() method (checks if the element exists)
        String searchFruit1 = "banana";
        if (fruits.contains(searchFruit1)) {
            System.out.println(searchFruit1 + " is found in the list.");
        } else {
            System.out.println(searchFruit1 + " is not found in the list.");
        }


        String searchFruit2 = "mango";
        if (fruits.contains(searchFruit2)) {
            System.out.println(searchFruit2 + " is found in the list.");
        } else {
            System.out.println(searchFruit2 + " is not found in the list.");
        }

        // 3. Searching using indexOf() method (finds the index of the first occurrence)
        String searchFruit3 = "orange";
        int index = fruits.indexOf(searchFruit3);

        if (index != -1) { // indexOf returns -1 if not found
            System.out.println(searchFruit3 + " is found at index " + index);
        } else {
            System.out.println(searchFruit3 + " is not found in the list.");
        }


        // 4. Looping through and searching (useful for custom search logic or multiple occurrences)
        String searchFruit4 = "grape";
        boolean found = false;
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(searchFruit4)) {
                System.out.println(searchFruit4 + " is found at index " + i);
                found = true;
                // break; // Uncomment to stop after the first occurrence
            }
        }
        if (!found) {
            System.out.println(searchFruit4 + " is not found in the list.");
        }


        // 5.  Searching using enhanced for loop (more readable than traditional for loop)
         String searchFruit5 = "kiwi";
        found = false; // Reset found for this example

        for (String fruit : fruits) {
            if (fruit.equals(searchFruit5)) {
                System.out.println(searchFruit5 + " is found in the list."); // We don't get the index directly here
                found = true;
                break; // Stop after the first occurrence
            }
        }

        if (!found) {
            System.out.println(searchFruit5 + " is not found in the list.");
        }


    }
}
