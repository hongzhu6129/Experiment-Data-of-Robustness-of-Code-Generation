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
            System.out.println(searchElement + " is present in the ArrayList at index " + numbers.indexOf(searchElement));
        } else {
            System.out.println(searchElement + " is not present in the ArrayList.");
        }


        // Search for an element using a loop (alternative method)
        int elementToFind = 5;
        boolean found = false;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == elementToFind) {
                System.out.println(elementToFind + " found at index " + i + " using loop.");
                found = true;
                break; // Exit the loop once the element is found
            }
        }
        if (!found) {
            System.out.println(elementToFind + " not found using loop.");
        }


       //Example with Strings (showing case-sensitivity)
       List<String> names = new ArrayList<>();
       names.add("Alice");
       names.add("Bob");
       names.add("Charlie");

       String nameToFind = "bob"; // Note: lowercase "b"


       if (names.contains(nameToFind)) { // contains() is case-sensitive
           System.out.println(nameToFind + " found (case-sensitive).");
       } else {
           System.out.println(nameToFind + " not found (case-sensitive).");
       }

        // Case-insensitive search (one approach)
        String nameToFindIgnoreCase = "bob";
        boolean foundIgnoreCase = false;

        for (String name : names) {
            if (name.equalsIgnoreCase(nameToFindIgnoreCase)) {
                System.out.println(nameToFindIgnoreCase + " found (case-insensitive).");
                foundIgnoreCase = true;
                break;
            }
        }
        if(!foundIgnoreCase){
             System.out.println(nameToFindIgnoreCase + " not found (case-insensitive).");

        }




    }
}
