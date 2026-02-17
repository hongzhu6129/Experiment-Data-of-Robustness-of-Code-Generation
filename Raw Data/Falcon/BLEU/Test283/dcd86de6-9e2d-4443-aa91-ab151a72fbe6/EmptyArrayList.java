import java.util.ArrayList;
import java.util.List;

public class EmptyArrayList {

    public static void main(String[] args) {

        // Create an ArrayList of Strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        System.out.println("Original ArrayList: " + fruits);


        // Method 1: Using clear()
        fruits.clear(); 
        System.out.println("ArrayList after clear(): " + fruits);


        //  Re-populate the list for the next example
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Kiwi");


        // Method 2: Creating a new ArrayList (less efficient but useful in some cases)
        fruits = new ArrayList<>(); // This creates a brand new, empty list, discarding the old one.
        System.out.println("ArrayList after creating a new one: " + fruits);



        // Re-populate for the final example
        fruits.add("Strawberry");
        fruits.add("Blueberry");
        fruits.add("Raspberry");


        // Method 3: Using removeAll() (useful when you want to remove a specific set of elements or empty based on a condition)
        fruits.removeAll(fruits); //  Remove all elements that are in 'fruits' (which is all of them)
        System.out.println("ArrayList after removeAll(): " + fruits);
    }
}
