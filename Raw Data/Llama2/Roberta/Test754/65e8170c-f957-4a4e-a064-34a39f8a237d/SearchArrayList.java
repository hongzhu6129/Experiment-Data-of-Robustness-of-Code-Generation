import java.util.ArrayList;
import java.util.List;

public class SearchArrayList {

    public static void main(String[] args) {

        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(30);
        numbers.add(15);

        // Element to search for
        int searchElement = 25;


        // Method 1: Using contains()
        boolean found = numbers.contains(searchElement);
        if (found) {
            System.out.println(searchElement + " is present in the ArrayList.");
        } else {
            System.out.println(searchElement + " is not present in the ArrayList.");
        }


        // Method 2: Using indexOf() (to also get the index)
        int index = numbers.indexOf(searchElement);
        if (index != -1) {  // indexOf returns -1 if not found
            System.out.println(searchElement + " is present at index " + index);
        } else {
            System.out.println(searchElement + " is not present in the ArrayList.");
        }


        // Method 3: Manual search using a loop (for demonstration, contains() is more efficient)
        boolean foundManually = false;
        for (int number : numbers) {
            if (number == searchElement) {
                foundManually = true;
                break; // Exit the loop once found
            }
        }
        if (foundManually) {
            System.out.println(searchElement + " is present in the ArrayList (manual search).");
        } else {
            System.out.println(searchElement + " is not present in the ArrayList (manual search).");
        }



        // Search for a String in an ArrayList of Strings
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String searchName = "Bob";
        if (names.contains(searchName)) {
            System.out.println(searchName + " is in the names list.");
        } else {
            System.out.println(searchName + " is not in the names list.");
        }


    }
}
