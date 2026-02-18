import java.util.ArrayList;
import java.util.List;

public class ArrayListSearch {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(15);
        numbers.add(30);

        // Element to search for
        int searchElement = 15;

        // Search for the element using contains()
        if (numbers.contains(searchElement)) {
            System.out.println(searchElement + " is present in the ArrayList.");
             //Find index if element exists
            int index = numbers.indexOf(searchElement);
            System.out.println("Index of " + searchElement + ": " + index);


        } else {
            System.out.println(searchElement + " is not present in the ArrayList.");
        }

        // Search for another element
        searchElement = 20; 

        if (numbers.contains(searchElement)) {
            System.out.println(searchElement + " is present in the ArrayList.");
        } else {
            System.out.println(searchElement + " is not present in the ArrayList.");
        }



        // Example using a loop and equals() for custom objects (if needed)
         List<String> strings = new ArrayList<>();
         strings.add("apple");
         strings.add("banana");
         strings.add("orange");

        String searchString = "banana";
        boolean found = false;
        for (String str : strings) {
            if (str.equals(searchString)) {
                found = true;
                break; // Exit the loop once the element is found
            }
        }

        if (found) {
             System.out.println(searchString + " is present in the ArrayList.");
              int index = strings.indexOf(searchString); //Get index if found
             System.out.println("Index of " + searchString + ": " + index);

        } else {
            System.out.println(searchString + " is not present in the ArrayList.");
        }


    }
}
