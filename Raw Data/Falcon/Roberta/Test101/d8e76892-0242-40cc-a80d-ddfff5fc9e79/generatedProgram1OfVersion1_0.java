import java.util.List;
import java.util.ArrayList;

public class CheckElementInList {

    public static void main(String[] args) {
        // Create a sample list (you can replace this with your actual list)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(15);
        numbers.add(30);


        // Element to search for
        int elementToFind = 15;

        // Check if the element exists in the list
        boolean found = numbers.contains(elementToFind);

        // Print the result
        if (found) {
            System.out.println(elementToFind + " exists in the list.");
        } else {
            System.out.println(elementToFind + " does not exist in the list.");
        }


        // Example with a String list
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String nameToFind = "Bob";
        boolean nameFound = names.contains(nameToFind);

        if (nameFound) {
            System.out.println(nameToFind + " exists in the list.");
        } else {
            System.out.println(nameToFind + " does not exist in the list.");
        }



        // Example demonstrating handling null lists gracefully
        List<Double> nullList = null;
        double doubleToFind = 3.14;
        if(nullList != null && nullList.contains(doubleToFind) ){ // important null check!
            System.out.println(doubleToFind + " found in the list.");
        } else if (nullList == null) {
             System.out.println("The list is null.");
        } else {
            System.out.println(doubleToFind + " not found in the list.");
        }

    }
}
