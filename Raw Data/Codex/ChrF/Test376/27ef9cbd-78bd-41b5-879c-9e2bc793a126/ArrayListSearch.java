import java.util.ArrayList;
import java.util.List;

public class ArrayListSearch {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Element to search for
        int target = 30;

        // Search for the element using contains()
        if (numbers.contains(target)) {
            System.out.println(target + " is found in the ArrayList at index " + numbers.indexOf(target));
        } else {
            System.out.println(target + " is not found in the ArrayList");
        }



        // Example using a loop for a more manual search (and handling duplicates)
         target = 20; // Search for a different number (or same to demonstrate duplicate handling)
        boolean found = false;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target) {
                System.out.println(target + " is found at index " + i);
                found = true;
                // Comment out the break if you want to find all occurrences
                // break; 
            }
        }
        if (!found) {
            System.out.println(target + " is not found in the ArrayList");
        }



         //Search for a String in an ArrayList of Strings
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String targetName = "Bob";

         if (names.contains(targetName)) {
            System.out.println(targetName + " is found in the ArrayList at index " + names.indexOf(targetName));
        } else {
            System.out.println(targetName + " is not found in the ArrayList");
        }

    }
}
