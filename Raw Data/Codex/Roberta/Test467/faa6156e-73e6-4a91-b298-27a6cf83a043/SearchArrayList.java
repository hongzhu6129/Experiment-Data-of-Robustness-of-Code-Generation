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

        // Element to search for
        String searchElement = "Orange";

        // Search for the element using contains()
        if (fruits.contains(searchElement)) {
            System.out.println(searchElement + " is found in the ArrayList at index " + fruits.indexOf(searchElement));
        } else {
            System.out.println(searchElement + " is not found in the ArrayList.");
        }


        // Search for an element that doesn't exist.
        searchElement = "Pineapple";
        if (fruits.contains(searchElement)) {
            System.out.println(searchElement + " is found in the ArrayList at index " + fruits.indexOf(searchElement));
        } else {
            System.out.println(searchElement + " is not found in the ArrayList.");
        }


        //Demonstrate searching for an integer in an ArrayList of Integers

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(15);

        int searchNumber = 25;

        if (numbers.contains(searchNumber)) {
            System.out.println(searchNumber + " is found in the ArrayList at index " + numbers.indexOf(searchNumber));
        } else {
            System.out.println(searchNumber+ " is not found in the ArrayList.");
        }
    }
}
