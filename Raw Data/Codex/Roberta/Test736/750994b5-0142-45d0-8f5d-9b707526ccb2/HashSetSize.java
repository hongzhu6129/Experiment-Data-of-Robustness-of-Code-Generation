import java.util.HashSet;
import java.util.Set;

public class HashSetSize {

    public static void main(String[] args) {

        // 1. Create a HashSet
        Set<String> fruits = new HashSet<>();

        // 2. Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grape");


        // 3. Get the number of elements using the size() method
        int numberOfElements = fruits.size();

        // 4. Print the size
        System.out.println("The HashSet contains " + numberOfElements + " elements.");


        // Example demonstrating that duplicates are not counted
        fruits.add("Apple"); // Adding a duplicate
        System.out.println("After adding a duplicate, the size is: " + fruits.size()); // Size remains the same


        // Example showing how to check if a HashSet is empty
        Set<Integer> numbers = new HashSet<>();
        if (numbers.isEmpty()) {
            System.out.println("The 'numbers' HashSet is currently empty.");
        }

        numbers.add(1);
        numbers.add(2);

        if (!numbers.isEmpty()) {
            System.out.println("The 'numbers' HashSet now contains elements.");
        }


        // Example with different data types (Integer)
        Set<Integer> ages = new HashSet<>();
        ages.add(25);
        ages.add(30);
        ages.add(22);
        System.out.println("The 'ages' HashSet contains " + ages.size() + " elements.");

    }
}
