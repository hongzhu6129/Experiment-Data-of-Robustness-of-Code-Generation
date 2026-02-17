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

        // Element to search for
        String searchElement = "orange";

        // Search for the element using contains()
        if (fruits.contains(searchElement)) {
            System.out.println(searchElement + " found at index " + fruits.indexOf(searchElement));
        } else {
            System.out.println(searchElement + " not found in the ArrayList");
        }


        // Example with integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int searchNumber = 30;

        if (numbers.contains(searchNumber)) {
             System.out.println(searchNumber + " found at index " + numbers.indexOf(searchNumber));
        } else {
            System.out.println(searchNumber + " not found in the ArrayList");
        }


        // Searching for an element that doesn't exist
        String nonExistentElement = "pineapple";
         if (fruits.contains(nonExistentElement)) {
            System.out.println(nonExistentElement + " found at index " + fruits.indexOf(nonExistentElement));
        } else {
            System.out.println(nonExistentElement + " not found in the ArrayList");
        }
    }
}
